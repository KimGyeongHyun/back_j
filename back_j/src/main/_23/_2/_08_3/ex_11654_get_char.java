package main._23._2._08_3;
import java.util.Scanner;

public class ex_11654_get_char {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        String str = s.next();
        char c = str.charAt(0);
        System.out.print((byte)c);
    }

}
