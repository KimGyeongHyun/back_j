package _2_10;
import java.util.Scanner;

public class ex_05692 {

    static int factorial(int n) {
        int temp = 1;
        for (int i = 2; i <= n; i++) temp *= i;
        return temp;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 0;
        while (true) {
            input = s.nextInt();
            if (input == 0) break;
            System.out.println((input/10000)*factorial(5) +
                                ((input/1000)%10*factorial(4)) +
                                ((input/100)%10*factorial(3)) +
                                ((input/10)%10*factorial(2)) +
                                input%10);
        }
    }
}
