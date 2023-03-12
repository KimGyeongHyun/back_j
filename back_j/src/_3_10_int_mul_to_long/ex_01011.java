package _3_10_int_mul_to_long;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.Math;

public class ex_01011 {

    static int get_max_k(int gap) {
        double sq = Math.sqrt(gap);

        if (sq % 1 == 0.0) return 2 * (int)sq - 1;

        int isq = (int)sq + 1;
        if (gap <= (long)isq*isq - isq) return 2 * (int)sq;
        else return 2 * (int)sq + 1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int x, y, gap;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken()); y = Integer.parseInt(st.nextToken());
            gap = y - x;

            bw.write(Integer.toString(get_max_k(gap)) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
