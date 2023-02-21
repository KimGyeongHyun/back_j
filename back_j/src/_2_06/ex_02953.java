package _2_06;
import java.util.Scanner;

public class ex_02953 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int repeat = 5;
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        
        for (int i = 0; i < 4; i ++) a += s.nextInt();
        for (int i = 0; i < 4; i ++) b += s.nextInt();
        for (int i = 0; i < 4; i ++) c += s.nextInt();
        for (int i = 0; i < 4; i ++) d += s.nextInt();
        for (int i = 0; i < 4; i ++) e += s.nextInt();

        if (a > b && a > c && a > d && a > e) System.out.format("%d %d\n", 1, a);
        else if (b > c && b > d && b > e) System.out.format("%d %d", 2, b);
        else if (c > d && c > e) System.out.format("%d %d", 3, c);
        else if (d > e) System.out.format("%d %d", 4, d);
        else System.out.format("%d %d", 5, e);
    }
}
