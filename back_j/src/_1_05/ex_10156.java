package _1_05;
import java.util.Scanner;

public class ex_10156 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int N = s.nextInt();
        int M = s.nextInt();

        if (K * N > M) {
            System.out.print(K * N - M);
        }
        else {
            System.out.print(0);
        }
    }
}
