package study.chap_2;

public class Operator {
    public static void main(String[] args) {
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        // 몫 연산이므로 나머지는 버려짐
        System.out.println(5/2);
        System.out.println(5%2);    // 나머지
        System.out.println((2+2)*2);

        int val = 10;
        System.out.println(val++);
        System.out.println(val++);
        System.out.println(++val);
        System.out.println(val++);
        System.out.println(val);
        
        int num1 = 10;
        num1 += 2;
        System.out.println(num1);
        num1 *= 2;
        System.out.println(num1);
        num1 /= 2;
        System.out.println(num1);

        System.out.println(5 > 3);
        System.out.println(5 >= 3);
        System.out.println(5 == 3);

        boolean b1 = true, b2 = true, b3 = true; 
        System.out.println(b1 || b2 || b3); // or
        System.out.println(b1 && b2 && b3); // and

        System.out.println(!true);  // not

        int x = 5, y = 3;
        int max = (x > y) ? x : y;  // 삼항 연산자
        System.out.println(max);
        boolean b4 = (x == y) ? true : false;
        System.out.println(b4);

        String s = (x != y) ? "diff" : "same";
        System.out.println(s);

    }
}
