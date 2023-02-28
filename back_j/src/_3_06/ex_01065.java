package _3_06;
import java.util.Scanner;

public class ex_01065 {

    static boolean is_arithmatic(int n) {
        if (n < 100) return true;

        int a = n/100;
        int b = (n/10)%10;
        int c = n%10;

        if (a-b == b-c) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while (n-- > 0) {
            if (is_arithmatic(n+1)) count++;
        }
        System.out.print(count);
        s.close();
    }
}
