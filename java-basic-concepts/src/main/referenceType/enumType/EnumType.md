# enum : 열거형 (jdk 1.5 ↑)

---
> 개념
* 클래스처럼 보이는 상수
* 서로 관련 있는 상수들을 모아 상징적인 명칭의 객체로 정의한 것
* Enum 클래스형을 기반으로 한 클래스형 선언
* 새로운 열거형을 선언하면, 내부적으로 Enum 클래스형 기반은 새로운 클래스형이 생성됨

---

> 특징
* 열거된 순서에 따라 0부터 순서값을 가짐, 차례대로 증가함.
* enum 열거형으로 지정된 상수는 대문자를 사용하는 것이 관례
* **마지막 끝에 세미콜론 (;) 을 붙이지 않음 !**

---

> Enum 을 통해 얻는 기본적인 장점들 (우아한형제들 기술 블로그에서 발췌)

#### step1 모든 언어들 속 Enum의 공통적인 장점
* 문자열과 비교해, **IDE의 적극적인 지원**을 받을 수 있다.
    * 자동완성, 오타검증, 텍스트 리팩토링 등등
* 허용 가능한 값들을 제한할 수 있다.
* **리팩토링 시 변경 범위가 최소화 된다.**
    * 내용 추가가 필요하더라도, Enum 코드 외에는 수정할 필요가 없다.

#### step2 자바만의 Enum 장점
* C/C++에서 Enum은 int 형이지만, java의 Enum은 완전한 기능을 갖춘 **클래스**이다.