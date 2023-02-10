package main._23._2._10_8;
import java.util.Scanner;

public class ex_14656 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) 
            if (s.nextInt() != i) count++;
        
        System.out.print(count);
    }
}
