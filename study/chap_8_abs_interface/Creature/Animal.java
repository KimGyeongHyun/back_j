package study.chap_8.Creature;

// Creature 상속 받는 추상클래스 Animal
public abstract class Animal extends Creature {
    public Animal(int x, int y, int age) {super(x, y, age);}
    @Override
    public void attack() {
        System.out.println("attack with body");
    }
}



