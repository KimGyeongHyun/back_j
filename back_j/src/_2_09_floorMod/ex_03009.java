package _2_09_floorMod;
import java.util.Scanner;

public class ex_03009 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = 0, second = 0;
        for (int i = 0; i < 3; i++){
            int a = s.nextInt(), b = s.nextInt();
            first ^= a;
            second ^= b;
        }
        System.out.format("%d %d", first, second);
    }
}
