package main._23._2._10_11;
import java.util.Scanner;

public class ex_06609 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M, P, L, E, R, S, N;
        while (true) {
            M = 0; P = 0; L = 0; E = 0; R = 0; S = 0; N = 0;
            try{
                M = s.nextInt(); P = s.nextInt(); L = s.nextInt();
                E = s.nextInt(); R = s.nextInt(); S = s.nextInt(); 
                N = s.nextInt(); 
            }
            catch(Exception e){
                break;
            }

            while (N-- > 0) {
                int temp = M;
                M = P / S;
                P = L / R;
                L = temp * E;
            }
            System.out.println(M);
            
        }
    }
}
