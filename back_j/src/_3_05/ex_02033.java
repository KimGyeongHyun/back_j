package _3_05;
import java.util.Scanner;
import java.lang.Math;

public class ex_02033 {

    static int get_round(int n) {
        int index = 1;
        while (0 < n/(int)Math.pow(10, index)) {
            int index_number = (n/(int)Math.pow(10, index-1)) % 10;
            if (5 <= index_number) {
                n += (int)Math.pow(10, index);
            }
            n -= index_number * (int)Math.pow(10, index-1);

            index++;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(get_round(n));
        s.close();
    }
}
