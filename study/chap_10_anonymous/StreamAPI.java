package study.chap_10_anonymous;
import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args) {
        // Stream
        // 다양한 데이터를 표준화된 방법으로 다루기 위한 라이브러리
        
        // stream() : 스트림 생성
        // filter : 중간 연산 (스트림 변환) (연속 수행 가능)
        // count : 최종 연산 (스트림 사용) (마지막에 한 번 사용 가능)

        // 특징
        // 데이터 변경 X
        // 1회용
        // 지연 연산 수행
        // 병렬 실행 가능

        // 종류
        // Stream<T> : 범용 Stream
        // IntStream, LongStream, DoubleStream

        IntStream.range(1, 11).filter(i -> i%2==0).forEach(System.out::println);
    }
}
