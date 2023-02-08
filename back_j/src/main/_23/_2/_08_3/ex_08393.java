package main._23._2._08_3;
import java.util.Scanner;

public class ex_08393 {

    static int sumOneToInputnumber(int n){
        int i = n;
        int sum = 0;
        while(i > 0){
            sum += i;
            i--;
        }

        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(sumOneToInputnumber(n));
    }

}
