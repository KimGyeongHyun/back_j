package _4_01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_02526 {

    static int calc(int input_number, int n, int p) {return input_number * n % p;}

    static int get_recurr_number(int n, int p) {
        int[] arr = new int[100000];
        int index = 0;
        int result = n;

        while (true) {
            result = calc(result, n, p);
            for (int i = 0; i < index; i++) {
                if (arr[i] == result) return index - i;
            }
            arr[index++] = result;
        }
    }    

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
        bw.write(Integer.toString(get_recurr_number(n, p)));
        bw.flush();
        bw.close();
    }
}
