package main._23._2._10;
import java.util.Scanner;

public class ex_19944 {

    static String printBie(int N, int M) {
        if (M <= 2) return "NEWBIE!";
        if (M <= N && M >= 3) return "OLDBIE!";
        return "TLE!";
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(), M = s.nextInt();

        System.out.print(printBie(N, M));
    }
}
