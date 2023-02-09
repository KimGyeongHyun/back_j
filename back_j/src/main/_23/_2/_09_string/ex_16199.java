package main._23._2._09_string;
import java.util.Scanner;

public class ex_16199 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int byear = s.nextInt(), bmonth = s.nextInt(), bday = s.nextInt();
        int cyear = s.nextInt(), cmonth = s.nextInt(), cday = s.nextInt();
        
        int man = cyear - byear;
        if (bmonth > cmonth) man -= 1;
        if (bmonth == cmonth)
        {if (bday > cday) man -= 1;}

        int se = 1;
        se += cyear - byear;

        int yeon = 0;
        yeon += cyear - byear;

        System.out.format("%d\n%d\n%d", man, se, yeon);

    }
}
