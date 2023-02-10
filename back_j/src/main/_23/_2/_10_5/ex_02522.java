package main._23._2._10_5;
import java.util.Scanner;

public class ex_02522 {
    static void drawStars10(int n) {
        for (int i = 1; i <= 2*n - 1; i++) {
            int k = Math.abs(i - n);
            for (int j = 0; j < k; j++) System.out.print(' ');
            for (int j = 0; j < n-k; j++) System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars10(s.nextInt());
    }
}
