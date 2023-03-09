package _3_09;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_01105 {
    static int get_eight_number(int l, int r) {
        long ldiv = 1, rdiv = 1;
        int count = 0;

        while (l/ldiv != 0) ldiv *= 10;
        while (r/rdiv != 0) rdiv *= 10;

        if (ldiv != rdiv) return 0;

        long div = ldiv/10;

        while (l/div == r/div) {
            if (l/div == 8) count++;
            l -= l/div * div;
            r -= r/div * div;
            div /= 10;
            if (div == 0) break;
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        bw.write(Integer.toString(get_eight_number(l, r)));
        bw.flush();
        bw.close();
    }
}
