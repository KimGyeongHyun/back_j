package study.chap_13_IO;

import java.io.IOException;
import java.util.Scanner;

// 자바 입출력과 스트림

// 입출력은 스트림을 통해 이루어짐
// 입력 스트림 : 파일의 자료를 읽을 때 사용
// FileInputStream, FileReader, BufferInputStream, BufferReader ..
// 출력 스트림 : 파일에 데이터 저장할 때 사용
// FileOutputStream, FileWriter, BufferOutputStream, BufferWriter ..
// 스트림은 단방향으로 데이터가 이동하므로 2개의 스트림으로 분리

// 바이트, 문자 단위 스트림
// 보통 바이트 단위로 입출력이 이뤄지지만
// char 는 2바이트이기 때문에 문자 스트림을 별도 제공한다
// 위의 스트림중 Reader, Writer 스트림이 문자 스트림

// 기반, 보조 스트림
// 기반 스트림 : 소스나 대상에서 직접 읽고 쓸 수 있음. 입출력 대상에 직접 연결
// 보조 스트림 : 다른 스트림에 부가적인 기능 제공
// 위의 스트림 중 File 스트림이 기반 스트림

// 표준 입출력
// 화면 입출력 클래스를 미리 정의해둠

// 자료형, 변수 이름, 설명
// static PrintStream, out, 표준 출력 스트림
// static InputStream, in, 표준 입력 스트림
// static OutputStream, err, 표준 오류 출력 스트림
// 모두 static(정적) 변수
// System.out : 표준 출력, System.in : 표준 입력용 스트림

// Scanner 클래스 (입력 클래스)
// 다양한 자료형 읽을 수 있음
// 파일이나 문자열을 생성자 매개변수로 받아 자료 읽어올 수 있음
// 매개변수에 따라 어떤 것을 받을지 지정
// 매개변수가 System.in 이라면 표준 입력으로부터 자료를 읽는다는 의미

// 백준 풀이에 사용된 객체

// StringBuilder
// String 객체는 변경 불가능. 변경 시 새 문자열 생성, 이전 문자는 버림
// StringBuilder 는 변경 가능한 문자열을 만들어줌

// BufferedReader, BufferedWriter
// 버퍼를 사용하지 않는 입력은 키보드 입력과 동시에 전달
// 버퍼 사용하는 입력은 버퍼가 가득 차거나 개행 문자 나타나면 전달
// 입출력 시간을 단축하기 위해 모아서 입출력함

// BufferedReader
// Scanner는 지원하는 메소드가 많음. 데이터 가공하는 작업 많이 들어감
// BufferedReader 는 String 만 받음
// 또한 Scanner 는 버퍼 사이즈가 1024 char 이기 때문에
// 많은 입력에 불리함
// (Scanner 는 동기화 X, 멀티 쓰레드 환경에서 사용 불가)
// StringTokenizer 로 String을 공백 단위로 구분

// BufferedWriter
// 많은 양의 출력을 할 땐 입력과 동일한 버퍼를 사용하는 것이 좋음

// InputStreamReader, OutputStreamWriter
// 바이트 스트림을 문자로 변환해 주는 보조 스트림
// 어떤 자료형식을 받을지 파라미터로 전달받음

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// StringTokenizer st = new StringTokenizer(br.readLine());

// 이외의 스트림에 대한 자세한 내용
// https://montoo.tistory.com/entry/JAVA-Basic-%EC%9E%90%EB%B0%94-%EC%9E%85%EC%B6%9C%EB%A0%A5

public class IO {
    public static void main(String[] args) throws IOException{
        // 예외전가 방법
        // 1. 관련 패키지 import (io.*, IOException)
        // 2. 입/출력 함수 정의부에 throws IOException 추가
        // 데이터의 끝을 확인할 때 IOException 처리

        // System.in.read()
        // 단일 문자 입력 (아스키코드 단위)
        // int 형으로 입력 받음. 적절한 형 변환 필요
        int val1, val2, val3;
        System.out.print("세 개의 캐릭터 입력 : ");
        val1 = System.in.read();
        val2 = System.in.read();
        val3 = System.in.read();

        System.out.println("입력 data : " + val1);
        System.out.println("입력 data : " + val2);
        System.out.println("입력 data : " + val3);

        // Scanner 
        // 객체 생성, 
        // next(), nextInt() 메소드 등으로 콘솔창의 값을 리턴
        // nextLine(), nextFloat() ...
        Scanner sc = new Scanner(System.in);
        int age; String name;
        System.out.println("이름 입력 : ");
        name = sc.next();
        System.out.println("나이 입력 : ");
        age = sc.nextInt();
        System.out.println("이름 : " + name + ", 나이 : " + age);
        sc.close();

        // System.out.printf()
        // 플래그를 이용해 변수의 값을 여러 형식으로 출력할 수 있는 메서드

        // 줄바꿈
        System.out.printf("안녕하세요.%n");
        // 문자, 문자열, 10진수 표현
        System.out.printf("%s%d%s", "지금은", 10, "시 입니다.");
        System.out.printf("%c%s입니다.", '홍', "길동");
        // 플래그 사용
        System.out.printf("지금 %,d원이 필요해", 100000);
        System.out.printf("%5d%n", 10);
        System.out.printf("%-5d%n", 10);
        System.out.printf("%05d%n", 10);


    }
}
