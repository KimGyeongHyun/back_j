package _3_02_substring_int;
import java.util.Scanner;

public class ex_02908 {

    static int sangsu_big(int a, int b) {
        a = a%10 * 100 + (a/10)%10 * 10 + a/100;
        b = b%10 * 100 + (b/10)%10 * 10 + b/100;
        
        if (a>b) return a;
        else return b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        System.out.print(sangsu_big(a, b));
    }
}
