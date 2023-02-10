package main._23._2._10_9;
import java.util.Scanner;

public class ex_10250 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        while (T-- > 0) {
            int H = s.nextInt(), W = s.nextInt(), N = s.nextInt();
            int x = 0, y = 0;
            x = ((N-1) / H) + 1;
            y = ((N-1) % H) + 1;
            System.out.println(100*y + x);
        }
    }
}
