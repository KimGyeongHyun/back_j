package _3_04;
import java.util.Scanner;

public class ex_01145 {

    static int get_lcm(int a, int b){
        int gcd = 1;
        int i;
        int ta = a, tb = b;
        if (a>b) i = a;
        else i = b;

        for (;i>1; i--) {
            if (ta%i==0 && tb%i==0) {
                ta /= i;
                tb /= i;
                gcd *= i;
            }
        }

        return a * b / gcd;
    }

    static int get_lcm_three(int a, int b, int c) {
        return get_lcm(a, get_lcm(b, c));
    }

    static int get_almost(int a, int b, int c, int d, int e) {
        int min = get_lcm_three(a, b, c);

        if (min > get_lcm_three(a, b, d)) min = get_lcm_three(a, b, d);
        if (min > get_lcm_three(a, b, e)) min = get_lcm_three(a, b, e);
        if (min > get_lcm_three(a, c, d)) min = get_lcm_three(a, c, d);
        if (min > get_lcm_three(a, c, e)) min = get_lcm_three(a, c, e);
        if (min > get_lcm_three(a, d, e)) min = get_lcm_three(a, d, e);
        if (min > get_lcm_three(b, c, d)) min = get_lcm_three(b, c, d);
        if (min > get_lcm_three(b, c, e)) min = get_lcm_three(b, c, e);
        if (min > get_lcm_three(b, d, e)) min = get_lcm_three(b, d, e);
        if (min > get_lcm_three(c, d, e)) min = get_lcm_three(c, d, e);

        return min;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt(), e = s.nextInt();
        System.out.print(get_almost(a, b, c, d, e));
    }
    
}
