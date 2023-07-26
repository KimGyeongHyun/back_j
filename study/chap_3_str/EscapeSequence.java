package study.chap_3_str;

public class EscapeSequence {
    public static void main(String[] args) {
        System.out.println("I\nlove\nJava");    // next line
        System.out.println("a\tb\tc");          // tab
        System.out.println("//\\\\");           // \
        System.out.println("\"\"''");             // "", ''
        // 작은따옴표로 '를 표현해야 할 때 \' 사용
    }
}
