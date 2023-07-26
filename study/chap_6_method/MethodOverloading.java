package study.chap_6;

public class MethodOverloading {

    // 메소드 이름이 같지만 파라미터가 다르면
    // 메소드를 다르게 구분하여 호출
    
    public static int getPower(int number) {return number * number;}

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exp) {
        return (int)Math.pow(number, exp);
    }
    public static void main(String[] args) {
        System.out.println(getPower("5"));
        System.out.println(getPower(5, 3));
    }
}
