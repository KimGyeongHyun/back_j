package _3_10_int_mul_to_long;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_11758_CCW {
    static int CCW(int x1, int y1, int x2, int y2, int x3, int y3) {
        long outer_product = (x2 - x1) * (y3 - y2) - (x3 - x2) * (y2 - y1);
        if (outer_product > 0) return 1;
        else if (outer_product < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken()), y3 = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(CCW(x1, y1, x2, y2, x3, y3)));
        bw.flush();
        bw.close();

    }
}
