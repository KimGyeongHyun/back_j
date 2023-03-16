package _4_02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_13304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] l = new int[5];
        int s, y;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if (y <= 2) l[0]++;
            else if (s == 0 && y <= 4) l[1]++;
            else if (s == 1 && y <= 4) l[2]++;
            else if (s == 0 && y <= 6) l[3]++;
            else if (s == 1 && y <= 6) l[4]++;
        }

        int sum = 0;
        for (int number : l) {
            sum += number / k;
            if (number % k != 0) sum++;
        }

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
    
}
