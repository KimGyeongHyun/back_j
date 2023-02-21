package _2_05;
import java.util.Scanner;

public class ex_10992 {
    static void drawStars(int n) {
        for (int i = 0; i < n; i++) {
            if (i != n-1) {
                for (int j = 0; j < n-1-i; j++) System.out.print(' ');
                System.out.print('*');
                for (int j = 0; j < 2*i - 1; j++) System.out.print(' ');
                if (i != 0) System.out.print('*');
            }
            else for (int j = 0; j < 2*n - 1; j++) System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars(s.nextInt());
    }
}
