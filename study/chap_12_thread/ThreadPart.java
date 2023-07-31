package study.chap_12_thread;
import java.util.ArrayList;

class Thread0 extends Thread {
    // Thread 상속받으면 run 메서드 구현 필요
    public void run() {System.out.println("thread0");}
}

class Thread1 extends Thread {
    int seq;
    public Thread1(int seq) {this.seq = seq;}

    public void run() {
        System.out.println(this.seq + " thread start.");
        try {Thread.sleep(1000);}
        catch (Exception e) {}
        System.out.println(this.seq + " thread end.");
    }
}

// Thread 는 클래스이기 때문에 다른 클래스를 상속할 수 없다
// 따라서 인터페이스 Runnable 을 주로 사용함
class Thread2 implements Runnable  {
    int seq;
    public Thread2(int seq) {this.seq = seq;}

    public void run() {
        System.out.println(this.seq + " thread start.");
        try {Thread.sleep(1000);}
        catch(Exception e) {}
        System.out.println(this.seq + " thread end.");
    }
}

class MyThread extends Thread {

    // void run( ) : 스레드의 실행코드가 작성되는 메소드로 사용자는 run() 메소드를 오버라이드 하여 사용해야 합니다.
    // run() 이 종료되면 스레드는 종료된다.
    // void start( ) : 스레드가 시작되도록 요청하는 메소드로 JVM은 해당 스레드의 run() 메소드를 호출합니다. 
    // void interrupt( ) : 스레드를 중지 시킵니다. 
    // void join( ) : 이 스레드가 끝날때까지 기다립니다. 
    // void join(long millis) : 최대 millis 시간동안 이 스레드가 끝날때까지 기다립니다.
    // static void sleep(long millis) : millis 시간동안 현재 스레드를 일시중지시킵니다. 
    // static void yield( ) : 현재 스레드의 실행시간을 다른 스레드에게 양보합니다. 
    // static Thread currentThread( ) : 현재 실행중인 스레드 객체의 참조값을 반환합니다. 
    // long getId( ) : 스레드의 Id를 반환합니다. 
    // String getName( ) : 스레드의 이름을 반환합니다. 
    // int getPriority( ) : 스레드의 우선순위 값을 반환합니다. (우선순위 범위 : 1 ~ 10)
    // Thread.State getState( ) : 스레드의 state 값을 반환합니다.
    // ThreadGroup getThreadGroup( ) : 스레드가 속한 스레드 그룹을 반환합니다. 
    // static boolean interrupted( ) : 현재 스레드의 interrupted 여부를 반환합니다. 
    // boolean isInterrupted( ) : 이 스레드의 interrupted 여부를 반환합니다. 
    // boolean isAlive( ) : 이 스레드가 살아있는지 여부를 반환합니다. 
    // boolean isDaemon( ) : 이 스레드가 데몬 스레드인지 여부를 반환합니다. 
    // void setDaemon(boolean on) : 이 스레드를 데몬 스레드로 변경합니다.  
    // void setName(String name) : 이 스레드의 이름을 name으로 변경합니다. 
    // void setPriority(int newPriority) : 이 스레드의 우선순위를 newPriority로 변경합니다. 
    // String toString( ) : 이 스레드의 이름, 우선순위, 스레드그룹등의 정보를 담은 문자열을 반환합니

    // 새로운 스레드 객체 할당하여 이름을 string 으로 지정
    public MyThread(String string) {super(string);}

    // 스레드 start() 시 실행되는 스레드 메소드
    // 500 ms 단위로 스레드 이름을 출력
    // 위 수행을 최대 20번 반복
    // 중간에 인터럽트가 되면 반복을 멈춤
    public void run() {
        int count = 0;
        // 해당 스레드가 인터럽트 될 때까지 반복 수행
        while (!this.isInterrupted()) {
            // 해당 스레드에 지정된 이름 출력
            System.out.print(this.getName());
            // 해당 스레드를 500 ms 만큼 일시중지시킴
            ThreadPart.threadSleep(this, 500);
            count++;
            // 최대 20번 반복
            if (count == 20) {  // 20번 반복했다면
                this.interrupt();   // 해당 스레드 인터럽트 수행 (멈춤)
                System.out.printf("%n[5]." + this.toString() + "-인터럽트됨]");
            }
        }
    }
}

public class ThreadPart {

    // 쓰레드는 순서대로 실행되지 않기 때문에
    // 하나의 실행문의 실행 결과를 구하기 위해선
    // 나머지 코드를 제거해야 함

