package main._23._2._10_8;
import java.util.Scanner;

public class ex_09085 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int sum = 0;
        
        while (T-- > 0) {
            sum = 0;
            int N = s.nextInt();
            while (N-- > 0) sum += s.nextInt();
            System.out.println(sum);
        }
    }
}
