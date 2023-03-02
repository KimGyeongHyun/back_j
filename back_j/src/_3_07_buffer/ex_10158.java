package _3_07_buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());

        s = bf.readLine();
        st = new StringTokenizer(s);
        int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(bf.readLine());

        int tx = (x + t) % (2 * w), ty = (y + t) % (2 * h);

        if (tx > w) tx = 2 * w - tx;
        if (ty > h) ty = 2 * h - ty;

        bw.write(tx + " " + ty);
        bw.flush();
        bw.close();
    }
}
