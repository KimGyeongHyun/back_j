package _2_08;
import java.util.Scanner;

public class ex_10833 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum = 0;
        while (N-- > 0){
            int person = s.nextInt();
            int apple = s.nextInt();
            sum += apple % person;
        }

        System.out.print(sum);

    }
}
