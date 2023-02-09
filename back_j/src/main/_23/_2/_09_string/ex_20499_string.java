package main._23._2._09_string;
import java.util.Scanner;

public class ex_20499_string {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;

        String str = s.nextLine();
        i = str.indexOf("/");

        int K = Integer.parseInt(str.substring(0, i));

        int j = str.substring(i+1, str.length()).indexOf("/")+ i + 1;

        int D = Integer.parseInt(str.substring(i+1, j));

        int A = Integer.parseInt(str.substring(j+1, str.length()));

        if (K + A < D || D == 0) System.out.print("hasu");
        else System.out.print("gosu");
    }
}
