package study.chap_6_method;

public class MainMethod {

    public static void methodA() {System.out.println();}
    public static void methodB() {}
    public static void main(String[] args) {
        // 가장 처음으로 진입하는 메소드
        // 문자열 배열을 파라미터로 가져옴
        for (String s : args) System.out.println(s);
    }
}
