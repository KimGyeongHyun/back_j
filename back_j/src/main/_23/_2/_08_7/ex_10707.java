package main._23._2._08_7;
import java.util.Scanner;

public class ex_10707 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();    // X사 1리터 요금
        int B = s.nextInt();    // Y사 기본요금
        int C = s.nextInt();    // Y사 기본요금 사용량 상한 리터
        int D = s.nextInt();    // Y사 1리터 요금
        int P = s.nextInt();    // 수도 사용량

        int X = A * P;
        int Y = B;
        if (P > C) Y += D * (P - C);

        System.out.print(Math.min(X, Y));

    }
}
