package _3_06;
import java.util.Scanner;

public class ex_01094 {

    static int branch_number(int n) {
        int branch = 64;
        int count = 0;
        while (branch != 0){
            if (n==0) break;
            if (branch <= n){
                n -= branch;
                count++;
            }
            branch /= 2;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(branch_number(n));
        s.close();
    }
}
