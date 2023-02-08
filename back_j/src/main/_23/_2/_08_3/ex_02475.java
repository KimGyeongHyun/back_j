package main._23._2._08_3;
import java.util.Scanner;

public class ex_02475 {

    static void calculator(int A, int I){
        System.out.print(A * (I - 1) + 1);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int I = s.nextInt();
        calculator(A, I);
    }

}