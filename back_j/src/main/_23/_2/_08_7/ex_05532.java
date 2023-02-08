package main._23._2._08_7;
import java.util.Scanner;

public class ex_05532 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();    // 방학 일수
        int A = s.nextInt();    // 국어 페이지
        int B = s.nextInt();    // 수학 페이지
        int C = s.nextInt();    // 하루 국어 페이지 푸는 수
        int D = s.nextInt();    // 하루 수학 페이지 푸는 수

        int korean = L - ((A-1) / C + 1);
        int math = L - ((B-1) / D + 1);

        System.out.print(Math.min(korean, math));
    }
    

}
