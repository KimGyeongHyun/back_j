package study.chap_11_exception;

class FoolException extends RuntimeException {}

class Sample {
    public void sayNick(String nick) {
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

        // Exception
        // 컴파일시 발생하는 예외
        
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("genious");

    }
}
