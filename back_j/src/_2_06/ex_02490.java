package _2_06;
import java.util.Scanner;

public class ex_02490 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 3; i++){
            int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();
            if (a==0) count++;
            if (b==0) count++;
            if (c==0) count++;
            if (d==0) count++;

            switch (count) {
                case 0:
                    System.out.println('E');
                    break;
                case 1:
                    System.out.println('A');
                    break;
                case 2:
                    System.out.println('B');
                    break;
                case 3:
                    System.out.println('C');
                    break;
                case 4:
                    System.out.println('D');
                    break;
            }

            count = 0;
        }
    }
}
