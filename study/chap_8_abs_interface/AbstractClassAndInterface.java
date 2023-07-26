package study.chap_8;
import study.chap_8.Creature.Pigeon;
import study.chap_8.Creature.Turtle;
import study.chap_8.Creature.Kevin;


public class AbstractClassAndInterface {
    public static void main(String[] args) {
        // 추상클래스
        // abstract 예약어를 사용
        // 상속을 통해서 구현해야 한다는 것을 알려줌
        Pigeon p = new Pigeon(5, 10, 14);
        p.printInfo();
        p.age();
        p.move(100);
        p.printInfo();
        p.flyMove(10, 20);
        p.printInfo();
        System.out.println();

        Kevin k = new Kevin(0, 0, 35);
        k.printInfo();
        k.age();
        k.move(10);
        k.printInfo();
        k.attack();
        k.coding();
        k.swimDown(20);
        k.printInfo();
        k.talk();
        System.out.println();
        
        Turtle tur = new Turtle(100, -10, 95);
        tur.printInfo();
        tur.age();
        tur.move(-100);
        tur.printInfo();
        tur.attack();
        tur.swimDown(1000);
        tur.printInfo();
    }
}
