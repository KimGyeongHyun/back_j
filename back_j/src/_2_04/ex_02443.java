package _2_04;
import java.util.Scanner;

public class ex_02443 {
    static void drawStars6(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n-i; j > 0; j--) System.out.print(' ');
            for (int j = 1; j <= 2*i - 1; j++) System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars6(s.nextInt());
    }
}
