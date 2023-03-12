package _3_10_int_mul_to_long;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
    
public class ex_17386 {
    static int CCW(int x1, int y1, int x2, int y2, int x3, int y3) {
        long outer_product = (long)(x2 - x1) * (y3 - y2) - (long)(x3 - x2) * (y2 - y1);
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
        int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken()), y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken()), y4 = Integer.parseInt(st.nextToken());

        int first_CCW, second_CCW;
        first_CCW = CCW(x1, y1, x2, y2, x3, y3);
        second_CCW = CCW(x1, y1, x2, y2, x4, y4);
        int first_cross = first_CCW * second_CCW;

        first_CCW = CCW(x3, y3, x4, y4, x1, y1);
        second_CCW = CCW(x3, y3, x4, y4, x2, y2);
        int second_cross = first_CCW * second_CCW;

        if (first_cross == -1 && second_cross == -1) bw.write(Integer.toString(1));
        else bw.write(Integer.toString(0));
        
        bw.flush();
        bw.close();

    }
}
