package study.chap_10_anonymous;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.OptionalInt;
import java.util.Map;

class Product {

    int number; String name;

    Product(int number, String name) {
        this.number = number; this.name = name;
    }

    public String getName() {return name;}
    public Integer getAmount() {return number;}
}

public class StreamAPI {
    
    public static void main(String[] args) {
        // Stream
        // 다양한 데이터를 표준화된 방법으로 다루기 위한 라이브러리
        // 람다 활용
        // 배열, 컬렉션 인스턴스에 함수 여러 개를 조합하여
        // 원하는 결과 필터링, 가공된 결과 얻을 수 있음
        // 지연연산, 병렬처리 가능
        // 데이터 변경 불가능, 1회용 연산
        // 멀티스레드 코드 구현 없이 데이터를 투명하게 병렬로 처리 가능
        // 최적화, 유연성 좋음

        // 기존 Collection 으로 했던 일을 Stream API 로 처리
        // Collection 은 직접 반복문 명시, 로직 작성 필요
        // 반면 Stream 은 내부반복 사용, 로직만 작성하면 알아서 처리됨
        // 내부 반복은 병렬 처리 자동으로 처리
        
        // 스트림은 스레드 간 공유되지 않는 변수 참조하거나 변경할 때
        // final 또는 effectively final 한 변수로 제한,
        // 병렬처리에서 발생할 수 있는 동시성 문제를 조금이나마 막음

        // stream() : 스트림 생성
        // filter : 중간 연산 (스트림 변환, 가공) (연속 수행 가능)
        // count : 최종 연산 (스트림 사용, 결과 획득) (마지막에 한 번 사용 가능)
        // 전체 -> 맵핑 -> 필터링 1 -> 필터링 2 -> 결과 만들기 -> 결과물

        // 종류
        // Stream<T> : 범용 Stream
        // IntStream, LongStream, DoubleStream

        // =============================================================================
        // 스트림 생성

        // 배열 스트림 생성
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(arr);
        // 1~2 요소 [b, c]
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        
        // 컬렉션 스트림 (Collection, List, Set) 생성
        List<String> list = Arrays.asList("a", "b", "c:");
        Stream<String> stream2 = list.stream();
        Stream<String> parallelStream = list.parallelStream();

        // Stream.builder()
        // 스트림에 직접적으로 원하는 값 넣을 수 있음
        // 마지막에 build 메소드로 스트림 리턴
        // [Eric, Elena, Java]
        Stream<String> builderStream = Stream.<String>builder()
        .add("Eric").add("Elena").add("Java").build();

        // Stream.generate()
        // Supplier<T> 에 해당하는 람다로 값 넣을 수 있음
        // 인자 없이 리턴값만 있는 함수형 인터페이스
        // 최대 크기 지정 필요
        // [el, el, el, el, el]
        // 5개의 "gen" 이 들어간 스트림 생성
        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5);

