package _1_06;
import java.util.Scanner;

public class ex_10797 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int ten = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        
        int count = 0;

        if (a % 10 == ten) {count++;}
        if (b % 10 == ten) {count++;}
        if (c % 10 == ten) {count++;}
        if (d % 10 == ten) {count++;}
        if (e % 10 == ten) {count++;}

        System.out.print(count);
    }
}
