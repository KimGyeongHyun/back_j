package _3_07_buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_10994 {

    static void draw_star(int n, BufferedWriter bw) throws IOException{
        n--;

        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < (i+1)/2; j++) bw.write("* ");

            if (i%2 == 0) {
                for (int j = 0; j < 4 * (n - i/2) + 1; j++) bw.write('*');
            }
            else {
                for (int j = 0; j < 4 * (n - (i+1)/2) + 1; j++) bw.write(' ');
            }

            for (int j = 0; j < (i + 1)/2; j++) bw.write(" *");

            bw.write('\n');
        }

        for (int j = 0; j < n; j++) bw.write("* ");
        bw.write('*');
        for (int j = 0; j < n; j++) bw.write(" *");
        bw.write('\n');

        for (int i = 2 * n - 1; i >= 0; i--) {
            for (int j = 0; j < (i+1)/2; j++) bw.write("* ");

            if (i%2 == 0) {
                for (int j = 0; j < 4 * (n - i/2) + 1; j++) bw.write('*');
            }
            else {
                for (int j = 0; j < 4 * (n - (i+1)/2) + 1; j++) bw.write(' ');
            }

            for (int j = 0; j < (i + 1)/2; j++) bw.write(" *");

            bw.write('\n');
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        draw_star(n, bw);
        bw.flush();
        bw.close();
    }
}
