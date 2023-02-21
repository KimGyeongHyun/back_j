package _2_07;
import java.util.Scanner;

public class ex_05565 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int total_sum = s.nextInt();
        int sum = 0;

        for (int i = 0; i < 9; i++) 
            sum += s.nextInt();
        
        System.out.print(total_sum - sum);
    }
}
