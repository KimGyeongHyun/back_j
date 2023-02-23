package _3_03;
import java.util.Scanner;

public class ex_10996 {
    static void draw_star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                if (j%2 == 1) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
            for (int j = 1; j <= n; j++){
                if (j%2 == 0) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        draw_star(n);
    }
}
