package _4_05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.Math;

public class ex_01929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] a = new boolean[n+2];
        Arrays.fill(a, true);
        a[0] = false; a[1] = false;

        for (int i = 2; i <= Math.sqrt((double)n); i++) {
            if (a[i]) {
                for (int j = 2 * i; j < n+2; j += i) a[j] = false;
            }
        }

        for (int i = m; i <= n; i++) {
            if (a[i]) bw.write(Integer.toString(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
