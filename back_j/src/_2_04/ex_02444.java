package _2_04;
import java.util.Scanner;

public class ex_02444 {
    static void drawStars7(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int k = Math.abs(i - n);
            for (int j = 1; j <= k; j++) System.out.print(' ');
            k = n - k;
            for (int j = 1; j <= 2*k - 1; j++) System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars7(s.nextInt());
    }
}
