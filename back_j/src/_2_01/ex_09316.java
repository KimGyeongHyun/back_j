package _2_01;
import java.util.Scanner;

public class ex_09316 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int repeat = s.nextInt();

        for (int i = 1; i <= repeat; i++) System.out.format("Hello World, Judge %d!\n", i);
    }
}
