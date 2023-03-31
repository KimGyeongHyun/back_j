package _4_07_StringBuilder;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ex_02447_StringBuilder {
    static void del_star(StringBuilder[] str, int r, int c, int n) {

        if (n == 1) return;

        for (int i = n/3; i < 2 * n/3; i++) {
            for (int j = n/3; j < 2 * n/3; j++) {
                str[r + i].setCharAt(c + j, ' ');
            }
        }

        int one = n/3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) del_star(str, r+i*one, c+j*one, one);
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder[] str = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            str[i] = new StringBuilder();
            for (int j = 0; j < n; j++) {
                str[i].append('*');
            }
        }

        del_star(str, 0, 0, n);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n; i++) {
            bw.write(str[i].toString() + "\n");
        }

        bw.flush();
        bw.close();
    }
}
