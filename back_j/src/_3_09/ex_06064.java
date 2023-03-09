package _3_09;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_06064 {
    static int get_kaing_year(int M, int N, int x, int y) {

        int fy = y;
        if (y == N) y = 0;

        for (int year = x; year <= M * N; year += M) {
            if (year % N == y && x <= year && fy <= year) return year;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(get_kaing_year(M, N, x, y)) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
