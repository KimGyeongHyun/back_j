package study.chap_9_gene;
import java.util.ArrayList;
import java.util.List;

public class GenericsPart {
    public static void main(String[] args) {
        // 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
        // 리스트 타입을 미리 선언 (객체 가능)
        // 타입을 지정하여 안정성을 높임 (예외 처리)
        // 타입 통일에 따른 코드 간결함
        
        // 리스트자료형<타입> ~
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("박지성");
        arrList.add("손흥민");
        arrList.add("기성용");

        for (String s : arrList) System.out.println(s);

        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Integer i : list) System.out.println(i);

        ArrayList<Sports> spList = new ArrayList<Sports>();
        spList.add(new Sports());
        spList.add(new Soccer("a"));
        spList.add(new Baseball());
        Sports sports = spList.get(0);
        Soccer soccer = (Soccer) spList.get(1);

        // 클래스, 인터페이스 인자(와 타입)전달 용도로 사용 가능
        // 여러 개의 제네릭 가지는 클래스 사용
        Player<Soccer, String> player = new Player<Soccer, String>(new Soccer("ManUtd"), "JSPark");

        FruitBox<Apple, Banana> box = new FruitBox<>(); // <> 안에 생략 가능
        box.add(new Apple(), new Banana());
        box.add(new Apple(), new Banana());

    }
}

class Sports{}
class Soccer extends Sports{
    public String team;
    Soccer(String team) {this.team = team;}
}
class Baseball extends Sports{}

// 선언문에서 타입을 임시로 지정하고
// main 문에서 타입을 구현하여 사용할 수 있다
// 보통 T: type, E: element, K: key, V: variable, N: number 로 사용
// 여러 제네릭을 가지는 클래스
class Player<T, S> {
    public T team;
    public S name;

    Player(T team, S name) {
        this.team = team;
        this.name = name;
    }
}

class Apple{}
class Banana {}
class FruitBox<T, U> {
    List<T> apples = new ArrayList<T>();
    List<U> bananas = new ArrayList<>();    // <> 안에 U 생략 가능

    public void add(T apple, U banana) {
        apples.add(apple); bananas.add(banana);
    }
}