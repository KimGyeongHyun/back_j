package _3_08;
import java.util.Scanner;

public class ex_06588_origin {
    static boolean isPrime (int n) {
        if (n==1) return false;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        while (true) {
            int n = s.nextInt();
            if (n == 0) break;

            for (int i = 3; i < n; i += 2) {
                if (isPrime(i) && isPrime(n-i)) {
                    sb.append(n + " = " + i + " + " + ( n - i) + "\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
