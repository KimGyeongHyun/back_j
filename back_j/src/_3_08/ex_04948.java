package _3_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_04948 {
    static boolean is_prime(int n) {

        if (n == 2) return true;

        if (n == 1 || n % 2 == 0) return false;

        for (int i = 3; i*i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static int get_number_of_prime(int n) {
        int count = 0;
        for (int i = n + 1; i <= 2 * n; i++) {
            if (is_prime(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;

        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n==0) break;

            bw.write(Integer.toString(get_number_of_prime(n)) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
