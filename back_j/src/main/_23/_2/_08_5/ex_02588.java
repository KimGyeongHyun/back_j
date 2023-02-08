package main._23._2._08_5;
import java.util.Scanner;

public class ex_02588 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a * (b%10));
        System.out.println(a * (b/10%10));
        System.out.println(a * (b/100));
        System.out.println(a*b);
    }
}
