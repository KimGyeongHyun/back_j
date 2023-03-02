package _3_07_buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_10837 {

    static boolean is_possible(int k, int m, int n) {

        int remain;

        if (m > n) {
            remain = k - m + 1;
            if (remain < m - n - 1) return false;
        }
        else if (m < n) {
            remain = k - n;
            if (remain < n - m - 1) return false;
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int k = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int m, n;
        String s;
        while (c-- > 0) {
            s = br.readLine();
            st = new StringTokenizer(s);
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            if (is_possible(k, m, n)) bw.write(1 + "\n");
            else bw.write(0 + "\n");
        }

        bw.flush();
        bw.close();
    }
}
