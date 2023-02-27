package _3_05;
import java.util.Scanner;
import java.lang.Math;

public class ex_01977 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(), n = s.nextInt();
        int sq;
        int min = 0;
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sq = (int)Math.pow(i, 2);
            if (m <= sq && sq <= n) {
                if (min == 0) min = sq;
                sum += sq;
            }
            if (n < sq) break;
        }

        if (min == 0) System.out.print(-1);
        else System.out.format("%d\n%d", sum, min);
        
        s.close();
    }
}
