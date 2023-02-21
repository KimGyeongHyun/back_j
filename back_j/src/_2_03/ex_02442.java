package _2_03;
import java.util.Scanner;

public class ex_02442 {
    static void drawStars5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) System.out.print(' ');
            for (int j = 1; j <= 2*i - 1; j++) System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars5(s.nextInt());
    }
}
