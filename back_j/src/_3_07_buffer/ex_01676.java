package _3_07_buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_01676 {

    static int return_zero_count(int n) {

        int two = 0, five = 0;
        int temp;

        for (int i = 1; i <= n; i++){

            temp = i;

            while (temp%2 == 0) {
                if (temp < 2) break;
                temp /= 2; two++;
            }
    
            while (temp%5 == 0) {
                if (temp < 5) break;
                temp /= 5; five++;
            }
        }

        if (two < five) return two;
        else return five;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(return_zero_count(n)));
        bw.flush();
        bw.close();
    }
}
