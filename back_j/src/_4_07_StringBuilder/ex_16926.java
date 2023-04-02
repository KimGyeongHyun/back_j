package _4_07_StringBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.Math;
import java.util.Arrays;

public class ex_16926 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[][] l = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) l[i][j] = Integer.parseInt(st.nextToken());
        }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) bw.write(Integer.toString(l[i][j]) + " ");
        //     bw.write("\n");
        // }

        int ouro = Math.min((n+1)/2, (m+1)/2);
        int[][] tt = new int[ouro][];

        for (int i = 0; i < Math.min((n+1)/2, (m+1)/2); i++) {
            int length = 2 * (m + n) - 4 - 8 * i;
            int[] t = new int[length];
            int index = 0;
            for (int j = 0; j < m-1-(2*i); j++) t[index++] = l[i][i+j];
            for (int j = 0; j < n-1-(2*i); j++) t[index++] = l[i+j][m-1-i];
            for (int j = m-1-(2*i); j > 0; j--) t[index++] = l[n-1-i][i+j];
            for (int j = n-1-(2*i); j > 0; j--) t[index++] = l[i+j][i]; 

            tt[i] = t;
            
            // for (int j = 0; j < length; j++) bw.write(Integer.toString(t[j]) + " ");
            // bw.write("\n");
        }

        // for (int i = 0; i < ouro; i++) {
        //     for (int j = 0; j < tt[i].length; j++) bw.write(Integer.toString(tt[i][j]) + " ");
        //     bw.write("\n");
        // }

        for (int i = 0; i < ouro; i++) {
            int rep = r % tt[i].length;
            int one[] = Arrays.copyOfRange(tt[i], rep, tt[i].length) ;
            int two[] = Arrays.copyOfRange(tt[i], 0, rep);

            int newArray[] = new int[tt[i].length];
            System.arraycopy(one, 0, newArray, 0, one.length);
            System.arraycopy(two, 0, newArray, one.length, two.length);

            // for (int j = 0; j < newArray.length; j++) bw.write(Integer.toString(newArray[j]) + " ");
            // bw.write("\n");

            tt[i] = newArray;
        }

        for (int i = 0; i < Math.min((n+1)/2, (m+1)/2); i++) {
            int index = 0;
            for (int j = 0; j < m-1-(2*i); j++) l[i][i+j] = tt[i][index++];
            for (int j = 0; j < n-1-(2*i); j++) l[i+j][m-1-i] = tt[i][index++];
            for (int j = m-1-(2*i); j > 0; j--) l[n-1-i][i+j] = tt[i][index++];
            for (int j = n-1-(2*i); j > 0; j--) l[i+j][i] = tt[i][index++];
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) bw.write(Integer.toString(l[i][j]) + " ");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
