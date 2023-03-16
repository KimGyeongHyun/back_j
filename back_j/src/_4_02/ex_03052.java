package _4_02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ex_03052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] l = new int[10];
        Arrays.fill(l, -1);
        int n; 
        int count = 0;
        for (int i = 0; i < 10; i++) {
            n = Integer.parseInt(br.readLine()) % 42;
            for (int number : l) {
                if (number == n) {count++; break;}
            }
            l[i] = n;
        }

        bw.write(Integer.toString(10 -count));
        bw.flush();
        bw.close();
    }
}
