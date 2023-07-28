package study.chap_4_repeat;

public class ForWhile {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) System.out.print(i);
        System.out.println();
        for (int i = 0; i < 10; i += 2) System.out.print(i);
        System.out.println();

        int dist = 25, move = 0;
        while (move < dist) {
            System.out.println("moving " + move);
            move += 7;
        }

        // 반복문 안에 continue, break 사용 가능
    }
}
