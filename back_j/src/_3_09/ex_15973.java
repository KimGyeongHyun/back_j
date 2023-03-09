package _3_09;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_15973 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int fx1 = Integer.parseInt(st.nextToken());
        int fy1 = Integer.parseInt(st.nextToken());
        int fx2 = Integer.parseInt(st.nextToken());
        int fy2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int sx1 = Integer.parseInt(st.nextToken());
        int sy1 = Integer.parseInt(st.nextToken());
        int sx2 = Integer.parseInt(st.nextToken());
        int sy2 = Integer.parseInt(st.nextToken());

        if ((fx2 == sx1 && fy2 == sy1) || 
        (fx2 == sx1 && fy1 == sy2) ||
        (fx1 == sx2 && fy1 == sy2) ||
        (fx1 == sx2 && fy2 == sy1)) bw.write("POINT\n");

        else if ((fx2 == sx1 || fx1 == sx2) && fy1 < sy2 && fy2 > sy1) bw.write("LINE\n");
        else if ((fy1 == sy2 || fy2 == sy1) && fx1 < sx2 && fx2 > sx1) bw.write("LINE\n");

        else if (fx1 < sx2 && fx2 > sx1 && fy1 < sy2 && fy2 > sy1) bw.write("FACE\n");

        else bw.write("NULL");
        
        bw.flush();
        bw.close();

    }
}
