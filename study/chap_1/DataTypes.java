package study.chap_1;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(true);
        System.out.println(3.14);

        String name;
        name = "ggh";
        System.out.println(name + "님 안녕하세요");

        int hour = 15;
        System.out.println("현재 시간은 " + hour + "시 입니다.");

        double score = 90.5;
        char grade = 'A';
        System.out.println("평균 점수는 "+ score + "점 입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = true;
        System.out.println("합격 여부 : " + pass);

        double d = 3.14123123123; 
        float f = 3.14123123123f;    // float 변수를 사용하기 위해선 뒤에 f 넣어야 함
        
        System.out.println(d);
        System.out.println(f);  // 한계

        long l = 10_000_000_000L;  // int 보다 큰 자료구조
        System.out.println(l);
    }
}
