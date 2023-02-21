package _1_07_class;
import java.util.Scanner;

public class ex_10101 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int count = 0;

        if (a==b) {count++;}
        if (a==c) {count++;}
        if (b==c) {count++;}

        if (a + b + c != 180) {System.out.print("Error"); return;}
        if (count >= 2) {System.out.print("Equilateral"); return;}
        if (count == 1) {System.out.print("Isosceles"); return;}
        else {System.out.print("Scalene"); return ;}
    }
}
