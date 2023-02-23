package _3_03;
import java.util.Scanner;



public class ex_14697 {
    static boolean is_possible_two(int a, int b, int n) {
        int num = a;
        while (num < n) {
            if ((n-num)%b == 0) return true;
            num += a;
        }
        return false;
    }
    
    static boolean is_possible(int a, int b, int c, int n) {
        if (a==1 || b==1 || c==1) return true;
        if (n%a==0 || n%b==0 || n%c==0) return true;
        if (is_possible_two(a, b, n) || is_possible_two(b, c, n) || is_possible_two(a, c, n)) return true;
        
        for (int i = 1; i <= (n/a); i++) {
            for (int j = 1; j <= (n/b); j++){
                for (int k = 1; k <= (n/c); k++) {
                    if (a*i + b*j + c*k == n) return true;
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b= s.nextInt(), c= s.nextInt(), n= s.nextInt();

        if (is_possible(a, b, c, n)) System.out.print(1);
        else System.out.print(0);

    }
}
