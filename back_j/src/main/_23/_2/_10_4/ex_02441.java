package main._23._2._10_4;
import java.util.Scanner;

public class ex_02441 {
    static void drawStars4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(' ');
            for (int j = n-i; j > 0; j--) System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars4(s.nextInt());
    }
}
