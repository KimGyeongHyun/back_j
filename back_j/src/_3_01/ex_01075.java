package _3_01;
import java.util.Scanner;

public class ex_01075 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), f = s.nextInt();
        int a = (n - n%100) / f;
        int result = (a * f) % 100;
        if (result != 0) result += f - 100;
        System.out.format("%02d", result);
    }
}
