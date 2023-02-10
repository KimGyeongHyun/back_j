package main._23._2._10_3;
import java.util.Scanner;

public class ex_02455 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0, b = 0, sum = 0, max = 0;

        for (int i = 0; i < 4 ; i++) {
            a = s.nextInt(); 
            b = s.nextInt();
            sum -= a;
            sum += b;
            if (sum > max) max = sum;
        }

        System.out.print(max);
    }
}
