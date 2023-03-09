package _3_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_02022 {
    static double get_guess_width(double x, double y, double c) {
        double max;
        if (x < y) max = x;
        else max = y;
        double min = 0.0;
        double width = (min + max) / 2;

        double left, right, guess_c;

        while (true) {
            

            left = Math.sqrt(x*x - width*width);
            right = Math.sqrt(y*y - width*width);

            guess_c = left * right / (left + right);

            if (c - 0.0005 <= guess_c && guess_c <= c + 0.0005) return width;
            if (c > guess_c) max -= (max - min) / 2;
            else min += (max - min) / 2;
            width = (max + min) / 2;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        bw.write(Double.toString(get_guess_width(x, y, c)));
        bw.flush();
        bw.close();
    }
}
