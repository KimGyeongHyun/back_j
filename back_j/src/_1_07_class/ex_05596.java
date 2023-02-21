package _1_07_class;
import java.util.Scanner;

public class ex_05596 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa = s.nextInt();
        int ab = s.nextInt();
        int ac = s.nextInt();
        int ad = s.nextInt();

        int ba = s.nextInt();
        int bb = s.nextInt();
        int bc = s.nextInt();
        int bd = s.nextInt();

        int asum = aa + ab + ac + ad;
        int bsum = ba + bb + bc + bd;

        System.out.print(Math.max(asum, bsum));
    }
}
