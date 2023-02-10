package main._23._2._10_3;
import java.util.Scanner;

public class ex_02739 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int repeat = s.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.format("%d * %d = %d\n", repeat, i, repeat * i);
        }
    }
}
