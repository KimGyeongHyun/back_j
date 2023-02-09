package main._23._2._09_string;
import java.util.Scanner;

public class ex_14924 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int S = s.nextInt(), T = s.nextInt(), D = s.nextInt();

        System.out.print((int)((double)D * T / (2 * S)));
    }

}
