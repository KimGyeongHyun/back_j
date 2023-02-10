package main._23._2._10_7;
import java.util.Scanner;

public class ex_10871 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), X = s.nextInt();
        int a = 0;

        while (N-- > 0) {
            a = s.nextInt();
            if (a < X) System.out.format("%d ", a);
        }
    }
}
