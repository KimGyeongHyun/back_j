package main._23._2._09_string;
import java.util.Scanner;

public class ex_15726_data_select {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        if (b > c) {
            double temp = (double)a / c;
            System.out.print((int)(temp * b));
        }
        else {
            double temp = (double)a / b;
            System.out.print((int)(temp * c));
        }
    }
}
