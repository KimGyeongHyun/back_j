package _3_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_02004 {

    static int count_exp(int n, int exp_number) {
        int count = 0;
        while (n/exp_number != 0) {
            n /= exp_number;
            count += n;
        }
        return count;
    }
    
    static int combination(int m, int n) {
        int two = 0, five = 0;
        
        two += count_exp(n, 2);
        five += count_exp(n, 5);

        two -= count_exp(m, 2);
        five -= count_exp(m, 5);

        two -= count_exp(n-m, 2);
        five -= count_exp(n-m, 5);

        if (two < five) return two;
        else return five;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(combination(m, n)));
        bw.flush();
        bw.close();
    }
}