    // 스레드 t 를 time ms 만큼 일시중지시킴
    // InterruptedException 이 발생했다면 해당 쓰레드 인터럽트 시킴
    static void threadSleep(Thread t, long time) {
        // 현재 스레드를 time ms 만큼 일시중지시킴
        try {Thread.sleep(time);}
        catch(InterruptedException e) {
            System.out.printf("%n[4]." + t.toString() + "-인터럽트됨]");
            t.interrupt();
        }
    }

    // 스레드 t 가 종료될 때까지 기다리고 종료
    static void threadJoin(Thread t) {
        try {t.join();}
        catch(InterruptedException e) {e.printStackTrace();}
    }

    public static void main(String[] args) {

        // start()로 쓰레드 실행
        // Thread0 t0 = new Thread0();
        // t0.start();

        // for (int i = 0; i < 10; i++) {
        //     Thread1 t1 = new Thread1(i);
        //     t1.start();
        // }
        // System.out.println("main end.");
        // 쓰레드가 순서대로 실행되지 않고 
        // main 메서드가 먼저 종료되는 현상 확인

        // main end.
        // 0 thread start.
        // 6 thread start.
        // 7 thread start.
        // 3 thread start.
        // 1 thread start.
        // 2 thread start.
        // 4 thread start.
        // 9 thread start.
        // 8 thread start.
        // 5 thread start.
        // 6 thread end.
        // 0 thread end.
        // 7 thread end.
        // 3 thread end.
        // 2 thread end.
        // 1 thread end.
        // 4 thread end.
        // 9 thread end.
        // 8 thread end.
        // 5 thread end.

        // 생성된 쓰레드를 ArrayList 에 담음
        // ArrayList<Thread1> threads = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     Thread1 t = new Thread1(i);
        //     t.start();
        //     threads.add(t);
        // }

        // join() : main 메서드가 종료될 때까지 기다리게 함
        // 아래는 모든 쓰레드가 종료된 후에 main 메서드 종료하는 코드
        // for (int i = 0; i < threads1.size(); i++) {
        //     Thread t = threads1.get(i);
        //     try {t.join();}
        //     catch(Exception e) {}
        // }
        // System.out.println("main end.");
        // System.out.println();

        // 1 thread start.
        // 8 thread start.
        // 4 thread start.
        // 0 thread start.
        // 2 thread start.
        // 9 thread start.
        // 5 thread start.
        // 6 thread start.
        // 3 thread start.
        // 7 thread start.
        // 1 thread end.
        // 8 thread end.
        // 0 thread end.
        // 2 thread end.
        // 4 thread end.
        // 7 thread end.
        // 9 thread end.
        // 5 thread end.
        // 6 thread end.
        // 3 thread end.
        // main end.

        // 쓰레드가 종료되기 전에 다음 로직을 수행하게 만들면 안된다
        // 쓰레드가 종료된 후 그 다음 로직을 수행하려면 join 메서드 사용하기

        // Runnable
        // Thread 형식으로 만들고 인자를 Runnable 을 구현한 클래스 객체 사용
        // ArrayList<Thread> threads = new ArrayList<>();
        // for (int i= 0; i < 10; i++) {
        //     Thread t = new Thread(new Thread2(i));
        //     t.start();
        //     threads.add(t);
        // }

        // for (int i = 0; i < threads.size(); i++) {
        //     Thread t = threads.get(i);
        //     try {t.join();}
        //     catch(Exception e) {}
        // }
        // System.out.println("main end.");

        // mt1, mt2 쓰레드 생성
        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("#");
        // 각 쓰레드 이름 500ms 단위로 출력 시작
        mt1.start();
        mt2.start();

        // 시작하면서 mt1, mt2 의 인터럽트 여부 출력 (false, false)
        System.out.printf("%n[1].mt1:" + mt1.isInterrupted() + 
        ", mt2:" + mt2.isInterrupted() + "]");
        
        // 시작하는 동시에 실행중인 스레드를 참조하여
        // 2초 동안 딜레이 시킴
        // 
        threadSleep(Thread.currentThread(), 2000);
        // 2초 후 mt1 을 인터럽트 시킨다
        // mt1의 start() 메소드가 InterruptedException 예외에 의해 종료
        mt1.interrupt();
        // mt1, mt2 의 인터럽트 여부 출력 (true, false)
        System.out.printf("%n[2].mt1:" + mt1.isInterrupted() + 
        ", mt2:" + mt2.isInterrupted() + "]");
        
        // mt2 스레드가 20번 돌고 인터럽트 될 때까지 기다림
        threadJoin(mt2);
        System.out.printf("%n[3].mt1:" + mt1.isInterrupted() + 
        ", mt2:" + mt2.isInterrupted() + "]");
    }
}