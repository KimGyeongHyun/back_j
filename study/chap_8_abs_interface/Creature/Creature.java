package study.chap_8_abs_interface.Creature;

// 최상위 추상클래스
public abstract class Creature {
    private int x, y, age;

    public Creature(int x, int y, int age) {
        this.age = age;
        this.x = x;
        this.y = y;
    }

    public void age() {age++;}
    public void move(int xDistance) {x += xDistance;}
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
    // 추상메소드
    public abstract void attack();      
    public abstract void printInfo();
    public String toString() {
        return "x : " + x + ", y : " + y + ", age : " + age;
    }
}