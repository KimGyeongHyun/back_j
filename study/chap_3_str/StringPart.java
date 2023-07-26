package study.chap_3_str;

public class StringPart {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s.length());
        // 원본을 바꾸지 않음
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("Java")); // 포함 여부
        // 문자열 시작 인덱스, 없으면 -1
        System.out.println(s.indexOf("Java", 0)); 
        // 마지막에 시작하는 인덱스
        System.out.println(s.lastIndexOf("and", 0));
        // 해당 문자열로 시작하는지 여부
        System.out.println(s.startsWith("I like", 0));
        System.out.println(s.endsWith("C."));

        // 대체
        System.out.println(s.replace(" and", ","));
        // 슬라이싱
        System.out.println(s.substring(2, 5));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        // 공백 제거
        s = "      I love Java.            ";
        System.out.println(s.trim());   // 앞, 뒤 공백 제거
        // 문자열 결합
        String s1 = "Java", s2 = "Python";
        System.out.println(s1 + "," + s2);
        // 문자열 결합하여 리턴
        System.out.println(s1.concat(",").concat(s2));

        // 비교 (대소문자 구별)
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("java"));
        // 대소문자 구별 X
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 == 과 비교
        s1 = "1234"; s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);   // true
        s1 = new String("1234"); s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);   // 여기서는  false
        // = "~" 로 할당할 경우
        // 같은 내용일 경우 다른 곳에 생성하지 않고 같은 곳을 참조함
        // equals : 내용 비교, == : 참조가 같은지 비교
        // 만약 내용이 달라지만 다른 주소로 바뀜
    }
}
