# 참조자료형(ReferenceType)

> 객체자료형이라고도 불리는 이 자료형은 객체의 번지를 참조하는 자료형으로<br/>
> Array(배열), enum(열거), Class, Interface 를 말한다.
>
>
<br/>

생소할 수 도 있는 자료형 enum(enumeration : 열거, 목록)형의 사용 예시
[EnumType](https://github.com/YoungJunSohn/CordingPad/blob/master/java-basic-concepts/src/main/referenceType/enumType/EnumType.md)

<br/>

---

# 메모리 영역

* `메소드 영역` : JVM이 시작 할 때 생성되고, 모든 스레드가 공유하는 영역이다.<br/>
메소드 영역에는 코드에서 사용되는 클래스들을 클래스 로더로 읽어 클래스별로 정적 필드(static field)와 상수(constant), 메소드 코드, 생성자(constructor) 코드 등을 분류하여 저장한다.

<br/><br/>

* `힙 영역` : 객체와 배열이 생성되는 영역이다. 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체의 필드에서 참조될 때 사용된다.<br/>
만일, 참조하는 변수나 필드가 없을 때는 의미없는 객체로 판단하여, JVM이 garbage collector를 실행하여 자동으로 객체를 제거한다.

<br/><br/>

* `스택 영역` : JVM 스택은 메소드를 호출할 때마다 프레임을 추가하고, 메소드가 종료되면 해당 프레임을 제거하는 동작을 수행한다.
<br/>
프레임 내부에는 로컬 변수 스택이 있는데, 기본 타입 변수와 참조 타입 변수가 추가되거나 제거된다.<br/>
변수는 선언된 블록 안에서만 스택에 존재할 수 있으며, 블록을 벗어나게 되면 스택에서 제거된다.
