package _4_08;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_21608 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int fav[][] = new int[n*n+1][4];
        int c[][] = new int[n+1][n+1];
        int one_index = 0;


        for (int i = 0; i < n*n; i++) {
            st = new StringTokenizer(br.readLine());
            int sn = Integer.parseInt(st.nextToken());
            int l[] = new int[4];
            for (int j = 0; j < 4; j++) {
                int temp = Integer.parseInt(st.nextToken());
                l[j] = temp;
                fav[sn][j] = temp;
            }

            int one = 0;
            one_index = 0;
            int onel[][] = new int[n*n][2];

            for (int x = 1; x <= n; x++) {
                for (int y = 1; y <= n; y++) {

                    if (c[x][y] != 0) continue;

                    int t_one = 0;

                    if (2 <= x) {
                        for (int j = 0; j < 4; j++) {
                            if (l[j] == c[x-1][y]) {t_one++; break;}
                        }
                    }
                    if (x <= n-1) {
                        for (int j = 0; j < 4; j++) {
                            if (l[j] == c[x+1][y]) {t_one++; break;}
                        }
                    }
                    if (2 <= y) {
                        for (int j = 0; j < 4; j++) {
                            if (l[j] == c[x][y-1]) {t_one++; break;}
                        }
                    }
                    if (y <= n-1) {
                        for (int j = 0; j < 4; j++) {
                            if (l[j] == c[x][y+1]) {t_one++; break;}
                        }
                    }

                    if (one < t_one) {
                        one = t_one;
                        one_index = 0;
                        onel[one_index][0] = x;
                        onel[one_index][1] = y;
                        one_index++;
                    }
                    else if (one == t_one) {
                        onel[one_index][0] = x;
                        onel[one_index][1] = y;
                        one_index++;
                    }
                    
                }
            }

            if (one_index == 1) {
                c[onel[0][0]][onel[0][1]] = sn; continue;
            }

            int two = 0;
            int twol[] = new int[2];

            for (int j = 0; j < one_index; j++) {

                int x = onel[j][0];
                int y = onel[j][1];

                int t_two = 0;

                if (2 <= x && c[x-1][y] == 0) t_two++;
                if (x <= n-1 && c[x+1][y] == 0) t_two++;
                if (2 <= y && c[x][y-1] == 0) t_two++;
                if (y <= n-1 && c[x][y+1] == 0) t_two++;

                if (twol[0] == 0 && twol[1] == 0) {
                    two = t_two; twol[0] = x; twol[1] = y;
                }

                if (two < t_two) {
                    two = t_two; twol[0] = x; twol[1] = y;
                }
            }

            c[twol[0]][twol[1]] = sn;
        }

        int fav_sum = 0;
        
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                int f_count = 0;

                int sn = c[x][y];

                if (2 <= x) {
                    for (int j = 0; j < 4; j++) {
                        if (fav[sn][j] == c[x-1][y]) {f_count++; break;}
                    }
                }
                if (x <= n-1) {
                    for (int j = 0; j < 4; j++) {
                        if (fav[sn][j] == c[x+1][y]) {f_count++; break;}
                    }
                }
                if (2 <= y) {
                    for (int j = 0; j < 4; j++) {
                        if (fav[sn][j] == c[x][y-1]) {f_count++; break;}
                    }
                }
                if (y <= n-1) {
                    for (int j = 0; j < 4; j++) {
                        if (fav[sn][j] == c[x][y+1]) {f_count++; break;}
                    }
                }

                if (f_count == 0) continue;
                int score = 1;
                for (int j = 0; j < f_count-1; j++) score *= 10;
                fav_sum += score;
            }
        }
        bw.write(Integer.toString(fav_sum));
        bw.flush();
        bw.close();
    }
}
