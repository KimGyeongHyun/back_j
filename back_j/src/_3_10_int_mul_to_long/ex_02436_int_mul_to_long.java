package _3_10_int_mul_to_long;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.Math;

public class ex_02436_int_mul_to_long {
    static int get_gcd(int x, int y) {
        if (y==0) return x;
        else return get_gcd(y, x % y);
    }

    static boolean is_gcd_lcm(int x, int y, int input_gcd, int input_lcm) {
        int gcd = get_gcd(x, y);
        int lcm = (int)((long)x * y / gcd);
        if (gcd == input_gcd && lcm == input_lcm) return true;
        return false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int gcd = Integer.parseInt(st.nextToken()), lcm = Integer.parseInt(st.nextToken());

        int mid = (int)Math.sqrt((long)gcd * lcm) + 1;
        int big = (int)((long)gcd * lcm / mid);

        while (true) {
            mid -= 1;
            if (mid % gcd == 0 && lcm % mid == 0) {
                big = (int)((long)gcd * lcm / mid);
                if (is_gcd_lcm(mid, big, gcd, lcm)) break;
            }
        }

        bw.write(Integer.toString(mid) + " " + Integer.toString(big));
        bw.flush();
        bw.close();
    }
}
