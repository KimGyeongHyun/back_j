package main._23._2._10_3_eof_hasNestLine;
import java.util.Scanner;

public class ex_10951_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            // 런타임 에러 발생
            // 입력 마지막에 개행 문자도 true 로 받기 때문
            // nextInt() 는 정보 입력을 받은 다음 개행 문자를 남긴다
            // 따라서 마지막 입력 정보 맨 뒤에 개행문자를 true 로 받아 다음 정보를 기다리게 된다
            int a = s.nextInt(), b = s.nextInt();
            System.out.println(a + b);
        }
    }
}
