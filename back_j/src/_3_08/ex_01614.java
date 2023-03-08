package _3_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_01614 {
    
    static long finger_count(int finger, int hurt) {

        if (finger == 1) return 8 * (long)hurt;

        else if (finger == 5) return 8 * (long)hurt + 4;

        else {
            int temp;
            if (hurt%2 == 0) temp = finger - 1;
            else temp = 9 - finger;
            return (long)hurt/2 * 8 + temp;
        }

    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int finger = Integer.parseInt(br.readLine());
        int hurt = Integer.parseInt(br.readLine());

        bw.write(Long.toString(finger_count(finger, hurt)));
        bw.flush();
        bw.close();
        
    }
}
