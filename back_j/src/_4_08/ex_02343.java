package _4_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_02343 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l[] = new int[n];
        int min = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            l[i] = temp;
            if (temp > min) min = temp;
        }

        
        int max = 1000000000;
        int result = 0;

        while (min <= max) {

            int mid = (min + max) / 2;

            int count = 0;
            int index = 0;

            while (index <= n-1) {
                int sum = l[index];
                count++;

                while (true) {
                    index++;
                    if (index >= n) break;

                    sum += l[index];
                    if (mid < sum) break;
                }
            }

            if (m < count) min = mid + 1;
            else {result = mid; max = mid - 1;}
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
