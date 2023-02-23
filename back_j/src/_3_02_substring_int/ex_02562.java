package _3_02_substring_int;
import java.util.Scanner;

public class ex_02562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0, index = 0;
        for (int i = 1; i <= 9; i++) {
            int a = s.nextInt();
            if (i == 1) {
                max = a; index = i; continue;
            }
            if (max < a) {
                max = a; index = i;
            }
        }
        System.out.format("%d\n%d", max, index);
    }
}
