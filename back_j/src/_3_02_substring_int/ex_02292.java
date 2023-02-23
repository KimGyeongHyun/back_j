package _3_02_substring_int;
import java.util.Scanner;
import java.lang.Math;

public class ex_02292 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n += 4; n /= 6;
        double a = (Math.sqrt(1+8*n)-1) / 2;
        if (a%1 != 0) a++;
        System.out.print(1+(int)a);
    }
}
