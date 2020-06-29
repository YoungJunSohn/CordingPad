# java에서 System.out.print와 관련된 키워드들

---
요약하기에 앞서 먼저, 키보드는 각각의 키마다 해당하는 키코드를 가진다.<br/>



> 입력될 문자는 -words-로 표현

#### 1. System.out.println(-words-)

-words-를 출력하고, 줄바꿈을 한다.

<br/>

#### 2. System.out.print(-words-)

-words-를 출력한다.

<br/>

#### 3. System.out.printf(-words-)

-words-를 주어진 형식(format) 으로 출력한다.

<br/>

#### 4. System.in.read()

키보드에서 입력된 '키코드'를 읽는다. <br/>
이때 '키코드'란 ASCII Code를 말하며, enter = 13, tab = 9 등이 읽어진다.
<br/>


#### 5. Scanner 객체

System.in.read는 키코드를 하나씩만 읽기 때문에 두개 이상의 키가 조합된 한글 키는 읽을 수 없다.
키보드로부터 입력된 내용을 통 문자열로 읽기 위해서는 Scanner 객체를 사용하여야 한다.

 

