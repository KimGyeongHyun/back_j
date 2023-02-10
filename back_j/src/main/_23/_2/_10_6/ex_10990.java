package main._23._2._10_6;
import java.util.Scanner;

public class ex_10990 {
    static void drawStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) System.out.print(' ');
            System.out.print('*');
            for (int j = 0; j < 2*i - 1; j++) System.out.print(' ');
            if (i != 0) System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars(s.nextInt());
    }
}
