package _2_06;
import java.util.Scanner;

public class ex_10886 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;

        for (int i = 0; i < N; i ++) if (s.nextInt() == 1) count++;

        if (count > N/2) System.out.print("Junhee is cute!");
        else System.out.print("Junhee is not cute!");
    }
}
