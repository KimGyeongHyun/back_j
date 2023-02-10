package main._23._2._10_6;
import java.util.Scanner;

public class ex_02523 {
    static void drawStars11(int n) {
        for (int i = 1; i <= 2*n - 1; i++) {
            int k = Math.abs(i - n);
            for (int j = 1; j <= n-k; j++) System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars11(s.nextInt());
    }
}
