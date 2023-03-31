package _4_07_StringBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ex_10164 {
    
    static long[] factorial_list = new long[31];

    static int get_length() {
        int index = 1;
        while (index <= 14 && factorial_list[index+1] != 1) index++;
        return index;
    }

    static long factorial(int n) {

        int index = get_length();

        if (n <= index) return factorial_list[n];

        long value = n * factorial(n-1);
        factorial_list[n] = value;

        return value;
    }

    static long combination(int n, int r) {

        if (n <= 1 || n == r || r == 0) return 1;

        return factorial(n) / (factorial(r) * factorial(n-r));

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.fill(factorial_list, 1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (k == 0) k++;

        int x = (k-1) % m;
        int y = (k-1) / m;

        long value = combination(x+y, y) * combination(m+n-2-x-y, m-1-x);

        bw.write(Long.toString(value));
        bw.flush();
        bw.close();
    }
}
