package _2_01;
import java.util.Scanner;

public class ex_11021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int repeat = s.nextInt();
        int max_repeat = repeat;
        while (repeat-- > 0){
            int a = s.nextInt(), b = s.nextInt();
            System.out.format("Case #%d: %d\n", max_repeat - repeat, a+b);
        }
    }
}
