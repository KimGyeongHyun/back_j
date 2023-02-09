package main._23._2._10_2;
import java.util.Scanner;

public class ex_10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int repeat = s.nextInt();
        while(repeat-- > 0){
            int a = s.nextInt(), b = s.nextInt();
            System.out.format("%d\n", a+b);
        }
    }
}
