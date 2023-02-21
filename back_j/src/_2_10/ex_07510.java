package _2_10;
import java.util.Scanner;

public class ex_07510 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0, b = 0, c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.format("Scenario #%d:\n", i);
            a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
            if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b)
                System.out.print("yes\n\n");
            else System.out.print("no\n\n");
        }
    }
}
