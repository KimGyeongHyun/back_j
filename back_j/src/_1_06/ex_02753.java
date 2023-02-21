package _1_06;
import java.util.Scanner;

public class ex_02753 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {System.out.print(1); return;}
        System.out.print(0);
    }
}
