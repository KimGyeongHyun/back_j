package study.chap_8_abs_interface.Creature;

// Human 을 상속, Flyable 을 상속받는 클래스 Pigeon
public class Pigeon extends Animal implements Flyable{
    public Pigeon(int x, int y, int age) {super(x, y, age);}

    // Flyable 인터페이스 추상클래스 fly 구현
    @Override
    public void fly(int yDistance) {setY(getY() + yDistance);}

    // Flyable 인터페이스 추상클래스 flyMove 구현
    @Override
    public void flyMove(int xDistance, int yDistance) {
        setY(getY() + yDistance);
        setX(getX() + xDistance);
    }

    // 추상클래스 Creature 추상메소드를 구현
    @Override
    public void printInfo() {
        System.out.println("Pigeon -> " + toString());
    }
}
