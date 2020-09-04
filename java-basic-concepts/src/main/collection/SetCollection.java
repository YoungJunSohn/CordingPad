package main.collection;

import java.util.*;


public class SetCollection {
    /* List 컬렉션의 경우 객체의 저장 순서가 보장되지만, Set 컬렉션의 경우 저장순서는 물론,
    *  중복된 객체도 저장할수 없으며 단 하나의 null만 저장할 수 있다.
    *  저장순서가 없는 만큼 인덱스 또한 존재하지 않으며, HashSet/ LinkedHashSet/ TreeSet으로 구분할수있다.
    */
    static void line(){
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        //Set<> Set 컬렉션에서 제네릭은 저장 객체의 객체자료형을 지정할 수 있는 방법이다.
        //HashSet은 Set인터페이스의 구현 클래스이다. 일반적으로 Set을 생성하기 위해서는 HashSet의 기본생성자를 호출하여 생성한다.
        Set<String> setStr = new HashSet<>();
        setStr.add("1번");
        setStr.add("2번");
        setStr.add("1번");
        setStr.add("3번");
        setStr.add("4번");
        setStr.add("8번");
        setStr.add("7번");
        setStr.add("8번");
        setStr.add("5번");
        Iterator<String> iterator = setStr.iterator();

        if (iterator.hasNext()){
            System.out.println(setStr);
        }

        line();

        //TreeSet은 입력 순서를 보장하지 않는 것은 HashSet과 마찬가지이지만 오름차순 정렬을 해준다.
        Set<String> treeSetStr = new TreeSet<>();
        treeSetStr.add("8번");
        treeSetStr.add("4번");
        treeSetStr.add("1번");
        treeSetStr.add("2번");
        treeSetStr.add("1번");
        treeSetStr.add("3번");
        treeSetStr.add("8번");
        treeSetStr.add("7번");
        treeSetStr.add("5번");
        Iterator<String> treeItr = treeSetStr.iterator();

        if (treeItr.hasNext()){
            System.out.println(treeSetStr);
        }

        line();

        //LinkedHashSet 은 입력 순서를 보장한다.

        Set<String> linkedHashSetStr = new LinkedHashSet<>();
        linkedHashSetStr.add("1번");
        linkedHashSetStr.add("8번");
        linkedHashSetStr.add("2번");
        linkedHashSetStr.add("1번");
        linkedHashSetStr.add("4번");
        linkedHashSetStr.add("8번");
        linkedHashSetStr.add("7번");
        linkedHashSetStr.add("3번");
        linkedHashSetStr.add("5번");
        Iterator<String> linkedHashItr = linkedHashSetStr.iterator();

        if (linkedHashItr.hasNext()){
            System.out.println(linkedHashSetStr);
        }
    }//main
}//SetCollection
