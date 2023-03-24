package _4_04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_02847 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = n-2; i >= 0; i--) {
            if (a[i] >= a[i+1]) {
                count += a[i] - a[i+1] + 1;
                a[i] = a[i+1] - 1;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
