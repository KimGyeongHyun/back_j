package main._23._2._10_4;
import java.util.Scanner;

public class ex_02438 {
    static void drawStars1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars1(s.nextInt());
    }
}
