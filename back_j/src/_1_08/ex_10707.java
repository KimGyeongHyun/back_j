package _1_08;
import java.util.Scanner;

public class ex_10707 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();    // X�� 1���� ���
        int B = s.nextInt();    // Y�� �⺻���
        int C = s.nextInt();    // Y�� �⺻��� ��뷮 ���� ����
        int D = s.nextInt();    // Y�� 1���� ���
        int P = s.nextInt();    // ���� ��뷮

        int X = A * P;
        int Y = B;
        if (P > C) Y += D * (P - C);

        System.out.print(Math.min(X, Y));

    }
}
