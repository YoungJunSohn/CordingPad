# Array

> 배열은 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 index를 부여해놓은 자료구조이다.

---

<br/>
<br/>

흔히 '성적' 과 같은 데이터를 처리 할 때 배열로 만들면, 인덱스를 이용하여 for문으로 쉽게 구할 수 있다.
<br/>
주의할 점은, 배열은 같은 타입의 데이터만을 저장할 수 있으며,<br/>선언과 동시에 그 길이가 고정되어 늘리거나 줄일 수 없기 때문에 주의해야한다.<br/>
만약 3개의 값을 저장하는 배열을 만들었는데 5개의 값을 저장하는 배열이 필요할 경우,<br/>
길이 5의 배열을 **새로 만든 후** 기존 배열의 값을 복사해야 한다.