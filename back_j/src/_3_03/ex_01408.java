package _3_03;
import java.util.Scanner;
import java.lang.Math;

public class ex_01408 {

    
    public static void main(String[] args) {
        // int a = (-35)/24;
        // int b = (-35)%24;
        // System.out.format("%d %d", a, b);

        Scanner s = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        int a, b, c;

        String v[] = s.next().split(":");
        a = Integer.parseInt(v[0]);
        b = Integer.parseInt(v[1]);
        c = Integer.parseInt(v[2]);
        t1.init_time(a, b, c);

        String x[] = s.next().split(":");
        a = Integer.parseInt(x[0]);
        b = Integer.parseInt(x[1]);
        c = Integer.parseInt(x[2]);
        t2.init_time(a, b, c);

        t2.sub_time(t1);
        t2.print_time();
    }
}


class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public void init_time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void sub_time(Time t) {
        this.hour -= t.hour;
        this.minute -= t.minute;
        this.second -= t.second;
        this.set_time();
    }

    public void set_time() {
        if (this.second < 0) {
            this.minute -= 1;
            this.second = Math.floorMod(this.second, 60);
        }

        if (this.minute < 0) {
            this.hour -= 1;
            this.minute = Math.floorMod(this.minute, 60);
        }

        if (this.hour < 0) this.hour += 24;
    }

    public void print_time() {System.out.format("%02d:%02d:%02d", this.hour, this.minute, this.second);}
    
}