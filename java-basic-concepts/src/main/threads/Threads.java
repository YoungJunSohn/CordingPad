package main.threads;

import java.awt.*;

public class Threads {
    /*자바의 모든 애플리케이션은 메인 스레드가 메인 메서드를 실행하면서 시작한다.
    메인 스레드는 main() 메서드의 첫 코드부터 아래로 순차적으로 실행하고, main()의 마지막 코드를 실행하거나 return 문을 만나면 실행이 종료된다.
    메인 스레드는 필요에 따라 작업 스레드들을 만들어서 병렬로 코드를 실행할 수 있다.
    즉 멀티스레드를 생성해서 멀티 태스킹을 수행한다.

    싱글 스레드 애플리케이션에서는 메인 스레드가 종료되면 프로세스도 종료된다.
    멀티 스레드 애플리케이션에서는 실행 중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
    메인 스레드가 작업 스레드보다 먼저 종료되더라도 작업 스레드가 계속 실행 중이라면 프로세스가 종료되지 않는다.
    * */

    /*스레드의 생성
    스레드의 생성은 java.lang.Thread 클래스로부터 작업 스레드 객체를 직접 생성하려면
    다음과 같이 Runnable을 매개 값으로 갖는 생성자를 호출해야 한다.
    Runnable은 인터페이스 타입의 객체인데 여기에는 run()이라는 메서드가 정의되어있으며, 구현 클래스는 run()을 오버라이딩해서
    작업 스레드가 실행할 코드를 작성해야 한다.
    Runnable은 작업 내용을 갖고 있는 객체일 뿐이지, 실제 스레드는 아니다. 때문에 구현 객체를 생성하고 나서
    이것을 매개값으로 해서 Thread 생성자를 호출해야 비로소 작업 스레드가 생성된다.
    * */

    public static void main(String[] args) {
        //메인메서드를 이용하여 메인스레드 !

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i < 5 ; i++){

            toolkit.beep(); //툴킷 객체 생성 [비프 음 발생!] (띠로롱~)

            try{
                Thread.sleep(500);//0.5초간 일시정지
            }catch (Exception e){
                e.printStackTrace();
            }//try~catch
        }//for


        for (int i=0;i<5;i++){
            System.out.println("띠로롱!~");
            try {
                Thread.sleep(500);//0.5초간 일시정지
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }//main()
}//Threads
