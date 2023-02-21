package _1_07_class;
import java.util.Scanner;

public class ex_02525_class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours = s.nextInt();
        int minutes = s.nextInt();
        int add_minutes = s.nextInt();

        Time t = new Time();
        t.setHoursAndMinutes(hours, minutes, add_minutes);
        t.printHoursAndMinutes();
    }
}

class Time {
    private int hours = 0;
    private int minutes = 0;

    public void setHoursAndMinutes(int hours, int minutes, int add_minutes) {
        this.hours = hours;
        this.minutes = minutes + add_minutes;

        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
        }

        this.hours %= 24;
        this.minutes %= 60;
    }

    public void printHoursAndMinutes() {System.out.format("%d %d", this.hours, this.minutes);}
     
}