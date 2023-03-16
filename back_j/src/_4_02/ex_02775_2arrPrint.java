package _4_02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_02775_2arrPrint {

    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[k+1][n];

            for (int i = 0; i < a[0].length; i++) a[0][i] = i+1;

            for (int i = 1; i < a.length; i++) {
                a[i][0] = 1;
                for (int j = 1; j < a[i].length; j++) a[i][j] = a[i-1][j] + a[i][j-1];
            }

            bw.write(Integer.toString(a[k][n-1]) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
