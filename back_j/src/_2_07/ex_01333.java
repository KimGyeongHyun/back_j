package _2_07;
import java.util.Scanner;

public class ex_01333 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), L = s.nextInt(), D = s.nextInt();
        int ring_time = 0;

        while ((L+5) * N - 5 > ring_time) {
            // System.out.format("%d %d\n", L, ring_time);
            if (L <= ring_time % (L+5)) break;
            ring_time += D;
        }
        System.out.print(ring_time);
    }
}
