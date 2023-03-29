package _4_06;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_01780 {

    static int minus = 0, zero = 0, plus = 0; 

    static boolean is_one_paper(int[][] arr, int value, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != value) return false;
            }
        }

        return true;
    }

    static int[][] cut_array(int[][] arr, int r, int c, int n) {
        int[][] l = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) l[i][j] = arr[r*n + i][c*n + j];
        }

        return l;
    }

    static void count_paper(int[][] arr, int n) {

        int value = arr[0][0];

        if (n == 1) {
            if (value == -1) minus++;
            else if (value == 0) zero++;
            else if (value == 1) plus++;
            return;
        }

        if (is_one_paper(arr, value, n)) {
            if (value == -1) minus++;
            else if (value == 0) zero++;
            else if (value == 1) plus++;
        }
        else {
            int one = n/3;

            count_paper(cut_array(arr, 0, 0, one), one);
            count_paper(cut_array(arr, 0, 1, one), one);
            count_paper(cut_array(arr, 0, 2, one), one);
            count_paper(cut_array(arr, 1, 0, one), one);
            count_paper(cut_array(arr, 1, 1, one), one);
            count_paper(cut_array(arr, 1, 2, one), one);
            count_paper(cut_array(arr, 2, 0, one), one);
            count_paper(cut_array(arr, 2, 1, one), one);
            count_paper(cut_array(arr, 2, 2, one), one);
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] l = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) l[i][j] = Integer.parseInt(st.nextToken());
        }
        
        count_paper(l, n);
        bw.write(Integer.toString(minus) + "\n");
        bw.write(Integer.toString(zero) + "\n");
        bw.write(Integer.toString(plus) + "\n");
        bw.flush();
        bw.close();
    }
    
}
