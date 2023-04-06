package _4_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ex_02110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int l[] = new int [n];
        for (int i = 0; i < n; i++) l[i] = Integer.parseInt(br.readLine());

        Arrays.sort(l);

        int min = 1;
        int max = 1000000000;
        int result = 0;

        while (min <= max) {
            int mid = (min + max) / 2;

            int count = 0;
            int index = 0;

            while (index <= n - 1) {

                int start = l[index];
                count++;

                while (true) {
                    if (++index >= n) break;
                    if (l[index] - start > mid - 1) break;
                }
            }

            if (c <= count) {result = mid; min = mid + 1;}
            else max = mid - 1;
        }

        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
    }
}
