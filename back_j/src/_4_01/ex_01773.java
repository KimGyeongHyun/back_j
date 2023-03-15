package _4_01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_01773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());

        int[] time = new int[c];

        int gap;
        while (n-- > 0) {
            gap = Integer.parseInt(br.readLine());
            for (int i = gap - 1; i < c; i += gap) time[i] = 1;
        }

        int sum = 0;
        for (int see : time) sum += see;
        
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
