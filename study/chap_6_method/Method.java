package study.chap_6_method;

public class Method {

    public static void sayHello() {System.out.println("hello");}

    // parameter 추가
    public static void power(int number) {System.out.println(number * number);}

    // return 추가
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress() {return "서울시";}

    public static String getInfo() {
        return getAddress() + " " + getPhoneNumber();
    }

    public static int getPower(int number) {return number * number;}
    
    public static void main(String[] args) {
        sayHello();
        power(5);
        System.out.println(getInfo());
        System.out.println(getPower(5));
    }
}
