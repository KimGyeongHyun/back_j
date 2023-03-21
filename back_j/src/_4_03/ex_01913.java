package _4_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.Math;

public class ex_01913 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] number_list = new int[n][n];

        int x = n/2 - 1;
        int y = n/2;
        if (n%2 == 0) y--;

        for (int i = 1; i <= n; i++) {

            if (i%2 != 0) {
                x++;
                number_list[x][y] = (i-1)*(i-1) + 1;
                for (int j = 0; j < i-1; j++) {
                    y--;
                    number_list[x][y] = number_list[x][y+1] + 1;
                }
                for (int j = 0; j < i-1; j++) {
                    x--;
                    number_list[x][y] = number_list[x+1][y] + 1;
                }
            }

            else {
                x--;
                number_list[x][y] = (i-1)*(i-1) + 1;
                for (int j = 0; j < i-1; j++) {
                    y++;
                    number_list[x][y] = number_list[x][y-1] + 1;
                }
                for (int j = 0; j < i-1; j++) {
                    x++;
                    number_list[x][y] = number_list[x-1][y] + 1;
                }
            }
        }

        

        double d_index = Math.sqrt((double)m);
        int index = (int)d_index;
        if (d_index % 1 != 0) index++;

        x = n/2; y = n/2;
        if (n%2 == 0) y--;

        int move;
        if (index%2 != 0) {
            move = (index - 1) / 2;
            x += move; y += move;
            move = m - (index-1)*(index-1) - 1;
            if (move < index) y -= move;
            else {
                y -= index - 1;
                x -= move - (index - 1);
            }
        }

        else {
            move = (index - 2)/2;
            x -= move + 1;
            y -= move;
            move = m - (index-1)*(index-1) - 1;
            if (move < index) y += move;
            else {
                y += index - 1;
                x += move - (index - 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(Integer.toString(number_list[i][j]) + " ");
            }
            bw.write("\n");
        }

        bw.write(String.format("%d %d", x+1, y+1));


        bw.flush();
        bw.close();
    }
}
