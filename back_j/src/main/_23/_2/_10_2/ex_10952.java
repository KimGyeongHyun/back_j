package main._23._2._10_2;
import java.util.Scanner;

public class ex_10952 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while (true){
            int a = s.nextInt(), b = s.nextInt();
            if (a == 0 && b == 0) break;
            System.out.format("%d\n", a+b);
        }
    }
}
