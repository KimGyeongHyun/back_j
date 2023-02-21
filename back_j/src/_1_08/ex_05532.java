package _1_08;
import java.util.Scanner;

public class ex_05532 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();    // ���� �ϼ�
        int A = s.nextInt();    // ���� ������
        int B = s.nextInt();    // ���� ������
        int C = s.nextInt();    // �Ϸ� ���� ������ Ǫ�� ��
        int D = s.nextInt();    // �Ϸ� ���� ������ Ǫ�� ��

        int korean = L - ((A-1) / C + 1);
        int math = L - ((B-1) / D + 1);

        System.out.print(Math.min(korean, math));
    }
    

}
