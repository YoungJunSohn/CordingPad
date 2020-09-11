package main.threads;

public class ThreadSync {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
        //결과에 111 , 222 가 찍힐 것으로 예상했지만 222, 222가 찍히는 이유?

        /*
        User1 스레드에서 사용 중인 calculator 객체를 User2 스레드에서 값을 222로 바꿔버렸기 때문이다.
        이를 방지하기 위해서는 객체에 잠금을 걸어, 다른 스레드가 사용할 수 없도록 해야 한다.
        멀티 스레드 프로그램에서 단 하나의 스레드만 실행 할 수 있는 코드 영역을 임계 영역 이라고 한다.
        자바는 임계 영역을 지정하기 위해 동기화 메소드를 지원한다.

        동기화하기 위해서는 스레드의 메소드에 동기화를 지정해줘야 하는데
        synchronized 라는 키워드를 public 접근제한자 다음에 붙이면 된다.
        이 동기화 키워드는 static 메서드의 경우에도 지정할 수 있다.
        */
    }//main
}//ThreadSync