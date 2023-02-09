package main._23._2._10;
import java.util.Scanner;

public class ex_14470 {
    static int printTimeToHeat(int A, int B, int C, int D, int E){
        if (B <= 0) return C * (B - A);
        if (A >= 0) return E * (B - A);
        return E * B - C * A + D;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt(), B = s.nextInt(), C = s.nextInt(), D = s.nextInt(), E = s.nextInt();

        System.out.print(printTimeToHeat(A, B, C, D, E));
    }
}
