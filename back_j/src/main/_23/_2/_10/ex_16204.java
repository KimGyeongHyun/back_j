package main._23._2._10;
import java.util.Scanner;

public class ex_16204 {
    static void printMaxCardNumber(int N, int M, int K) {
        System.out.print(N - Math.abs(M - K));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), M = s.nextInt(), K = s.nextInt();

        printMaxCardNumber(N, M, K);
    }
}
