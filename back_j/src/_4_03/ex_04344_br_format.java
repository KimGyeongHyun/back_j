package _4_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_04344_br_format {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());

        while (c-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] scores = new int[n];
            int input_int;
            double mean = 0.0;
            for (int i = 0; i < n; i++) {
                input_int = Integer.parseInt(st.nextToken());
                scores[i] = input_int;
                mean += input_int;
            }
            mean /= n;

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (mean < scores[i]) count++;
            }

            bw.write(String.format("%.3f", 100 * (double)count / n) + "%\n");
        }

        bw.flush();
        bw.close();
    }
}
