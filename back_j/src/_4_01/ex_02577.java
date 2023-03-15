package _4_01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_02577 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int mul = a * b * c;
        int[] number_array = new int[10];
        while (mul != 0) {
            number_array[mul%10]++; mul /= 10;
        }
        for (int number_count : number_array) bw.write(Integer.toString(number_count) + "\n");
        bw.flush();
        bw.close();
    }
}
