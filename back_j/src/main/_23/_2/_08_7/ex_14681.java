package main._23._2._08_7;
import java.util.Scanner;

public class ex_14681 {
    static void getQuadrant(int x, int y) {
        if (x > 0){
            if (y > 0) System.out.print(1);
            else System.out.print(4);
        }
        else {
            if (y > 0) System.out.print(2);
            else System.out.print(3);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        getQuadrant(x, y);
    }
}
