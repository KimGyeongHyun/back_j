package _3_06;

public class ex_04673 {

    static int pred_n(int a) {
        int div = 1;
        int sum_a = 0;
        while (0 < a/div) {
            sum_a += (a/div)%10;
            div *= 10;
        }
        return 10 * a + sum_a;
    }

    static boolean is_not_self(int n) {
        if (n < 10){
            if (n%2 == 0) return false;
            else return true;
        }
        if (n < 30) {
            if (n==20) return true;
            else return false;
        }

        int index = n / 10;
        int pre_cr = pred_n(index);

        while (30 <= pre_cr + 30 && index != 0) {
            if (0 <= n - pre_cr && n - pre_cr <= 18 && (pre_cr - n) % 2 == 0) return false;
            pre_cr = pred_n(index--);
        }
        
        return true;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (is_not_self(i)) System.out.println(i);
        }
    }
}
