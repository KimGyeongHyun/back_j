package main._23._2._09;
import java.util.Scanner;

public class ex_15726 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        if (b > c) {
            long temp = a * b;
            System.out.print((int)(temp/c));
        }
        else {
            long temp = a * c;
            System.out.print((int)(temp/b));
        }
    }
}
