package _3_07_buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_01590 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        StringTokenizer st;

        str = br.readLine();
        st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int get_time = 0;
        boolean is_possible = false;

        int s, i, c;
        while (n-- > 0) {
            str = br.readLine();
            st = new StringTokenizer(str);
            s = Integer.parseInt(st.nextToken());
            i = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            while (c-- > 0) {
                if (t <= s) {
                    if (!is_possible) {
                        get_time = s; is_possible = true;
                    }
                    else {
                        if (s < get_time) get_time = s;
                    }
                }
                s += i;
            }
        }
        if (is_possible) bw.write(Integer.toString(get_time - t));
        else bw.write(Integer.toString(-1));
        bw.flush();
        bw.close();
    }
}
