package _4_06;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_10997 {

    static String star_blank() {return "* ";}

    static String blank_star() {return " *";}

    static String print_star(int n) {
        String tmp = "";
        for (int i = 0; i < n; i++) tmp += "*";
        return tmp;
    }

    static String print_blank(int n) {
        String tmp = "";
        for (int i = 0; i < n; i++) tmp += " ";
        return tmp;
    }

    static String up_star(int n) {

        if (n == 1) return "";

        String tmp = "";
        int up = 4 * n - 3;
        tmp += print_star(up);
        tmp += "\n";
        for (int i = 0; i < 2 * n - 2; i++) {
            for (int j = 1; j <= 1 + i/2; j++) tmp += star_blank();
            if (i != 0 && i % 2 == 0) tmp += print_blank(up-2-4*(i/2));
            if (i % 2 != 0) tmp += print_star(up-2-4*(i/2));
            for (int j = 1; j <= i/2; j++) tmp += blank_star();
            tmp += "\n";
        }

        return tmp;
    }

    static String middle_star(int n) {
        String tmp = "";
        for (int i = 0; i < n-1; i++) tmp += star_blank();
        tmp += "*";
        for (int i = 0; i < n-1; i++) tmp += blank_star();
        tmp += "\n";
        return tmp;
    }

    static String down_star(int n) {

        if (n == 1) return "";

        String tmp = "";
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < n-1 - i/2; j++) tmp += star_blank();
            if (i % 2 == 0) tmp += print_star(1 + (i/2) * 4);
            else tmp += print_blank(1 + (i/2) * 4);
            for (int j = 0; j < n-1 - i/2; j++) tmp += blank_star();
            tmp += "\n";
        }

        return tmp;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(up_star(n));
        bw.write(middle_star(n));
        bw.write(down_star(n));
        bw.flush();
        bw.close();
    }


    
}
