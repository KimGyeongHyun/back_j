package _3_06;
import java.util.Scanner;

public class ex_01292 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int sum_number = 1;
        int count = 1;
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if (a <= i && i <= b) sum += sum_number;
            if (b < i) break;
            if (count == sum_number) {
                sum_number++; count = 1;
            }
            else count++;
        }

        System.out.println(sum);
        s.close();

    }
}
