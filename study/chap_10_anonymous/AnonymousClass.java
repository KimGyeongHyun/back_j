package study.chap_10_anonymous;

class Insect {
    void attack() {System.out.println("Insect attack");}
}

// 익명클래스
class Anonymous{
    
    // 1. 필드에 익명자식 객체 생성
    Insect spider1 = new Insect() {
        String name = "무당거미";
        void cobweb() {System.out.println("hex web");}
        @Override
        void attack() {System.out.println(name + " bite");}
    };

    // 2. 로컬변수의 초기값으로 대입
    void method1() {
        Insect spider2 = new Insect() {
            String name = "늑대거미";
            void cobweb() {System.out.println("hex web");}
            @Override
            void attack() {System.out.println(name + " bite");}
        };
        spider2.attack();
    }

    // 3. 익명객체 매개변수로 대입
    void method2(Insect spider) {spider.attack();}
}

// 인터페이스 강제 정의를 통한 익명클래스 구현
// 클래스 내부에서 인터페이스 구현, 인터페이스 메소드 실행
class Button {

    // 중첩 인터페이스
    interface OnClickListener {void onClick();}

    // 인터페이스 타입 필드
    OnClickListener listener;

    // 메개변수의 다형성 (인터페이스 세팅)
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    // 구현 객체의 onClick() 메서드 호출
    void touch() {listener.onClick();}

}

class ButtonHandler {

    Button endButton = new Button();
    Button startButton = new Button();

    // Button 내부의 OnClickListener 인터페이스를 구현
    // 익명클래스(익명객체)
    Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick() {System.out.println("프로그램 종료");}
    };

    ButtonHandler(){
        // 익명 객체로 버튼 초기화
        endButton.setOnClickListener(listener);
        // 익명클래스 (익명객체)를 파라미터단에서 구현
        startButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {System.out.println("프로그램 시작");}
        });
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        // 이름 없는 클래스
        // 한번만 사용되고 버려짐, 일시적인 사용
        // 재사용되지 않음

        // UI 이벤트처리, 스레드 객체 등의 단발성 이벤트 처리
        // 재사용, 확장성 활용하는 것이 유지보수에 불리할 때

        Anonymous a = new Anonymous();

        // 1. 익명객체 필드 사용
        a.spider1.attack();

        // 2. 익명 객체 로컬 변수 사용
        a.method1();

        // 3. 매개변수로 익명개체 사용
        a.method2(new Insect() {
            String name = "타란툴라";
            void cobweb() {System.out.println("dirty web");}
            @Override
            void attack() {System.out.println(name + " bite");}
        });

        // 익명객체 내부에서 새롭게 정의된 필드
        // 메서드는 부모객체로 생성된 spder1에서 접근할 수 없다

        // 익명객체에서 새롭게 정의된 필드 (접근불가)
        // a.spider1.name = "왕거미"; 
        // 익명객체에서 새롭게 정의된 메서드 (접근불가)
		// a.spider1.cobweb(); 
        // 부모클래스 Insect에서 오버라이딩해서 재정의한 메서드 (접근가능)
		a.spider1.attack(); 
	

        // 익명 구현 클래스 (익명 구현 객체)
        ButtonHandler buttonHandler = new ButtonHandler();
        buttonHandler.endButton.touch();
        buttonHandler.startButton.touch();
    }
}
