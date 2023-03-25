package _4_05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ex_01654 {

    static long get_number_of_len(int[] lens, int cut) {

        long number = 0;
        for (int len : lens) {
            number += len / cut;
        }

        return number;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] lens = new int[k];
        for (int i = 0; i < k; i++) lens[i] = Integer.parseInt(br.readLine());
        Arrays.sort(lens);

        int start = 0, end = lens[k-1];
        int mid;
        long len_number;

        while (true) {
            mid = (int)(((long)start + (long)end) / 2);

            if (mid == start) {
                long up_count = get_number_of_len(lens, mid+1);
                if (up_count >= n && up_count > get_number_of_len(lens, mid+2)) mid++;
                break;
            }

            len_number = get_number_of_len(lens, mid);

            if (len_number >= n) start = mid;
            else end = mid;
        }

        bw.write(Integer.toString(mid));
        bw.flush();
        bw.close();
    }
}
