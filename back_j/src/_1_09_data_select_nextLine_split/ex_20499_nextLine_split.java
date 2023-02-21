package _1_09_data_select_nextLine_split;
import java.util.Scanner;

public class ex_20499_nextLine_split {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] v = s.nextLine().split("/");
        int k = Integer.parseInt(v[0]);
        int d = Integer.parseInt(v[1]);
        int a = Integer.parseInt(v[2]);

        if (k + a < d || d == 0) System.out.print("hasu");
        else System.out.print("gosu");
    }
}
