package main._23._2._10_9;
import java.util.Scanner;

public class ex_05086 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = s.nextInt(), b = s.nextInt();
            if (a==0 && b == 0) break;
            if (a > b && a%b == 0) System.out.println("multiple");
            else if (b > a && b%a == 0) System.out.println("factor");
            else System.out.println("neither");
        }
    }
}
