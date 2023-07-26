package study.chap_1;

public class TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println((float)score);
        System.out.println((double)score);

        float score_f = 93.3f;
        System.out.println((int)score_f);

        score += (int)score_f;
        System.out.println(score);

        score_f += score;   // 자동 float 형변환
        System.out.println(score_f);

        double convertedScoreDouble = score;    // 자동 int -> double 형변환
        int convertedScoreInt = (int)score_f;
        // int -> float, double 은 자동 형변환 가능하지만 반대는 불가능

        String s1 = String.valueOf(93);     // String 클래스 형변환 메소드 이용 
        s1 = Integer.toString(93);          // 같은 결과
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        int i = Integer.parseInt(s1);
        System.out.println(i);

        double d = Double.parseDouble(s2);
        System.out.println(d);

    }
}
