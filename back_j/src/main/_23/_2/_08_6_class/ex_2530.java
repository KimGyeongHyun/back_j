package main._23._2._08_6_class;
import java.util.Scanner;

public class ex_2530 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hours = s.nextInt();
        int minutes = s.nextInt();
        int seconds = s.nextInt();
        int cook_time = s.nextInt();

        TimeSmart t = new TimeSmart();
        t.setValue(hours, minutes, seconds, cook_time);
        t.printTime();
    }
}

class TimeSmart {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public void setValue(int hours, int minutes, int seconds, int cook_time) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds + cook_time;

        this.minutes += this.seconds / 60;
        this.seconds %= 60;

        this.hours += this.minutes / 60;
        this.minutes %= 60;

        this.hours %= 24;
    }

    public void printTime() {
        System.out.format("%d %d %d",
        this.hours, this.minutes, this.seconds);
    }
}