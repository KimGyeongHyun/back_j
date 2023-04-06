package _4_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class ex_02170 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int l[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            l[i][0] = x;
            l[i][1] = y;
        }

        // for (int i = 0; i < n; i++) {
        //     bw.write(Integer.toString(l[i][0]) + ", " + Integer.toString(l[i][1]) + "\n");
        // }

        // 2차 정렬
        Arrays.sort(l, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });

        // for (int i = 0; i < n; i++) {
        //     bw.write(Integer.toString(l[i][0]) + ", " + Integer.toString(l[i][1]) + "\n");
        // }

        int index = 0;
        int sum = 0;

        while (index < n) {
            int x = l[index][0];

            while (true) {
                if (++index >= n) break;
                if (x != l[index][0]) break;
            }

            if (index >= n) {sum += l[n-1][1] - x; break;}

            int y_big = l[index-1][1];

            while (y_big >= l[index][0]) {
                if (y_big < l[index][1]) y_big = l[index][1];
                if (++index >= n) break;
            }

            sum += y_big - x;
        }

        bw.write(Integer.toString(sum));

        bw.flush();
        bw.close();
        
    }
}

// class Line {
//     int x; int y;

//     Line(int x, int y) {
//         this.x = x; this.y = y;
//     }
// }

// 2차원 배열 정렬 참조 : https://ifuwanna.tistory.com/328