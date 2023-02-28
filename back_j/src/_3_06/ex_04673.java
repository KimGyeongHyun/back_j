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

        int index = n / 10;
        int pre_cr = pred_n(index);

        while (pre_cr + 25 > n && 0 <= index) {
            if (pre_cr <= n && n <= pre_cr + 18 && (pre_cr - n) % 2 == 0) return false;
            pre_cr = pred_n(--index);
        }
        
        return true;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (is_not_self(i)) System.out.println(i);
        }
    }
}
