package study.chap_8_abs_interface.Creature;

public class Kevin extends Human implements Programmer, Swimable{
    public Kevin(int x, int y, int age) {super(x, y, age);}

    // 인터페이스 Programmer 추상메소드 coding 구현
    @Override
    public void coding() {System.out.println("Hello World!");}

    // 인터페이스 Swimable 추상메소드 swimDown 구현
    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
        if (getY() < -10) {System.out.println("dangerous");}
    }

    // 추상클래스 Creature 추상메소드 printInfo 구현 
    @Override
    public void printInfo() {
        System.out.println("Kevin -> "+ toString());
    }
    
}
