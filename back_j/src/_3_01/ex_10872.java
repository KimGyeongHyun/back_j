package _3_01;
import java.util.Scanner;

public class ex_10872 {
    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(factorial(n));
    }
    
}
