package study.chap_8_abs_interface.Creature;

public class Turtle extends Animal implements Swimable {
    public Turtle(int x, int y, int age) {super(x, y, age);}

    // 인터페이스 Swimable 의 추상메소드 swimDown 구현
    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
    }

    // 추상클래스 Creature 추상메소드를 구현
    @Override
    public void printInfo() {
        System.out.println("Turtle -> " + toString());
    }
}
