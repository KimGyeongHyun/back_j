package _2_09_floorMod;
import java.util.Scanner;

public class ex_04153 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
            if (a==0 && b==0 && c==0) break;
            if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b)
                System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
