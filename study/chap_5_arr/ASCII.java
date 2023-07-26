package study.chap_5;

public class ASCII {
    public static void main(String[] args) {
        char c ='A';
        System.out.println(c);         
        System.out.println((int)c);     // 아스키코드

        c = '8';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        // 아스키 코드가 +1 된 것이기 때문에
        // 다음 수는 10이 아님
        c++;
        System.out.println(c);
        System.out.println((int)c);

    }
}
