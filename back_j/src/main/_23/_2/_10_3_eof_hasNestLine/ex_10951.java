package main._23._2._10_3_eof_hasNestLine;
import java.util.Scanner;

public class ex_10951 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0, b = 0;

        while (true) {
            try{
                a = s.nextInt();
                b = s.nextInt();
            }
            catch(Exception e){
                break;
            }

            System.out.println(a+b);
        }
    }
}
