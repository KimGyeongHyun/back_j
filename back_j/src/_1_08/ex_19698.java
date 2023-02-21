package _1_08;
import java.util.Scanner;

public class ex_19698 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int W = s.nextInt();
        int H = s.nextInt();
        int L = s.nextInt();
        
        System.out.print(Math.min(N, (W/L)*(H/L)));

    }
}
