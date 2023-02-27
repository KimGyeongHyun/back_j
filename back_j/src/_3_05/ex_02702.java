package _3_05;
import java.util.Scanner;

public class ex_02702 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt(), b = s.nextInt();
            int ta = a, tb = b;
            int temp;
            int gcd = 1;
            if (a < b) temp = a;
            else temp = b;

            while (1 < temp) {
                if (a%temp == 0 && b%temp == 0) {
                    a /= temp;
                    b /= temp;
                    gcd *= temp;
                }
                temp--;
            }
            System.out.format("%d %d\n", ta * tb / gcd, gcd);
            
        }
        s.close();
    }
}
