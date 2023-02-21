package _1_04;
import java.util.Scanner;

public class ex_08393_2_not_loop {

    static int sumOneToInputnumber(int n){

        return n * (n+1) / 2;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(sumOneToInputnumber(n));
    }

}
