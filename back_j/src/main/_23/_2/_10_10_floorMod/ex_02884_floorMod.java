package main._23._2._10_10_floorMod;
import java.util.Scanner;

public class ex_02884_floorMod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Time a = new Time();
        int hours = s.nextInt(), minutes = s.nextInt();
        a.setTime(hours, minutes);
        a.setAlertTime();
        a.printAlertTime();
    }
}

class Time {
    private int hours = 0;
    private int minutes = 0;

    public void setTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void setAlertTime() {
        this.minutes -= 45;
        if (this.minutes < 0) hours -= 1;
        this.hours = Math.floorMod(this.hours, 24);
        this.minutes = Math.floorMod(this.minutes, 60);
    }

    public void printAlertTime() {
        System.out.format("%d %d", this.hours, this.minutes);
    }
}