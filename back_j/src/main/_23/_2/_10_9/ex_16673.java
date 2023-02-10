package main._23._2._10_9;
import java.util.Scanner;

public class ex_16673 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int C = s.nextInt(), K = s.nextInt(), P = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= C; i++){
            sum += K * i + P * i * i;
        }

        System.out.print(sum);
    }
}
