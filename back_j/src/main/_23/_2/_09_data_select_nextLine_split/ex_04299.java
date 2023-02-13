package main._23._2._09_data_select_nextLine_split;
import java.util.Scanner;

public class ex_04299 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int sum = s.nextInt(), sub = s.nextInt();

        if ((sum+sub)%2 != 0 || (sum-sub)%2 != 0) {System.out.print(-1); return;}

        int a = (sum+sub)/2, b = (sum-sub)/2;
        
        if (a < 0 || b < 0){System.out.print(-1); return;}

        System.out.format("%d %d", a, b);
        
    }
}
