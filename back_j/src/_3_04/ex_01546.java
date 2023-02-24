package _3_04;
import java.util.Scanner;

public class ex_01546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number = n;
        int sum = 0;
        int max = 0;
        while (n-- > 0) {
            int score = s.nextInt();
            if (max < score) max = score;
            sum += score;
        }
        System.out.print(((double)sum * 100) / (max * number));
        s.close();
    }
}
