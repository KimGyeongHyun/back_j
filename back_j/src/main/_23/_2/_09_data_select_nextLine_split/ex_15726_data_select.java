package main._23._2._09_data_select_nextLine_split;
import java.util.Scanner;

public class ex_15726_data_select {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 정답에서는 int 대신 long 으로 받아 나눌 때 double, 최종으로 long 으로 한꺼번에 계산
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
