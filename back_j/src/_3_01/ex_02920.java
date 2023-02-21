package _3_01;
import java.util.Scanner;

public class ex_02920 {
    static void scale() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt(), e = s.nextInt(), f = s.nextInt(), g = s.nextInt(), h = s.nextInt();
        if (a==1 && b==2 && c==3 && d==4 && e==5 && f==6 && g==7 && h==8) System.out.print("ascending");
        else if (a==8 && b==7 && c==6 && d==5 && e==4 && f==3 && g==2 && h==1) System.out.print("descending");
        else System.out.print("mixed");
    }

    public static void main(String[] args) {
        scale();
    }
}
