package _4_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ex_01475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] number_list = new int[9];
        int input_int;
        double six;

        while (n != 0) {
            input_int = n % 10;
            if (input_int == 9) {
                number_list[6]++;
                n /= 10;
                continue;
            }
            number_list[input_int]++;
            n /= 10;
        }

        six = (double)number_list[6] / 2;
        number_list[6] = (int)six;
        if (six % 1 != 0) number_list[6]++;

        bw.write(Integer.toString(Arrays.stream(number_list).max().getAsInt()));
        bw.flush();
        bw.close();   
    }
}
