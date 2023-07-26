package study.chap_8_abs_interface.Creature;

// Creature 상속, Talk 상속받는 추상클래스 Human
public abstract class Human extends Creature implements Talk{
    public Human(int x, int y, int age) {super(x, y, age);}
    
    // 추상클래스 메소드 구현
    @Override
    public void attack() {
        System.out.println("attack with knife");
    }
    // 인터페이스 메소드 구현
    @Override
    public void talk() {
        System.out.println("Talk");
    }
}
