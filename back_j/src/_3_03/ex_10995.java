package _3_03;
import java.util.Scanner;

public class ex_10995 {

    static void draw_star(int n) {
        for (int i = 1; i <= n; i++){
            if (i%2 == 1)
                for (int j = 1; j <= n; j++) System.out.print("* ");
            else
                for (int j = 1; j <= n; j++) System.out.print(" *");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        draw_star(n);
    }
}
