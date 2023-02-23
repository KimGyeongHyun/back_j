package _3_02_substring_int_string_split;
import java.util.Scanner;

public class ex_02846 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int max = 0, before = 0, high = 0;

        while (N-- > 0) {
            int a = s.nextInt();

            if (before == 0) {
                before = a; continue;
            }

            if (before < a) high += a - before;
            else high = 0;

            if (max < high) max = high;
            before = a;
        }

        System.out.print(max);
    }
}
