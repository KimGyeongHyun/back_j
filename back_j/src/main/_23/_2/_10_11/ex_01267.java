package main._23._2._10_11;
import java.util.Scanner;

public class ex_01267 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int y = 0, m = 0;
        int charge = 0;

        while (N-- > 0) {
            charge = s.nextInt();
            y += 10 * (charge/30 + 1);
            m += 15 * (charge/60 + 1);
        }

        if (y > m) System.out.format("M %d", m);
        else if (y < m) System.out.format("Y %d", y);
        else System.out.format("Y M %d", y);
    }
}
