package main._23._2._10_5;
import java.util.Scanner;

public class ex_02446 {
    static void drawStars8(int n) {
        for (int i = 1; i <= 2*n - 1; i++) {

            int k = Math.abs(i - n);
            for (int j = 0 ; j < n-k-1 ; j++) System.out.print(' ');
            for (int j = 1; j <= 2*k + 1; j++) System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars8(s.nextInt());
    }
}
