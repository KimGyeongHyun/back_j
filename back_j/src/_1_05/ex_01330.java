package _1_05;
import java.util.Scanner;

public class ex_01330 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {System.out.print('>');}
        else if (a < b) {System.out.print('<');}
        else {System.out.print("==");}
    }
}
