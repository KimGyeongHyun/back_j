package _4_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_13015 {

    static String up_down(int n) {
        String temp_str = "";
        for (int i = 0; i < n; i++) temp_str += '*';
        for (int i = 0; i < 2 * n - 3; i++) temp_str += ' ';
        for (int i = 0; i < n; i++) temp_str += '*';
        return temp_str;
    }

    static String gap_star(int n) {
        String temp_str = "*";
        for (int i = 0; i < n - 2; i++) temp_str += ' ';
        return temp_str + '*';
    }

    static String middle(int n) {
        String temp_str = "";
        for (int i = 0; i < n-1; i++) temp_str += ' ';
        temp_str += gap_star(n);
        for (int i = 0; i < n-2; i++) temp_str += ' ';
        return temp_str + '*';
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(up_down(n) + "\n");
        for (int i = n-2; i >= 1; i--) {
            for (int j = 1; j <= n-1-i; j++) bw.write(" ");
            bw.write(gap_star(n));
            for (int j = 1; j <= 2 * i - 1; j++) bw.write(" ");
            bw.write(gap_star(n) + "\n");
        }
        bw.write(middle(n) + "\n");
        for (int i = 1; i <= n-2; i++) {
            for (int j = 1; j <= n-1-i; j++) bw.write(" ");
            bw.write(gap_star(n));
            for (int j = 1; j <= 2 * i - 1; j++) bw.write(" ");
            bw.write(gap_star(n) + "\n");
        }
        bw.write(up_down(n) + "\n");


        bw.flush();
        bw.close();
    }
}
