package _4_07_Others;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.Math;

public class ex_01074 {
    static long count = 0;

    static void z(long row, long col, int n) {

        if (n == 0) return;

        long max = (long)Math.pow(2, n);
        long big = (long)Math.pow(2, n-1) * (long)Math.pow(2, n-1);

        if (row >= max/2) {
            count += 2 * big; row %= (max/2);
        }

        if (col >= max/2) {
            count += big; col %= (max/2);
        }

        z(row, col, n-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        z(r, c, n);
        bw.write(Long.toString(count));
        bw.flush();
        bw.close();
    }
}
