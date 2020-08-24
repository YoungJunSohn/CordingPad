package main.basic_concept;

public class ClassFamily {
    // 클래스와 오브젝트, 그리고 인스턴스의 차이
    // 클래스란, 객체를 만들기 위한 설계도 또는 틀, 실제로 멤버필드와 멤버메서드로 이루어진 것을 말한다.

    //1. 클래스의 정의
    // 멤버필드 또는 멤버메서드를 포함한 하나의 집합
    String memberField = "나는 멤버필드";
    public String memberMethod(){
        return "나는 멤버메서드";
    }// ClassFamily 클래스

    //2. 인스턴스의 정의
    //new 라는 키워드를 통해 heap 메모리영역에 공간을 하나 할당받아, ClassFamily 설계도(클래스)를 이용하여 만든 구현체
    ClassFamily family = new ClassFamily(); // new 를 통해 인스턴스가 생성된다.

    //3. 그렇다면 오브젝트는 무엇인가?
    /*간단요약하자면 [클래스의 인스턴스] 가 오브젝트이다.
    하나의 클래스라도 메모리 공간이 허용 하는 한 수많은 인스턴스를 생성할 수 있는데 이때 만들어진 인스턴스를
    ClassFamily 의 Object 즉 ClassFamily 클래스의 객체라고 한다.
    * */


}//ClassFamily
