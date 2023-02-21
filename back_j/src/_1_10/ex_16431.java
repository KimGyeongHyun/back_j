package _1_10;
import java.util.Scanner;

public class ex_16431 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Br = s.nextInt(), Bc = s.nextInt();
        int Dr = s.nextInt(), Dc = s.nextInt();
        int Jr = s.nextInt(), Jc = s.nextInt();

        int B = Math.max(Math.abs(Br - Jr), Math.abs(Bc - Jc));
        int D = Math.abs(Dr - Jr) + Math.abs(Dc - Jc);

        if (B > D) System.out.print("daisy");
        else if (B < D) System.out.print("bessie");
        else System.out.print("tie");
    }
}
