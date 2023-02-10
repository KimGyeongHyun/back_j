package main._23._2._10_9;
import java.util.Scanner;

public class ex_02506 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int score = 0;
        int add_score = 1;
        while (N-- > 0) {
            int right = s.nextInt();
            if (right == 1){
                score += add_score;
                add_score += 1;
            }
            else add_score = 1;
        }
        System.out.print(score);
    }
}
