package main._23._2._08_5;
import java.util.Scanner;

public class ex_09498 {

    static void printScore(int score){
        if (90 <= score){System.out.print('A');}
        else if (80 <= score) {System.out.print('B');}
        else if (70 <= score) {System.out.print('C');}
        else if (60 <= score) {System.out.print('D');}
        else {System.out.print('F');}
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        printScore(score);
    }
}
