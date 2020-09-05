package main.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapCollection {
    /*Map컬렉션은 Key와 value로 구성되어 있다. 또한 이 값들은 Map.Entry 객체에 저장되며
    각각의 key와 value는 모두 객체이다.
    key는 중복 저장 될 수 없지만, value값은 중복 저장이 가능하며 기존의 key값과 같은 값을 저장하면 이전의 값이 덮어쓰기된다.
     */

    public static void main(String[] args) {
        /*HashMap은 map 인터페이스를 구현한 대표적인 Map 컬렉션이다.

        HashMap의 key로 사용할 객체는 hashCode() 와 equals() 메서드를 재정의해서 동등 객체가 될 조건을 정해야 한다.
        객체가 달라도 동등 객체일 경우, 같은 key로 간주하고 중복 저장이 되지 않는다.
        동등객체의 조건은 hashCode()와 그 리턴값이 같아야 하고, equals() 가 true 를 리턴해야 한다.

        이 때문에 주로 사용하는 key값의 자료형은 String 형이 많은데,
        String은 문자열이 같을 경우 동등 객체가 될 수 있도록 hashCode()와 equals()메서드가 오버라이딩 되어 있기 때문이다.
        또 이런 key값의 특성 때문에 기본 자료형인 char, int, short, long, float 등이 쓰일 수 없고
        오직 객체자료형인 클래스형과, 인터페이스형만 쓰일 수 있다.

         */
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 2); //2를 넣고
        map.put("key1", 4); //4를 넣으면
        System.out.println(map.get("key1").intValue()); //2값이 없어졌네? -> 덮어쓰기 된다.


        /*
        Hashtable은 HashMap과 동일한 내부 구조를 가지고 있다.
        Hashtable도 HashMap과 같이 hashCode()와 equals() 메서드가 오버라이딩 되어 있어야 동등 객체가 될 수 있다.
        다만 차이점은
        HashMap과의 차이점은 Hashtable은 동기화된 메서드로 구성되어 있기 때문에 멀티 스레드가 동시에
        Hashtable의 메서드들을 실행할 수 없고, 하나의 스레드들을 실행할 수 없고,
        하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다는 것이다.
        그래서 멀티스레드 환경에서 안전하게 객체를 추가하고 삭제할 수 있기 때문에 Hashtable은 스레드에 안전하다고 할수있다.
        */
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("key2", 1);





    }//main
}//MapCollection
