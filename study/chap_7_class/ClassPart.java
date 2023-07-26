package study.chap_7;

class Student {
    String name;
    int age, koreanScore, mathScore, engScore;

    Student(String name, int age, int koreanScore, int mathScore, int engScore) {
        this.name = name;
        this.age = age;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    public void printScore() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("korean score : " + koreanScore);
        System.out.println("math score : " + mathScore);
        System.out.println("english score : " + engScore);
    }
}

public class ClassPart {
    public static void main(String[] args) {

        Student student1 = new Student("kkh", 18, 100, 90, 80);
        student1.printScore();
    }
}
