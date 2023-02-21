package _3_01;
import java.util.Scanner;

public class ex_01193 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();

        double x = ((Math.sqrt(8 * (double)X + 1) - 1)) / 2;
        if (x%1 != 0.0) x++;
        int intx = (int)x;
        X -= (intx*(intx-1)/2);
        if (intx%2 == 0) System.out.format("%d/%d", X, intx-X+1);
        else System.out.format("%d/%d", intx-X+1, X);
        
    }
}
