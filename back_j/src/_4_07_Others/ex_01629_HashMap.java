package _4_07_Others;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

public class ex_01629_HashMap {
    
    static HashMap<Long, Long> mul = new HashMap<>();

    static long get_div(long n, long recurr, long div) {

        if (recurr == 1) return n % div;

        if (mul.containsKey(recurr)) return mul.get(recurr);

        long one = get_div(n, recurr/2, div);
        long two = get_div(n, recurr - recurr/2, div);
        long value = one * two % div;
        mul.put(recurr, value);
        return value;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        bw.write(Long.toString(get_div(a, b, c)));

        bw.flush();
        bw.close();
    }
}
