package _3_03;
import java.util.Scanner;

public class ex_01110 {

    static int recurr(int n) {
        return (n%10) * 10 + ((n%10) + (n/10)) % 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int correct = n, count = 1;
        while (true) {
            n = recurr(n);
            if (n == correct) break;
            count++;
        }

        System.out.print(count);
    }
    
}
