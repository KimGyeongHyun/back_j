package _4_07_Others;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ex_10164_BigInteger {
    
    static BigInteger[] factorial_list = new BigInteger[31];

    static int get_length() {
        int index = 1;
        while (index <= 14 && factorial_list[index+1] != BigInteger.ONE) index++;
        return index;
    }

    static BigInteger factorial(int n) {

        int index = get_length();

        if (n <= index) return factorial_list[n];

        BigInteger value = factorial(n-1).multiply(BigInteger.valueOf(n));
        factorial_list[n] = value;

        return value;
    }

    static BigInteger combination(int n, int r) {

        if (n <= 1 || n == r || r == 0) return BigInteger.ONE;

        return factorial(n).divide(factorial(r).multiply(factorial(n-r)));

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.fill(factorial_list, BigInteger.ONE);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (k == 0) k++;

        int x = (k-1) % m;
        int y = (k-1) / m;

        BigInteger value = combination(x+y, y).multiply(combination(m+n-2-x-y, m-1-x));

        bw.write(value.toString());
        bw.flush();
        bw.close();
    }
}
