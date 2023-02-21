package _1_06;
import java.util.Scanner;

public class ex_01712 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if (B >= C){
            System.out.print(-1);
            return;
        }

        System.out.print(A / (C - B) + 1);

    }
}
