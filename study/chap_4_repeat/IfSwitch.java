package study.chap_4;

public class IfSwitch {
    public static void main(String[] args) {
        int hour = 14;
        if (hour >= 14) System.out.println("no");
        else System.out.println("yes");

        int ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("1st rank");
                break;
            case 2:
                System.out.println("2nd rank");
                break;
            case 3:
                System.out.println("3rd rank");
                break;
            case 4:
            case 5:
                System.out.println("good job");
                break;
            default:
                break;
        }

        int grade = 1;
        int price = 7000;
        // 케이스를 만족하면서 밑에 break 가 없으면
        // break 를 만날 때까지 케이스를 모두 돌아버림
        // 1000 이 3번 더해짐 
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println(price);
    }
}
