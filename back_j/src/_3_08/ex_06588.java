package _3_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_06588 {

    static boolean is_prime(int n) throws IOException {

        for (int i = 3; i*i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, odd, sub;

        int guess_n = 0, first_prime = 0, last_prime = 0;

        while (true) {
            
            n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            odd = 3;

            while (odd <= n/2) {

                if (n == guess_n) {
                    bw.write(guess_n + " = " + first_prime + " + " + last_prime + "\n");
                    break;
                }

                sub = n - odd;
                if (is_prime(odd) && is_prime(sub)) {
                    bw.write(n + " = " + odd + " + " + sub + "\n");
                    guess_n = n; first_prime = odd; last_prime = n - odd;
                    break;
                }
                odd += 2;
            }

            if (n/2 < odd) bw.write("Gold\n");
        }

        bw.flush();
        bw.close();

    }
    
}
