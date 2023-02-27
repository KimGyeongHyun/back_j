package _3_05;
import java.util.Scanner;
import java.lang.Math;

public class ex_01526 {

    static int get_gummin(int n) {

        int index = 0;  // n�� �ڸ����� ��Ÿ�� �ε���
        int result = 0;

        // 'n�� �ִ� �ڸ��� - 1'�� ã�� index �� ����
        while (n >= Math.pow(10, index)) index++;
        index--;

        // ����� ���� ������ �ݺ�
        while (0 <= index) {
            
            // n�� index+1 ��° �ڸ��� ���ڸ� ã�� index_number �� ����
            int index_number = n / (int)Math.pow(10, index);

            // index_number �� 4, 7�� �ƴ϶�� ���� ó��
            if (index_number != 4 && index_number != 7) {
                // 7 �ʰ���� index+1 ��° �ڸ����� 7�� ����
                if (7 < index_number) result += 7 * (int)Math.pow(10, index);
                // 4 �ʰ� 7 �̸��̶�� index+1 ��° �ڸ����� 4�� ����
                else if (4 < index_number) result += 4 * (int)Math.pow(10, index);
                // ������ index ~ 1 ��° �ڸ����� 7�� ���� �� ����
                while (index-- > 0) result += 7 * (int)Math.pow(10, index);
                return result;
            }

            // index_number �� 4 �Ǵ� 7�� ���
            else {
                int low_index_number;   // index_number �� �Ʒ����� index ��° �ڸ��� ���ڸ� ã�� low_index_number �� ����
                // index �� 1��° �ڸ������� �����Դٸ� ���� ó��
                if (index == 0) low_index_number = 9;
                // �ƴ϶�� ���������� index ��° �ڸ��� ���� ����
                else low_index_number = (n / (int)Math.pow(10, index-1)) % 10;

                // low_index_number �� 4 �̸��̶�� ���� ó��
                if (low_index_number < 4) {
                    // index_number �� 7�̶�� index+1 ��° �ڸ����� 4�� ����
                    if (index_number == 7) result += 4 * (int)Math.pow(10, index);
                    // ������ index ~ 1 ��° �ڸ����� 7�� ���� �� ����
                    while (index-- > 0) result += 7 * (int)Math.pow(10, index);
                    return result;
                }
                // 4 �̻��̶��
                else {
                    // index+1 ��° �ڸ����� index_number ����
                    result += index_number * (int)Math.pow(10, index);

                    // 1�� �ڸ������� �����Դٸ� ���� ó��
                    if (index==0) return result;

                    // n�� index+1 ��° �ڸ����� ����, index �� 1�� ��
                    // while �� �ݺ�
                    n -= index_number * (int)Math.pow(10, index);
                    index--;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(get_gummin(n));
        s.close();
    }
}
