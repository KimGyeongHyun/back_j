package _4_01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ex_10817 {
    
    static int get_middle(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) abc[i] = Integer.parseInt(st.nextToken());
        bw.write(Integer.toString(get_middle(abc)));
        bw.flush();
        bw.close();
    }
}
