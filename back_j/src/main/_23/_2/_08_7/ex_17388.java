package main._23._2._08_7;
import java.util.Scanner;

public class ex_17388 {
    static String blame(int S, int K, int H) {
        if (S + K + H >= 100) return "OK";
        if (S < K && S < H) return "Soongsil";
        else if (K < H) return "Korea";
        else return "Hanyang";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int K = s.nextInt();
        int H = s.nextInt();

        System.out.print(blame(S, K, H));
    }
}
