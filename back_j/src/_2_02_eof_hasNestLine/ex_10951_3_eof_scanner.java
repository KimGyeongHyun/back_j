package _2_02_eof_hasNestLine;
import java.util.Scanner;

public class ex_10951_3_eof_scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            // 런타임 에러가 발생하지 않음
            // nextInt() 와 다르게 nextLine() 은 인풋 한줄 한줄을 개행 문자와 같이 읽기 때문에
            // 마지막 인풋의 개행 문자를 남기지 않게 되고
            // hasNextLine() 에서 false 를 반환하게 된다
            String[] res = s.nextLine().split(" ");
            int sum = Integer.parseInt(res[0]) + Integer.parseInt(res[1]);
            System.out.println(sum);            
        }
    }
}
