package study.chap_11_exception;

class FoolRuntimeException extends RuntimeException {}
class FoolException extends Exception {}

class Sample {

    // Exception 에러 발생
    // Exception 에러는 컴파일러 단에서 에러 발생하므로
    // try 문으로 묶음 (에러 처리도 동시에 함)
    public void sayNick1(String nick) {
        try {
            if("fool".equals(nick)) throw new FoolException();
            System.out.println("당신의 별명은 " + nick + " 입니다.");
        }
        catch(FoolException e) {System.err.println("Foolexception 발생");}
    }

    // RuntimeException 에러 발생
    // 예외 발생만 수행
    public void sayNick2(String nick) {
        if("fool".equals(nick)) throw new FoolRuntimeException();
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }

    // Exception 에러를 함수 선언부에서 throw
    // Exception 이라도 try catch 문을 강제하지 않음
    // 예외 발생만 수행
    public void sayNick3(String nick) throws FoolException {
        if("fool".equals(nick)) throw new FoolException();
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }
}

public class ExceptionPart {

    public static void main(String[] args) {
        // try{수행 코드}
        // catch(예외1) {예외1 발생 시 수행}
        // catch(예외2) {예외2 발생 시 수행}
        // finally {이후 반드시 실행되는 코드}
        // finally 는 예외에 상관없이 무조건 수행된다

        // Exception 은 RuntimeException, Exception 2개로 나뉨
        
        // RuntimeException
        // 실행시 발생하는 예외
        // NullPointer~, NoSuchElement, BufferOverflow, ...

        // Exception
        // 컴파일시 발생하는 예외
        // 예측 가능한 Checked Exception 이므로
        // 컴파일러가 예외처리 강제
        // IOException, FileNotFoundException

        // throws 로 예외 발생, try catch 문으로 예외 처리
        
        Sample sample = new Sample();

        // Exception
        // sample 단에서 예외 발생, 처리 동시에 함
        sample.sayNick1("fool");
        sample.sayNick1("genious");

        // RuntimeException
        // sample 에서 던진 예외를 main 메서드에서 처리
        try {
            sample.sayNick2("fool");
            sample.sayNick2("genious");
        }
        catch (FoolRuntimeException e) {System.err.println("FoolRuntimeException 발생");}

        // Sample 메서드에서 던진 예외를 main 메서드에서 처리
        try {
            sample.sayNick3("fool");
            sample.sayNick3("genious");
        }
        catch (FoolException e) {System.err.println("FoolException 발생");}

        // Transaction
        // 하나의 작업 단위

        // 보통 Transaction 하나에서 에러가 나면 모두 취소한다
        // Transaction 단위에서 예외 발생, 처리를 모두 하게 되면
        // 다른 Transaction 이 수행되는 등 예상치 못한 수행을 할 수 있음

        // 따라서 Transaction 단위에서 에러를 발생만 하고
        // 수행 단에서 모든 Transaction 에 예외처리를 하여
        // 하나라도 에러가 발생하면 모두 취소하게끔 구성한다
    }
}
