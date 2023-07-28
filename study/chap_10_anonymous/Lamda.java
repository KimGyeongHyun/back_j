package study.chap_10_anonymous;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// 함수형 인터페이스
// 구현해야 할 추상 메소드가 하나만 정의된 인터페이스
interface Math {public int Calc(int first, int second);}

public class Lamda {
    public static void main(String[] args) {
        // 람다식
        // 기존 익명 구현 객체 활용 대신
        // 함수형 프로그래밍을 도입하면서 간단하게 표현 가능

        // 특징
        // 이름을 가질 필요가 없다 (익명 함수)
        // 두 개 이상의 입력이 있는 함수는 최종적으로 1개의 입력만 받는
        // 람다 대수로 단순화 될 수 있다. (Curing)

        // 장점
        // 코드의 간결성 - 불필요한 반복문의 삭제, 복잡한 식 단순화
        // 지연연산 수행 - 불필요한 연산 최소화 (결과값이 필요할 때까지 계산을 늦추는 기법)
        // 병렬처리 가능 - 멀티쓰레딩

        // 단점
        // 호출이 까다로움
        // stream 사용 시 단순 반복문에서 사용할 경우 성능 저하
        // 가독성을 떨어 뜨릴 수 있음

        // 기본 구조
        // (매개변수) -> {실행문}

        // 정상적인 유형
        // 함수 몸체가 단일 실행문 or return 문이라면 괄호 생략 가능
        // () -> {}
        // () -> 1
        // () -> { return 1; }

        // (int x) -> x+1
        // (x) -> x+1
        // x -> x+1
        // (int x) -> { return x+1; }
        // x -> { return x+1; }

        // (int x, int y) -> x+y
        // (x, y) -> x+y
        // (x, y) -> { return x+y; }

        // (String lam) -> lam.length()
        // lam -> lam.length()
        // (Thread lamT) -> { lamT.start(); }
        // lamT -> { lamT.start(); }

        // 잘못된 유형 선언된 type과 선언되지 않은 type을 같이 사용 할 수 없다.
        // (x, int y) -> x+y
        // (x, final y) -> x+y  

        // Comparator : compare 추상 메소드를 가지는 함수형 인터페이스
        // 람다식으로 compare 추상 메소드를 구현

        // 1. 기존 익명 클래스 구현 방식
        Comparator<Integer> comp = new Comparator<Integer>() {
            // o1.compareTo(o2)
            // o1 이 크면 1, o2 이 크면 -1, 같으면 0 리턴
            @Override
            public int compare(Integer o1, Integer o2) {return o1.compareTo(o2);}
        };
        System.out.println(comp.compare(2, 1));

        // 2. 람다 방식
        Comparator<Integer> comp2 = (o1, o2) -> (o1.compareTo(o2));
        System.out.println(comp2.compare(2, 1));

        // 익명 클래스로 배열 정렬
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(5); l1.add(3); l1.add(4); l1.add(2); l1.add(1);
        for (Integer i : l1) System.out.print(i + ", ");
        System.out.println();
        Collections.sort(l1, comp);     // 정렬
        for (Integer i : l1) System.out.print(i + ", ");
        System.out.println();

        // 람다식으로 배열 정렬
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(5); l2.add(3); l2.add(4); l2.add(2); l2.add(1);
        for (Integer i : l2) System.out.print(i + ", ");
        System.out.println();
        Collections.sort(l2, comp2);    // 정렬
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

        // 스레드 구현
        // Thread 는 Runnable 람다 함수가 인자로 전달되며
        // start() 함수로 Runnable 람다 함수 실행
        Runnable run = () -> System.out.println("run() method called");
        Thread th = new Thread(run);
        th.start();
    }
}
