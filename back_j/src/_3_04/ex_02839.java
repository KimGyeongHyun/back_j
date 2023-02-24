package _3_04;
import java.util.Scanner;

public class ex_02839 {

    static int bag_num(int n) {
        int count = n/5;

        for (int i = 0; i <= 2; i++) {
            if (count < i) return -1;
            if ((n - 5 * (count - i))%3 == 0) {
                return count - i + (n - 5 * (count - i))/3;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(bag_num(n));
        s.close();

    }
}
