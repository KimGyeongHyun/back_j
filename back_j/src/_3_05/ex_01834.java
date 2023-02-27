package _3_05;
import java.util.Scanner;

public class ex_01834 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        n = (n+1)*n*(n-1)/2;
        System.out.print(n);
        s.close();
    }
}
