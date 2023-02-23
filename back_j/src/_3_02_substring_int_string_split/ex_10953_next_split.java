package _3_02_substring_int_string_split;
import java.util.Scanner;

public class ex_10953_next_split {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n-- > 0) {
            String[] v = s.next().split(",");
            int a = Integer.parseInt(v[0]);
            int b = Integer.parseInt(v[1]);
            System.out.println(a+b);
        }
    }
}
