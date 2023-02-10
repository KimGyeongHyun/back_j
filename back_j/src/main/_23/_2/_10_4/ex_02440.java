package main._23._2._10_4;
import java.util.Scanner;

public class ex_02440 {
    static void drawStars3(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        drawStars3(s.nextInt());
    }
}
