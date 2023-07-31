package study.chap_12_thread;

import java.io.*;

// 파이프 스트림
// 프로세스 사이에 데이터 주고 받을 때 사용되는 기법
// 파이프를 통해 한 프로세스가 다른 프로세서 제어 가능

// 작업 순서 1 -> 2 -> 3 이 있다고 가정
// 1, 2, 3 이 동시에 작동한다면 하나라도 작업하고 있으면
// 다른 작업들은 쉬게 된다
// 이를 쓰레드로 병렬 처리하면 각 작업을 따로 할 수 있다
// 다만 작업이 끝나기 전까진 데이터가 블럭 처리되어야 한다
// 이런 경우에 파이프 스트림 사용

// 파이프 스트림에 사용되는 클래스는 자바 내부 라이브러리에 저장되어 있음
// 작업 라인 구성하고 각 작업을 연결할 때 파이프 스트림 클래스 사용

// https://javacan.tistory.com/entry/72

// 요약
// 파이프 스트림은 입력, 출력 스트림이 서로 연결되어 순차적으로 데이터를 처리,
// 그와 동시에 병렬처리로 각 작업을 돌아 각 작업이 쉬지 않게 하여
// 효율적으로 프로그램 가동

/**
 * 콘베이어 벨트 시뮬레이션 프로그램
 * 가열라인, 제조라인, 포장라인과 관련된 쓰레드를
 * 실행시킨다.
 */
public class ThreadPart2 {
    public static void main(String[] args) {
        // 가열 라인과 제조 라인 사이에 데이터를 주고 받을 때
        // 사용되는 파이프 스트림
        // 1 -> 2
        PipedOutputStream toProducingLine = null;
        PipedInputStream fromHeatingLine = null;
        
        // 제조 라인과 포장 라인 사이에 데이터를 주고 받을 때
        // 사용되는 파이프 스트림
        // 2 -> 3
        PipedOutputStream toPackingLine = null;
        PipedInputStream fromProducingLine = null;
        
        try {
            // 1 -> 2 파이프 스트림 연결
            toProducingLine = new PipedOutputStream();
            fromHeatingLine = new PipedInputStream(toProducingLine);
            
            // 2 -> 3 파이프 스트림 연결
            toPackingLine = new PipedOutputStream();
            fromProducingLine = new PipedInputStream(toPackingLine);
            
            // 각 작업 초기화, 파이프 스트림을 각 작업에 연결
            HeatingLine heating = new HeatingLine(toProducingLine);
            ProducingLine producing = new ProducingLine(
                                      fromHeatingLine, toPackingLine);
            PackingLine packing = new PackingLine(fromProducingLine);
            
            // 각 작업 시작
            // 멀티 쓰레드 작업 시작
            packing.start();
            producing.start();
            heating.start();
            
            try {
                packing.join(); // 포장 라인이 종료될 때 까지 기다린다.
            } catch(InterruptedException ex) { }
        } catch(IOException ex) {
            System.out.println("스트림 생성시 이상 발생:"+ex.getMessage());
        }
    }
}

// 가열 라인을 구현한 쓰레드
class HeatingLine extends Thread {
    
    // 1 -> 2 데이터 전달할 파이프 스트림
    private PipedOutputStream toProducingLine;
    
    // 초기화로 파이프 스트림을 받음
    HeatingLine(PipedOutputStream toProducingLine) {
        this.toProducingLine = toProducingLine;
    }
    
    public void run() {
        // 자원으로 사용할 데이터
        int[] sourceData = { 0x01, 0x02, 0x03, 0x04, 0x05, 
                              0x06, 0x07, 0x08, 0x09, 0x0a};
        
        try {
            for (int i = 0 ; i < sourceData.length ; i++) {
                // 제조 라인으로 원료 데이터 전송
                toProducingLine.write(sourceData[i]);
            }
            // 원료 없음을 나타내는 값인 '0'을 전송
            // 생산 라인에서 해당 값을 받으면 중지
            toProducingLine.write(0x00);
        } catch(IOException ex) {
            System.out.println("가열 라인에서 이상 발생:"+ex.getMessage());
        }
    }
}

// 생산 라인을 구현한 쓰레드
class ProducingLine extends Thread {
    
    // 1 -> 2 데이터 받을 파이프 스트림
    private PipedInputStream fromHeatingLine;
    // 2 -> 3 데이터 전달할 파이프 스트림
    private PipedOutputStream toPackingLine;
                  
    // 파이프 스트림 받아 작업 초기화
    ProducingLine(PipedInputStream fromHeatingLine, 
                  PipedOutputStream toPackingLine) {
        this.fromHeatingLine = fromHeatingLine;
        this.toPackingLine = toPackingLine;
    }
    
    public void run() {
        try {
            int dataFromHeating;
            int producingData;
            
            while(true) {
                // 가열 라인에서 데이터 받음
                dataFromHeating = fromHeatingLine.read();
                
                // 가열 라인에서 받은 데이터 가공처리
                producingData = dataFromHeating * 2;
                
                // 가공처리된 데이터 포장 라인에 전송
                toPackingLine.write(producingData);
                
                // 중지
                if (dataFromHeating == 0x00) {
                    break;
                }
            }
        } catch(IOException ex) {
            System.out.println("제조 라인에서 이상 발생:"+ex.getMessage());
        }
    }
}

// 포장 라인을 구현한 쓰레드
class PackingLine extends Thread {
    
    // 2 -> 3 데이터 받는 파이프 스트림
    private PipedInputStream fromProducingLine;
    
    // 파이프 스트림을 받아 작업 초기화
    PackingLine(PipedInputStream fromProducingLine) {
        this.fromProducingLine = fromProducingLine;
    }
    
    public void run() {
        int index = 1;
        try {
            int dataFromProducing;
            int finalData;
            
            while(true) {
                // 제조 라인에서 데이터 받음
                dataFromProducing = fromProducingLine.read();

                // 중지
                if (dataFromProducing == 0x00) {
                    break;
                }
                
                // 제조 라인에서 받은 데이터 포장처리
                finalData = dataFromProducing + 100;
                
                System.out.println((index++)+"번째 제품 = "+finalData);
            }
        } catch(IOException ex) {
            System.out.println("포장 라인에서 이상 발생:"+ex.getMessage());
        }
    }
}