package _4_05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_01138 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] talls = new int[n];
        int[] bigger_front_number = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) bigger_front_number[i] = Integer.parseInt(st.nextToken());

        int zero_count;
        for (int i = 0; i < n; i++) {
            zero_count = 0;
            for (int j = 0; j < n; j++) {
                if (talls[j] == 0) {
                    if (zero_count == bigger_front_number[i]) {
                        talls[j] = i + 1; break;
                    }
                    zero_count++;
                }
            }
        }
        
        for (int i = 0; i < n; i++) bw.write(Integer.toString(talls[i]) + " ");
        bw.flush();
        bw.close();
    }
}
