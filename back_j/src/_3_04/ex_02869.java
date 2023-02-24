package _3_04;
import java.util.Scanner;

public class ex_02869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), v = s.nextInt();
        v -= a;
        double tmp = (double)v/(a-b);
        if (tmp - (int)tmp != 0) tmp++;
        System.out.print((int)tmp + 1);
        s.close();
    }
}
