package main._23._2._10_8;
import java.util.Scanner;

public class ex_02576 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int min = 0;
        int get = 0;
        for (int i = 0; i < 7; i++){
            get = s.nextInt();
            if (get%2 == 1) {
                if (min == 0 || get < min) min = get;
                sum += get;
            }
        }
        if (min == 0) System.out.print(-1);
        else {
            System.out.println(sum);
            System.out.print(min);
        }
    }
}
