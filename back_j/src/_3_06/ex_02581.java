package _3_06;
import java.util.Scanner;

public class ex_02581 {

    static boolean if_sosu(int n) {
        if (n==1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(), n = s.nextInt();
        int min = 0, sum = 0;
        for (int i = m; i <= n; i++) {
            if (if_sosu(i)) {
                if (min == 0) min = i;
                sum += i;
            }
        }

        if (min == 0) System.out.print(-1);
        else System.out.format("%d\n%d", sum, min);
        s.close();
    }
}
