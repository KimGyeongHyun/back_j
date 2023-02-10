package main._23._2._10_10_floorMod;
import java.util.Scanner;

public class ex_15953 {
    static int firstFest(int a){
        if (a==0) return 0;
        int grade = 1;
        if (a <= grade) return 5000000;
        grade += 2;
        if (a <= grade) return 3000000;
        grade += 3;
        if (a <= grade) return 2000000;
        grade += 4;
        if (a <= grade) return 500000;
        grade += 5;
        if (a <= grade) return 300000;
        grade += 6;
        if (a <= grade) return 100000;
        return 0;
    }

    static int secondFest(int a) {
        if (a==0) return 0;
        int grade = 1;
        int mul = 2;
        int reward = 5120000;
        for (int i = 0; i < 5; i ++){
            if (a <= grade) return reward;
            grade += mul;
            mul *= 2;
            reward /= 2;
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int a = s.nextInt(), b = s.nextInt();
            System.out.println(firstFest(a) + secondFest(b));
        }
    }
}