        // Stream.iterate()
        // 초기값과 람다를 이용해서 스트림에 들어갈 요소 만듦
        // [30, 32, 34, 36, 38]
        Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5);

        // 기본 타입형 스트림 (int, long, double)
        // 리스트, 배열 이용해서 스트림 생성
        // range, rangeClosed 는 두 번째 인자인 종료지점 포함 여부 차이
        IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
        LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]

        // 제네릭을 사용하지 않기 때문에 불필요한 오토박싱이 일어나지 않음
        // boxed 메소드로 박싱
        Stream<Integer> boxedIntStream  = IntStream.range(1, 5).boxed();

        // 난수 스트림 생성
        DoubleStream doubles = new Random().doubles(3);

        // 문자열 스트림
        // 각 문자를 IntStream 으로 변환
        // [83, 116, 114, 101, 97, 109]
        // IntStream charsStream = "Stream".chars(5);

        // 정규 표현식 이용해서 문자열 자르고 각 요소들로 스트림 생성
        // [Eric, Elena, Java]
        Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, Java");

        // 파일 스트림
        // 각 라인 스트링 타입의 스트림 생성
        // Stream<String> lineStream = Files.lines(Paths.get("file.txt"), Charset.forName("UTF-8"));

        // 스트림 연결
        // [Java, Scala, Groovy, Python, Go, Swift]
        Stream<String> stream3 = Stream.of("Java", "Scala", "Groovy");
        Stream<String> stream4 = Stream.of("Python", "Go", "Swift");
        Stream<String> concat = Stream.concat(stream3, stream4);

        // 병렬 스트림
        // 생성
        // Product 는 클래스, productList 는 Product 객체 리스트
        // Stream<Product> parallelStream = productList.parallelStream();

        // 병렬 여부 확인
        // parallelStream : 이전에 ["a", "b", "c"] 리스트를 병렬 스트림으로 생성해놓음
        // 결과는 true 
        boolean isParallel = parallelStream.isParallel();

        // 예시
        // boolean isMany = parallelStream
        // .map(product -> product.getAmount() * 10)
        // .anyMatch(amount -> amount > 200);

        // 배열을 이용해서 병렬 스트림 생성
        // Arrays.stream(arr).parallel();

        // =============================================================================
        // 가공하기 (중간 작업)
        // 원하는 것만 뽑아냄
        // 스트림 리턴이기 때문에 여러 작업 이어붙일 수 있음

        List<String> names = Arrays.asList("Eric", "Elena", "Java");

        // Filtering
        // 요소들 하나씩 평가해서 걸러냄
        // boolean 리턴하는 함수형 인터페이스가 평가식으로 들어감
        // [Elena, Java]
        Stream<String> stream = names.stream().filter(name -> name.contains("a"));

        // Mapping
        // 요소들 하나씩 특정 값으로 변환
        // 값을 변환하기 위한 람다 인자로 받음
        // [ERIC, ELENA, JAVA]
        // :: 는 람다식에서 메소드 참조 표현할 때 쓰임
        Stream<String> stream5 = names.stream().map(String::toUpperCase);

        // Sorting
        // 원래는 Collections.sort(List<T>, lambda) 로 List<T> 안의 요소 정렬
        // 대신 아래 식으로 가비지 변수인 List<T> 를 만들지 않고 정렬된 배열 추출 가능
        IntStream.of(14, 11, 20, 39, 23)
        .sorted().boxed().collect(Collectors.toList());

        List<String> lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");
        lang.stream().sorted().collect(Collectors.toList()); // 알파벳 순 정렬
        lang.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // 반대 정렬
        
        // 문자열 길이 기준 정렬
        lang.stream().sorted(Comparator.comparingInt(String::length)).
        collect(Collectors.toList());
        // 반대 정렬
        lang.stream().sorted((s1, s2) -> s2.length() - s1.length()).
        collect(Collectors.toList());

        // Iterating
        // 요소들 각각에 대해 특정 연산 수행
        // peek : 리턴이 없는 함수형 인터페이스를 인자로 받음
        // 특정 작업만 수행하고 결과에 영향을 미치지 않음
        int sum = IntStream.of(1, 3, 5, 7, 9)
        .peek(System.out::println).sum();

        // =============================================================================
        // 결과 만들기

        // Calculating
        // count : 갯수, sum() 총합
        long count = IntStream.of(1, 3, 5, 7, 9).count();

        // min, max 는 요소가 없으면 표현할 수 없으므로 Optional 을 이용해 리턴
        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        OptionalInt max = IntStream.of().max();

        // ifPresent() : 값을 가지고 있는지 확인 후 예외처리 (Optional)
        // 즉, 요소가 없으면 그냥 넘어감
        DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)
        .average().ifPresent(System.out::println);
        
        // Reduction
        // reduce() 메소드
        // 총 세 가지의 파라미터 받을 수 있음
        // accumulator : 각 요소를 처리하는 계산 로직
        // identity : 계산을 위한 초기값, 내용 없어도 이 값은 리턴
        // combiner : 병렬 스트림에서 나눠 계산한 결과를 합치는 로직

        // 인자 1 개 (accumulator)
        // 같은 타입의 인자 두 개를 받아 같은 타입의 결과를 반환하는 함수형 인터페이스 전달
        // [1, 2, 3] 총합 리턴 6
        OptionalInt reduced = IntStream.range(1, 4)     
        .reduce((a, b) -> {return Integer.sum(a, b);});

        // 인자 2 개 (identity, accumulator)
        // 10 이 초기값, 모두 더하여 16
        int reducedTwoParams = IntStream.range(1, 4)
        .reduce(10, Integer::sum);

        // 인자 3 개 (identity, accumulator, combiner)
        // Combiner 는 병렬 처리 시 각자 다른 쓰레드에서 실행한 결과를
        // 마지막에 합치는 단계 (병렬 스트림에서만 동작)
        // 아래 코드에서는 병렬 스트림이 아니므로 Combiner 가 동작하지 않음 (16)
        Integer reducedParams = Stream.of(1, 2, 3)
        .reduce(10,
                Integer::sum,
                (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                }
        );
        
        // 병렬 스트림
        // 10+1, 10+2, 10+3 의 총합이 리턴됨 (36)
        Integer reducedParallel = Arrays.asList(1, 2, 3)
        .parallelStream()
        .reduce(10, 
                Integer::sum,
                (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });

        reduced.ifPresent(System.out::println); // 6
        System.out.println(reducedTwoParams);   // 16
        System.out.println(reducedParams);      // 16
        System.out.println(reducedParallel);    // 36

        // Collecting
        // Collectors 객체에서 자주 사용하는 인자 제공

        List<Product> productList =
        Arrays.asList(
            new Product(23, "potatoes"),
            new Product(14, "orange"),
            new Product(13, "lemon"),
            new Product(23, "bread"),
            new Product(13, "sugar")
        );

        // [potatoes, orange, lemon, bread, sugar]
        List<String> collectorCollection =
        productList.stream()
        .map(Product::getName)
        .collect(Collectors.toList());
        
        // potatoesorangelemonbreadsugar
        String listToString =
        productList.stream()
        .map(Product::getName)
        .collect(Collectors.joining());
        System.out.println(listToString);

        // <potatoes, orange, lemon, bread, sugar>
        String listToString2 =
        productList.stream()
        .map(Product::getName)
        .collect(Collectors.joining(", ", "<", ">"));
        System.out.println(listToString2);

        // 17.2
        Double averageAmount =
        productList.stream()
        .collect(Collectors.averagingInt(Product::getAmount));
        System.out.println(averageAmount);

        // 86
        Integer summingAmount =
        productList.stream()
        .collect(Collectors.summingInt(Product::getAmount));
        System.out.println(summingAmount);

        // Collectors.groupingBy()
        // 특정 조건으로 요소들을 그룹지을 수 있다

        // Map 타입으로 묶음
        Map<Integer, List<Product>> collectorMapOfLists =
        productList.stream()
        .collect(Collectors.groupingBy(Product::getAmount));

        // Map 타입의 다양한 방법으로 묶는 방법이 있음

        // Collector.of()
        // 이 외에 필요한 로직이 있다면
        // 직접 collector 로직을 만들어 Collector 생성
        // reduce 와 동일한 파라미터 존재
        Collector<Product, ?, LinkedList<Product>> toLinkedList = 
        Collector.of(LinkedList::new, 
            LinkedList::add, 
            (first, second) -> {
                first.addAll(second);
                return first;
        });

        // 결과가 담긴 LinkedList 리턴
        LinkedList<Product> linkedListOfPersons = 
        productList.stream()
        .collect(toLinkedList);

        // Matching
        // 람다 Predicate 받아 해당 조건 만족하는 요소 체크, 결과 리턴
        // anyMatch() : 하나라도 조건을 만족하는 요소가 있는지
        // allMatch() : 모두 조건을 만족하는지
        // noneMatch() : 모두 조건을 만족하지 않는지
        
        boolean anyMatch = names.stream()
        .anyMatch(name -> name.contains("a"));
        boolean allMatch = names.stream()
        .allMatch(name -> name.length() > 3);
        boolean noneMatch = names.stream()
        .noneMatch(name -> name.endsWith("s"));

        // Iterating
        // 요소를 돌면서 실행되는 최종 작업
        // 보통 sout 메소드 넘겨 결과 출력에 사용
        // peek 과는 중간, 최종 작업의 차이
        names.stream().forEach(System.out::println);
    }
}

// 코드 참고 : https://futurecreator.github.io/2018/08/26/java-8-streams/