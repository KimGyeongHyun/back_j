package _3_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_01748 {

    static int draw_number(int n) {
        int div = 1;
        int count = 0;
        int add_number = 1;
        while (true) {
            if (n/div > 9) count += 9 * div * add_number;
            else {
                count += add_number * (n - div + 1);
                break;
            }
            div *= 10; add_number++;
        }
        return count;
    }
    

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(draw_number(n)));

        bw.flush();
        bw.close();
    }
}
