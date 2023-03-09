package _3_09;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_01790 {
    static int get_kth_number(int n, int k) {
        int div = 1, exp = 1;
        while (n/div != 0) {

            if (9 * (long)div * exp < k) {
                k -= 9 * div * exp; div *= 10; exp += 1;
            }
            else {
                if ((n - div + 1) * (long)exp < k) break;
                int th1 = (k-1)/exp + div;
                int th2 = (k-1)%exp;
                th2 = exp - th2 - 1;
                return th1/(int)(Math.pow(10, th2))%10;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        bw.write(Integer.toString(get_kth_number(n, k)));
        bw.flush();
        bw.close();
    }
}
