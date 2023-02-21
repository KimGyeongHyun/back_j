package _2_10;
import java.util.Scanner;

public class ex_01009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0){
            int a = s.nextInt(), b = s.nextInt();
            int temp = 1;
            b %= 4;
            if (b == 0) b = 4;
            while (b-- > 0) temp *= a;
            temp %= 10;
            if (temp == 0) temp = 10;
            System.out.println(temp);
        }
    }
}
