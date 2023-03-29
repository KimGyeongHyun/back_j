package _4_06;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ex_02725 {

    static boolean[] set_prime(int n) {
        boolean[] a = new boolean[n+2];
        Arrays.fill(a, true);
        a[0] = false; a[1] = false;

        for (int i = 2; i <= Math.sqrt((double)n); i++) {
            if (a[i]) {
                for (int j = 2 * i; j < n+2; j += i) a[j] = false;
            }
        }

        return a;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int c = Integer.parseInt(br.readLine());
        while (c-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 2 + n;
            boolean is_prime[] = set_prime(n);

            for (int i = 2; i <= n; i++) {
                boolean[] l = new boolean[i+1];
                Arrays.fill(l, true);

                for (int j = 2; j <= i; j++) {
                    if (i%j == 0 && is_prime[j]) {
                        for (int k = j; k <= i; k += j) l[k] = false;
                    }
                }

                int true_count = 0;
                for (int j = 1; j <= i; j++) {
                    if (l[j]) true_count++;
                }

                int final_count = (n / i) * true_count;

                for (int j = 0; j < n % i; j++) {
                    if (l[j+1]) final_count++;
                }

                count += final_count;
            }
            bw.write(Integer.toString(count) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
