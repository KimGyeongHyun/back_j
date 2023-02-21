package _2_05;
import java.util.Scanner;

public class ex_10991 {
    static void drawStars11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) System.out.print(' ');
            System.out.print('*');
            for (int j = 0; j < i; j++) System.out.print(" *");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars11(s.nextInt());
    }
}
