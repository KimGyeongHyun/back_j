package _4_06;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_11729 {

    static void hanoi(int n, int start, int mid, int end, BufferedWriter bw) throws IOException{

        if (n == 1) bw.write(Integer.toString(start) + " " + Integer.toString(end) + "\n");
        

        else {
            hanoi(n-1, start, end, mid, bw);
            bw.write(Integer.toString(start) + " " + Integer.toString(end) + "\n");
            hanoi(n-1, mid, start, end, bw);
        }
    }

    static long return_count(int n) {
        if (n == 1) return 1;
        
        return 1 + 2 * return_count(n-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        long count = return_count(n);
        bw.write(Long.toString(count) + "\n");

        hanoi(n, 1, 2, 3, bw);
        bw.flush();
        bw.close();
    }
}
