package _4_04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_02852 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];
        int team, time, minute, second;
        String tstr;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            team = Integer.parseInt(st.nextToken());
            tstr = st.nextToken();
            String t_time[] = tstr.split(":");
            minute = Integer.parseInt(t_time[0]);
            second = Integer.parseInt(t_time[1]);
            time = 60 * minute + second;

            a[i][0] = team;
            a[i][1] = time;
        }

        int before_time = 0;
        int f_score = 0;
        int s_score = 0;
        int f_time = 0;
        int s_time = 0;

        for (int i = 0; i < n; i++) {
            if (f_score > s_score) f_time += a[i][1] - before_time;
            else if (s_score > f_score) s_time += a[i][1] - before_time;

            if (a[i][0] == 1) f_score++;
            else if (a[i][0] == 2) s_score++;

            before_time = a[i][1];

        }

        if (f_score > s_score) f_time += 48 * 60 - before_time;
        else if (s_score > f_score) s_time += 48 * 60 - before_time;

        bw.write(String.format("%02d:%02d\n", f_time/60, f_time%60));
        bw.write(String.format("%02d:%02d\n", s_time/60, s_time%60));
        bw.flush();
        bw.close();
    }
}
