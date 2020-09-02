package main.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollection {
    /*  List<> 에는 ArrayList, Vector, LinkedList가 있다.
        ArrayList는 list 인터페이스의 대표적인 구현 클래스이다.
        ArrayList를 생성하기 위해서는 List<>의 제네릭을 원하는 클래스형으로 설정하고,
        new 라는 키워드를 통해 기본생성자를 호출하여 생성한다. -*1

        이렇게 생성된 ArrayList에 값을 참조시키기 위해서는 add 메서드를 이용한다. -*2
        저장된 값을 호출하기 위해서는 get메서드를 이용한다. -*3



        Vector는 ArrayList와 동일한 내부 구조를 가지고 있다.
        Vector를 생성하기 위해서는 저장할 객체 타입을 타입 파라미터로 표기하고 기본생성자를 호출하면 된다.-*4
        ArrayList와 Vector의 다른 점은,
        Vector의 경우, 동기화된 메서드로 구성되어 있기 때문에 멀티 스레드가 동시에 Vector의 메서드들을 실행할 수 없고
        하나의 스레드가 메서드실행을 완료해야만 다른 스레드가 메서드를 실행할 수 있다.
        이러한 점을 스레드에 안전하다고 표현한다.



        LinkedList는 List 구현 클래스이므로 ArrayList와 사용 방법은 똑같은데, 내부 구조는 완전히 다르다
        ArrayList는 내부 배열에 객체를 저장해서 관리하지만, LinkedList는 쇠사슬이 엮이듯 여러 배열을 조각들이
        다음 배열의 꼬리 위치를 참조하고 있다. 이런 형식으로 체인형 링크 시스템이기에 LinkedList라고 불린다.

    */
    public static void main(String[] args) {

        List<String> list= new ArrayList<String>();//*1
        list.add("히힣");//*2
        System.out.println(list.get(0));//*3


        List<String> vector = new Vector<>();//*4 제네릭을 생략할 경우, 왼쪽 List에 지정된 타입을 따라감

        List<String> linkedList = new LinkedList<>();//*5
    }//main
}//ListCollection
