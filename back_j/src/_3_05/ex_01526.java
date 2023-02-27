package _3_05;
import java.util.Scanner;
import java.lang.Math;

public class ex_01526 {

    static int get_gummin(int n) {

        int index = 0;  // n의 자릿수를 나타낼 인덱스
        int result = 0;

        // 'n의 최대 자릿수 - 1'을 찾아 index 에 저장
        while (n >= Math.pow(10, index)) index++;
        index--;

        // 결과가 나올 때까지 반복
        while (0 <= index) {
            
            // n의 index+1 번째 자릿수 숫자를 찾아 index_number 에 저장
            int index_number = n / (int)Math.pow(10, index);

            // index_number 가 4, 7이 아니라면 예외 처리
            if (index_number != 4 && index_number != 7) {
                // 7 초과라면 index+1 번째 자릿수에 7을 대입
                if (7 < index_number) result += 7 * (int)Math.pow(10, index);
                // 4 초과 7 미만이라면 index+1 번째 자릿수에 4를 대입
                else if (4 < index_number) result += 4 * (int)Math.pow(10, index);
                // 나머지 index ~ 1 번째 자릿수에 7을 대입 후 리턴
                while (index-- > 0) result += 7 * (int)Math.pow(10, index);
                return result;
            }

            // index_number 가 4 또는 7인 경우
            else {
                int low_index_number;   // index_number 의 아래쪽인 index 번째 자릿수 숫자를 찾아 low_index_number 에 저장
                // index 가 1번째 자릿수까지 내려왔다면 예외 처리
                if (index == 0) low_index_number = 9;
                // 아니라면 정상적으로 index 번째 자릿수 숫자 저장
                else low_index_number = (n / (int)Math.pow(10, index-1)) % 10;

                // low_index_number 가 4 미만이라면 예외 처리
                if (low_index_number < 4) {
                    // index_number 가 7이라면 index+1 번째 자릿수에 4를 대입
                    if (index_number == 7) result += 4 * (int)Math.pow(10, index);
                    // 나머지 index ~ 1 번째 자릿수에 7을 대입 후 리턴
                    while (index-- > 0) result += 7 * (int)Math.pow(10, index);
                    return result;
                }
                // 4 이상이라면
                else {
                    // index+1 번째 자릿수에 index_number 대입
                    result += index_number * (int)Math.pow(10, index);

                    // 1의 자릿수까지 내려왔다면 예외 처리
                    if (index==0) return result;

                    // n의 index+1 번째 자릿수를 빼고, index 에 1을 뺌
                    // while 문 반복
                    n -= index_number * (int)Math.pow(10, index);
                    index--;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(get_gummin(n));
        s.close();
    }
}
