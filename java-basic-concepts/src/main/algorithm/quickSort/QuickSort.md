# 퀵 정렬 (2020-07-14)


### 개념

---

* 피봇(pivot)을 하나 정한 뒤, 피봇의 위치를 확정해가면서 정렬하는 정렬 방식

* 평균적으로 매우 빠른 수행 속도를 자랑하는 정렬 방법이며, 분할 정복 알고리즘의 하나<br/>

* 정렬하는 속도는 이 피봇을 정하는 방법에 따라 달라지는데, 선정 조건을 얼마나 유효하게 정하는지가 중요함<br/>

* 실제 정렬되는 모양은 괄호를 겹치는 것과 비슷하다 { 정렬1{ 정렬2{ 정렬3 } } } (회차를 따지기 어려움)

<br/><br/><br/>


### 오름차순일 경우의 프로세스 

---
1. `첫 번째 작업` : 피봇 값을 배열의 첫 번째 원소로 가정(다른 임의의 값이라도 무관), 2개의 인덱스 변수(left, right)를 지정하여 판별을 시작<br/>

2. `두 번째 작업` : 피봇을 기준으로, 대상 원소가 피봇 보다 작은 값인지 큰 값인지 비교를 통해 피봇의 위치를 확정한다.<br/>
이렇게 확정된 피봇은 더이상 이동하지 않으며 재귀 호출에 의해 리스트를 나누는 기준이 된다.<br/>

3. `세 번째 작업` : 피봇의 위치가 확정되면, 배열 내에서 피봇의 index보다 작은 index를 가진 값들은 모두 피봇보다 작은 값을 가지지만, 서로간의 대소관계는 확립되지 않은 상태이다.<br/>
또, 피봇의 index보다 큰 index를 가진 값들또한 모두 피봇보다 큰 값을 가지지만 서로간의 대소관계가 확립되지 않은 상태이다.<br/>
이때 재귀 호출에 의하여 피봇의 index보다 작은 index를 가진 값들 끼리의 정렬을 재시도하고, 마찬가지로 피봇의 index보다 큰 index를 가진 값들끼리의 정렬을 재시도한다.<br/>

4. `네 번째 작업` : 이러한 재귀호출은 더 이상 분할되지 않을때(배열 내 모든 값들이 피봇으로 선정될 때) 까지 반복되며, 작업이 모두 끝나면 각 피봇의 위치를 반환하여 모든 배열의 위치를 확정한다.<br/>

<br/><br/>

---
<br/><br/><br/>

### 장점과 단점

---

장점
---

* 평균적인 정렬 속도가 빠르다.
* 추가 메모리 공간을 필요로 하지 않는다.

<br/><br/>

단점
---
* 이미 정렬된 원소들에 대해서는 퀵 정렬의 불균형 분할에 의해 오히려 수행 시간이 더 많이 걸릴 수 있다.<br/>
* 퀵 정렬의 편파적인 분할을 최대한 지양하고 정렬 속도 향상을 위해,<br/>
 원소를 선택하는 조건을 리스트를 균등하게 분할할 수 있도록 최대한 잘 지정해야 한다.<br/>
