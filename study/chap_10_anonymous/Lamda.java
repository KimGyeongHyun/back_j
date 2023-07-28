package study.chap_10_anonymous;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// 함수형 인터페이스
// 구현해야 할 추상 메소드가 하나만 정의된 인터페이스
interface Math {
    public int Calc(int first, int second);
}

public class Lamda {
    public static void main(String[] args) {
        // 람다식
        // 기존 익명 구현 객체 활용 대신
        // 함수형 프로그래밍을 도입하면서 간단하게 표현 가능

        // 기본 구조
        // (매개변수) -> {실행문}

        // Comparator : compare 추상 메소드를 가지는 함수형 인터페이스
        // 람다식으로 compare 추상 메소드를 구현

        // 기존 익명 클래스 구현 방식
        Comparator<Integer> comp = new Comparator<Integer>() {
            // o1.compareTo(o2)
            // o1 이 크면 1, o2 이 크면 -1, 같으면 0 리턴
            @Override
            public int compare(Integer o1, Integer o2) {return o1.compareTo(o2);}
        };
        System.out.println(comp.compare(2, 1));

        // 람다 방식
        Comparator<Integer> comp2 = (o1, o2) -> (o1.compareTo(o2));
        System.out.println(comp2.compare(2, 1));

        // 익명 클래스로 배열 정렬
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(5); l1.add(3); l1.add(4); l1.add(2); l1.add(1);
        Collections.sort(l1, comp);
        for (Integer i : l1) System.out.print(i + ", ");
        System.out.println();

        // 람다식으로 배열 정렬
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(5); l2.add(3); l2.add(4); l2.add(2); l2.add(1);
        Collections.sort(l2, comp2);
        for (Integer i : l2) System.out.print(i + ", ");
        System.out.println();

        // 익명 내부 클래스
        // 새로운 클래스 생성

        // 람다
        // 새로운 메서드 생성

        // 중간 정리
        // 람다방식은 함수를 클래스 메소드처럼 쓰지만
        // 클래스를 만들지 않는다

        // Math 함수형 인터페이스를 이용하여 람다식 구현
        // 람다식으로 인터페이스의 메소드가 구현되며
        // 해당 인터페이스 메소드를 호출하면 람다식이 호출된다
        Math plusLambda = (first, second) -> first + second;
        System.out.println(plusLambda.Calc(4, 2));
        Math minusLambda = (first, second) -> first - second;
        System.out.println(minusLambda.Calc(4, 2));
    }
}
