package _3_04;
import java.util.Scanner;

public class ex_01357 {

    static int rev(int a) {
        if (a<10) return a;
        else if (a<100) return (a%10) * 10 + a/10;
        else if (a<1000) return (a%10) * 100 + ((a/10)%10) * 10 + a/100;
        else if (a<10000) return (a%10) * 1000 + ((a/10)%10) * 100 + ((a/100)%10) * 10 + a/1000;
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt();
        System.out.print(rev(rev(x) + rev(y)));
        s.close();
    }
}
