package _3_02_substring_int_string_split;
import java.util.Scanner;

public class ex_10953_substring_int {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine());
        while (T-- > 0) {
            String str = s.nextLine();
            int a = Integer.parseInt(str.substring(0, 1));
            int b = Integer.parseInt(str.substring(2, 3));
            System.out.println(a+b);
        }
    }
}
