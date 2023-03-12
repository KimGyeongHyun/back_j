package _3_10_int_mul_to_long;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_02166 {
    static double triangle_v(int x1, int y1, int x2, int y2, int x3, int y3) {
        long outer_product = (long)(x2 - x1) * (y3 - y2) - (long)(x3 - x2) * (y2 - y1);
        return (double)outer_product / 2;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double tri_v = 0.0;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            if (i == 1) {
                x1 = x; y1 = y;
                continue;
            }
            else if (i == 2) {
                x2 = x; y2 = y;
                continue;
            }
            else {
                tri_v += triangle_v(x1, y1, x2, y2, x, y);
                x2 = x; y2 = y;
            }
        }
        
        if (tri_v < 0) tri_v = (-1) * tri_v;
        bw.write(String.format("%.1f", tri_v));
        bw.flush();
        bw.close();
    }
}
