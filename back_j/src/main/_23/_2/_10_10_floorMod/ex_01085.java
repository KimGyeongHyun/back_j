package main._23._2._10_10_floorMod;
import java.util.Scanner;

public class ex_01085 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt(), w = s.nextInt(), h = s.nextInt();

        int x_move = 0, y_move = 0;
        if (2*x < w) x_move = Math.abs(x);
        else x_move = Math.abs(w-x);
        if (2*y < h) y_move = Math.abs(y);
        else y_move = Math.abs(h-y);
        System.out.print(Math.min(x_move, y_move));
    }
}
