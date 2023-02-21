package _1_07_class;
import java.util.Scanner;

public class ex_02480 {

    static int calcDice(int a, int b, int c) {
        if (a == b && b == c) return 10000 + 1000 * a;
        
        else if (a == b || a == c) return 1000 + 100 * a;
        
        else if (b == c) return 1000 + 100 * b;

        return 100 * Math.max(a, Math.max(b, c));
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.print(calcDice(a, b, c));
    }
}
