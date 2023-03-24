package _4_03;
import java.util.*;

public class ex_13015_array {
    // 배열의 메모리 주소, 범위를 받아 v로 바꾸는 메소드
    static void memset(char[] c, int s, char v, int len) {
        for (int i = s; i < s + len; i++) c[i] = v;
    }

    // r번째 줄의 배열 memset 해주는 메소드
    static char[] set(int r, int n, int i) {
        int e = 4 * n - 4;  // 우측 끝 지점
        int gap = n - 1;    // *...*, 별과 별 사이 간격
        char[] res = new char[e + 1 - i];   // 출력 크기만큼 공간 할당당
        memset(res, 0, ' ', res.length);    // 공백으로 초기값 구성

        int t = 2, cursor = i;  // t(2): 좌측, 우측 2번의 데이터 구성
        // 맨 위 아래는 n 개의 *을 찍음
        if (r == 0 || r == 2 * n - 2) {
            memset(res, 0, '*', gap + 1);
            memset(res, e-gap, '*', gap + 1);
        }
        // 중앙은 다르게 처리
        else {
            // *이 들어가야 하는 위치를 cursor 로 하나씩 찾아 삽입
            while (t-- > 0) {
                cursor = i + gap * t;
                memset(res, cursor, '*', 1);
                memset(res, e-cursor, '*', 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int r = 2 * n - 1, idx = 0;
        char[][] c = new char[r][];
        for (int i = 0; i < r; i++) {
            c[i] = set(i, n, idx);
            idx += (i < r / 2) ? 1 : -1;
        }
        for (var x : c) System.out.println(x);
    }
}
