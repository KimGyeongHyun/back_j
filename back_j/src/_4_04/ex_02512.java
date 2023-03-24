package _4_04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.Math;

public class ex_02512 {
    static int get_total_money(int a[], int margin) {
        int sum_money = 0;
        for (int money : a) sum_money += Math.min(money, margin);
        return sum_money;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        int start = 0;
        int end = -1;
        for (int money : a) {
            if (end < money) end = money;
        }

        int mid, sum_money;

        while (true) {
            mid = (start + end) / 2;

            if (start == mid) {
                if (get_total_money(a, mid+1) <= m) mid++;
                break;
            }

            sum_money = get_total_money(a, mid);

            if (sum_money <= m) start = mid;
            else end = mid;

        }

        bw.write(Integer.toString(mid));
        bw.flush();
        bw.close();
    }
}
