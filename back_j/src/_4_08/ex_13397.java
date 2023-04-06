package _4_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_13397 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l[] = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) l[i] = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 5000 * 10000;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int min = 1, max = 10000;
            int index = 0, count = 0;

            while (index <= n - 1) {
                count++;
                if(++index >= n) break;

                int f = l[index-1];
                int s = l[index];
                if (f < s) {min = f; max = s;}
                else {min = s; max = f;}

                if (max - min > mid) continue;

                while (true) {
                    if (++index >= n) break;

                    int t = l[index];
                    if (t < min) min = t;
                    if (max < t) max = t;

                    if (max - min > mid) break;
                }
            }

            if (m >= count) {result = mid; end = mid - 1;}
            else start = mid + 1;
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
