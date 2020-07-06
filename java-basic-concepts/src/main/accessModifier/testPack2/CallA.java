package main.accessModifier.testPack2;

import main.accessModifier.testPack1.A;

public class CallA {

    A a1 = new A(false); // boolean 생성자를 호출할 수 있음 (public 접근제한자)

//    A a2 = new A(2); // 컴파일 에러 발생 (default 접근제한자인 경우 같은 패키지일 때 생성자 생성이 가능)
//
//    A a3 = new A("히히 생성 발사!"); // 컴파일 에러 발생 (private 접근제한자인 경우 같은 클래스에서만 생성이 가능하다)

}//CallA
