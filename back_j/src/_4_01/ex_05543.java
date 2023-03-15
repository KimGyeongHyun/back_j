package _4_01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_05543 {

    static int get_min(int[] arr) {
        int min = arr[0];
        for(int money : arr) {
            if (min > money) min = money;
        }
        return min;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] burger = new int[3];
        burger[0] = Integer.parseInt(br.readLine());
        burger[1] = Integer.parseInt(br.readLine());
        burger[2] = Integer.parseInt(br.readLine());

        int[] drink = new int[2];
        drink[0] = Integer.parseInt(br.readLine());
        drink[1] = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(get_min(burger) + get_min(drink) - 50));
        bw.flush();
        bw.close();
    }
}
