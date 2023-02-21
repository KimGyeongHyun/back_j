package _2_06;
import java.util.Scanner;

public class ex_05063 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        while (N-- > 0) {
            int r = s.nextInt(), e = s.nextInt(), c = s.nextInt();
            if (r > e - c) System.out.println("do not advertise");
            else if (r == e - c) System.out.println("does not matter");
            else System.out.println("advertise");
        }
    }
}
