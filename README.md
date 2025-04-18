


<details>
<summary>1장</summary>
<div markdown="1">

### 코드가 ‘지저분’ 하다

컴파일러는 코드가 돌아가기만 하면 되는데 프로그램의 구조를 미적인 기준으로만 판단하는 것이 아닐까?

코드를 수정하려면 사람이 개입되고, **사람은 코드의 미적 상태에 민감하다.**

설계가 나쁜 시스템은 수정하기 어렵다.

수정할 부분을 찾고 기존 코드와 함께 작동하게 할 난이도가 올라간다.

또한 수정 포인트를 찾기 어렵다면 사이드이펙이나 버그가 생길 가능성도 높아진다.

### 코드를 쉽게 파악할 수 있도록 하자.

**프로그램의 작동방식을 더 쉽게 파악할 수 있도록 코드를 여러 함수와 프로그램 요소로 재구성한다.**

프로그램의 구조가 빈약하다면 대체로 구조부터 바로잡은 뒤에 기능을 수정하는 편이 작업하기가 훨씬 수월하다.

프로그램이 새로운 기능을 추가하기에 편한 구조가 아니라면, 먼저 기능을 추가하기 쉬운 형태로 리팩터링 하고 나서 원하는 기능을 추가한다.

### 리팩터링의 첫 단계는 테스트코드

리팩터링에서 테스트의 역할은 굉장히 중요하다.

수정 과정에서 예상치 못한 문제가 발생할 가능성이 크다.

테스트는 내가 저지른 실수로부터 보호해주는 버그 검출기 역할을 해주기 때문이다.

**리팩터링 하기 전 제대로 된 테스트부터 마련한다. 테스트는 반드시 자가진단하도록 만든다.**

**함수 추출하기**

코드 조각을 함수로 추출하고 그 코드가 하는일을 설명하는 이름을 지어준다.

함수 반환값에는 항상 result라는 이름을 쓴다.

그러면 그 변수의 역할을 쉽게 알 수 있다.

**임시 변수를 질의 함수로 바꾸기**

임시 변수들 때문에 로컬 버무이에 존재하는 이름이 늘어나서 추출 작업이 복잡해질 수 있다.

```
const play = plays[aPerformance.playID];
------------------------------------------------------------
function playFor(aPerformance) {
 return plays[aPerformance.playID];
}
cont play = playFor(performance);
```

### 지역 변수

추출 리팩토링 전에는 지역 분수부터 제거하라

유효범위를 신경 써야 할 대상이 줄어들기 때문이다.

임시 변수는 자신이 속한 루틴에서만 의미가 있어서 루틴이 길고 복잡해지기 쉽다.

### 반복문 쪼개기

반복문을 쪼개서 성능이 느려지지 않을 까 걱정할 수 있다.

반복문이 중복되는 것을 꺼리는 이들이 많지만 성능에 미치는 영향이 미미할 때가 많다.

때로 성능에 상당한 영향을 주기도 하지만 잘 다듬어진 코드가 성능 개선 작업도 훨 씬 수월하다.

리팩터링 과정에서 성능이 크게 떨어졌다면 리팩터링 후 시간을 내어 성능을 개선하라 리팩터링 덕분에 성능 개선을 더 효고적으로 수행할 수 있다.

**‘특별한 경우가 아니라면 일단 무시하라’**

### 단계 쪼개기

한 메서드의 로직을 단계를 나누어서 치리한다.

e.g.) 1. 데이터 처리, 2. 데이터 표현

### 조건부 로직을 다형성으로 바꾸기

모든 데이터 변환을 한 곳에서 수행할 수 있어서 코드가 더욱 명확해진다.

**리팩터링 리듬.**

리팩터링은 대부분 코드가 하는일 을 파악하는데서 시작

코드를 읽고, 개선점을 찾고, 리팩터링 작업을 통해 개선점을 코드에 반영하는 식으로 진행

그 결과 코드가 명확해지고 이해하기 더 쉬워진다.

각 단계를 잘게 나누고 매번 컴파일하고 테스트하여 작동하는 상태로 유지한다.

**좋은 코드.**

좋은 코드란 코드를 ‘수정하기 쉬운 정도;

코드를 수정해야 할 상황이 되면 고쳐야 할 곳을 쉽게 찾을 수 있고

오류없이 빠르게 수정할 수 있어야 한다.

건강한 코드베이스는 생산성을 극대화하고 더 빠르고 저렴한 비용으로 제공할 수 있도록 해준다.

코드를 건강하게 관리하려면 팀의 현재와 이상의 차이에 항상 신경 쓰면서, 이상에 가까워지도록 리팩터링 해야 한다.

**효과적인 리팩터링**

단계를 잘게 나눠라, 코드는 절때 깨지지 않으며 작은 단계들이 모여서 상당히 큰 변화를 이룰수 있다.

### Review

리팩터링! 레거시 코드를 더 보기좋게 개선 하면 되는거 아니야?!

리팩터링을 진행하면서 올바르게 리팩터링이 되었는가? 다른 사이드 이펙은 없는지 어떻게 검증할 수 있는가?

무작정 코드부터 고치는것이라니라 올바르고 효과적으로 리팩터링을 진행할 수 있도록 가이드해준다는 느낌을 받았다.

어쩌면 이 내용들이 당연하다고 느낄수 도 있을 것 이라고 생각 할 수 있다.

하지만 실제로 적용하고 있는 사람들은 드물것이라고 생각한다.

1장에서 직접 리팩토링을 진행해보며 테스트 코드에 대한 중요성을 다시한번 깨달을 수 있었고

리팩토링을 진행하는 리듬, 작은 단계, 테스트를 상기시키게 되었다.

</div>
</details>





<details>
<summary>2장</summary>
<div markdown="2">

### 리팩토링, 테스트, 그리고 성능

2장에서는 리팩토링이란 무엇인가? 왜 해야하는가 그리고 리팩토링을 진행하면서 테스트에 대한 중요성을 일깨워준다.

리팩토링에서는 자가 테스트 코드가 핵심 요소라는 것을 강조한다.

자가 테스트코드와 리팩터링을 묶어 TDD라고 말한다.

그리고 성능에 관한 잘못된 생각을 바로 잡아줬다고 느껴졌다.

### 리팩터링이란?

- 코드를 정리하는 작업은 리팩터링이 아니다.
- 리팩터링은 동작을 보존하는 작은 단계들을 거쳐 코드를 수정하고, 이러한 단계를 순차적으로 연결해 큰 변화를 만들어내는 것이다.

### **리팩터링 단계를 잘게 나눠라**

- 단계를 잘게 나눔으로써 작업을 더 빨리처리할 수 있다.
- 디버깅에도 효율적이다.

### 기능 추가냐 리팩터링이냐 명확히 구분해라

- 기능을  추가할때는 기존 코드는 절대 건드리지 않고 새 기능만을 추가한다.
- 리팩토링할 때는 기능 추가는 절대 하지 않고 코드 재구성에만 전념한다.
- 어떤 작업을 진행중인지 차이를 분명하게 인식하라

### 리팩터링하는 이유

- 소프트웨어 설계가 좋아진다.
    - 아키텍처를 충분히 이해하지 못하고 코드를 수정하면 코드로 설계를 파악하기 어렵다.
    - 코드만으로 설계를 파악하기 어려워질수록 설계를 유지하기 어려워진다.
    - 반면 규칙적인 리팩터링은 콛의 구조를 지탱해줄 것이다.
- 소프트웨어를 이해하기 쉬워진다.
    - 컴퓨터에게 시키려는 일과 이를 표현한 코드사이의 간극을 최대한 줄여야 한다. **원하는 바를 정확히 표현하는 일이다**
    - 프로그램을 동작시키는데만 신경쓰다 보면 코드를 다룰 개발자를 생각하지 못한다.
    - **잘 동작하지만 이상적이지 않은 코드가 있다면 리팩터링해라, 목적이 더 잘 드러나게 의도를 더 명확하게 전달하도록 개선할 수 있다**.
- 버그를 쉽게 찾을 수 있다.
    - 리팩터링하면 코드가 하는 일을 깊게 파악할 수 있고 새로 깨달은 것을 코드로 더 잘 표현할 수 있게된다.
- 프로그래밍 속도를 높힐 수 있다
    - 리팩터링은 내부 설계와 가독성이 개선되고 버그가 줄어든다.
    - 하지만 전체 개발속도는 떨어질까 하는 우려가 생긴다.
    - 내부 설계가 잘 도니 소프트웨어는 새로은 기능을 추가할 지점과 어떻게 고칠지를 쉽게 찾을 수 있다.
    - 코드가 명확하면 버그를 만들 가능성도 줄어든다.
    - 버그가 생기더라고 디버깅하기 쉽다.
    - 내부 품질이 뛰어난 코드베이스는 새 기능 구축을 돕는 견고한 토대가 된다

### 리팩터링은 언제 할까?

- 가장 좋은 시점은 코드베이스에 기능을 새로 추가하기 직전
    - 현재 코드를 살펴보며, 구조를 살짝 바꾸면 다른 작업을 하기가 훨씬 쉬워질 부분을 찾는다.
- 코드를 이해하기 쉽게 만들기
    - 코드를 수정하려면 코드가 하는 일을 파악해야 한다.
    - 코드의 의도가 더 명확하게 드러나도록 리팩터링 할 수 없는지 찾아본다
- 계획된 리팩터링과 수시로 하는 리팩터링
    - 기능을 추가하거나 버그를 잡는 동안 리팩터링도 함께 진행한다. ( 프로그래밍 관정이 자연스럽게 녹여라)
    - 기능을 추가할 때든 버그를 잡을때든 앞으로의 작업에도 도움을 준다.

### 오래 걸리는 리팩터링

- 오래걸리는 리팩터링에 팀 전체가 매달리지 말자
- 주어진 문제를 조금씩 해결해가는 편이 효과적일 때가 많다.

### 코드 리뷰에 리팩터링 활용하기

- 코드 리뷰는 개발팀 전체에 지식을 전파하는데 좋다.
- 개선 사항은 제안할 뿐만 아니라 새로운 아이디어가 떠오르면 리팩터링하여 쉽게 구현할 수 있는지 살피는 과정을 반복한다. 이 과정을 반복하면 실제 적용했을 때 모습을 더 명확하게 볼 수 있다.
- 리팩터링은 코드 리뷰의 결과를 더 구체적으로 도출하는데 도움을 준다.
    - 즉시 구현해볼 수 있기 때문이다.

### 레거시 코드

- 테스트를 갖추고 있더라도 단번에 리팩터링하지 말자.
- 서로 관련된 부분끼리 나눠서 하나씩 공략해라
- 코드의 한 부분을 훑고 넘어갈 때마다 예전보다 조금이라도 개선하려고 노력해라.

### 테스팅

- 핵심은 오류를 재빨리 잡는데 있다.
- 필요한 것은 자가 테스트 코드 테스트 스위트 그리고 이를 빠르게 실행할 수 있어야 수시로 테스트 하는데 부담이 없다.
- 새 기능을 추가할 때도 훨씬 안전하게 진행할 수 있도록 도와준다.
- 핵심은 테스트가 실패한다면 가장 최근에 통과한 버전에서 무었이 달라졌는지 살펴볼 수 있다는 것.

### 데이터베이스

- 다른 리팩터링과 마찬가지로 전체 변경과정을 작고 독립된 단계들로 쪼개는 것이 핵심이다.
- 단계를 잘게 나누면 쉽게 작성 할 수 있다.
- 여러 단계를 순차적으로 연결해서 데이터베이스의 구조와 그 안에 담긴 데이터를 큰 폭으로 변경할 수도 있다.
- 데이터베이스 리팩터링은 프로덕션 환경에 여러 단계도 나눠서 릴리스하는 것이 대체로 좋다는 점에서 다른 리팩터링과 다르다.

### **처음부터 성능을 고려하며 개발하지 말아라**

- 리팩터링은 성능 좋은 소프트웨어를 만드는데 기여한다.
- 단기적으로 보면 리팩터링 단계에서 성능이 느려질 수도 있다.
- 최적화 단계에서 코드를 튜닝하기 훨씬 유리하다. 결국 더 빠른 소프트웨어를 얻게 될것이다.

### **리팩터링을 먼저 수행하고 그다음 튜닝해라**

- 성능만을 생각하다보면 프로그램은 더 복잡해지고 수정하기 어려운 형태로 변한다고 말한다.
- 또한 소프트웨어가 빨라지면 충분한 보상을 얻겠지만 실제로 그런 경우는 별로 없다

결과적으로

**리팩터링하면 성능이 느려질수 있지만 그와 동시에 성능을 튜닝하기에는 더 쉬워진다.**

먼저 튜닝하기 쉽게 만들고 성능을 튜닝하는것이다.

</div>
</details>


<details>
<summary>3장</summary>
<div markdown="3">

# 리팩터링을 언제 적용해야 하는가?

하지만 적용 방법을 아는 것과 제때 적용할 줄 아는 것은 다르다. 리팩터링을 언제 시작하고 언제 그만할지를 판단하는 일은 리팩터링의 작동 원리를 아는 것 못지않게 중요하다.

리팩터링이 필요한 코드들에는 일정한 패턴이 존재한다.

### 기이한 이름

- 코드를 명료하게 표현하는데 가장 중요한 요소 하나는 바로 이름이다, 그래서 함수, 모듈, 변수 클래스 등은 그 이름만 보고도 각각이 무슨 일을 하고 어떻게 사용해야 하는지 명확히 알 수 있도록 엄청나게 신경 써서 이름을 지어야 한다.
- 이름만 잘 지어도 나중에 문맥을 파악하느라 해매는 시간을 크게 절약할수 있다.
- 마땅한 이름이 떠오르지 않는다면 설계에 더 근본적인 문제가 숨어 있을 가능성이 높다. 그래서 혼란스러운 이름을 잘 정리하다 보면 코드가 훨씬 간결해질 때가 많다.

### 중복 코드

- 동일한 코드 구조가 여러곳에서 반복된다면 하나로 통합하여 더 나은 프로그램을 만들 수 있다.
- 코드가 중복되면 각각을 볼 대마다 차이점은 없는지 주의 깊게 살펴봐야 하는 부담이 생긴다.
  또한 변경시에 다른 비슷한 코드 모두 살펴보고 적절히 수정해야 한다.

**중복 코드를 해결하자**

한 클래스에 딸린 두 메서드가 똑같은 표현식을 사용할 경우 함수 추출하기 를 써서 양쪽 모두 추출된 메서드를 호출하게 바꾸면 된다.

코드가 비슷하긴 한데 완전히 똑같지는 않다면, 먼저 **문장 슬라이드하기** 절로 비슷한 부분을 한 곳에 모아 함수 추출하기를 더 쉽게 적용할 수 있는지 살펴본다.

같은 부모로부터 파생된 서브클래스들에 코드가 중복되어 있다면, 각자 따로 호출되지 않도록 **메서드 올리기** 절를 적용해 부모로 옮긴다.

### 긴 함수

- 오랜 기간 잘 활용되는 프로그램들은 하나같이 짧은 함수로 구성된다.
- 짧은 함수는 간접 호출의 효과, 즉 코드를 이해하고, 공유하고, 선택하기 쉬워진다는 장점이 생긴다.
- 짧은 함수로 구성된 코드를 이해하기 쉽게 만드는 가장 확실한 방법은 좋은 이름이다. 함수 이름을 잘 지어두면 본문 코드를 볼 이유가 사라진다.
- 주석을 달아야 할 만한 부분은 무조건 함수로 만든다.
  - 주석으로 설명하려던 코드가 담기고, 함수 이름은 동작 방식이 아닌 의도가 드러나게 짓는다.
  - 함수 이름에 코드의 목적을 드러내야 한다.
  - 핵심은 함수의 길이가 아닌, 함수의 목적(의도)와 구현 코드의 괴리가 얼마나 큰가이다, ‘무엇을 하는지’를 코드가 잘 설명하주지 못할수록 함수로 만드는게 유리하다.

**함수 추출하기**

- 함수를 짧게 만드는 작업의99%는 함수 추출하기 가 차지한다.
- 함수 본문에서 따로 묶어 빼내면 좋은 코드 덩어리를 찾아 새로운 함수로 만드는 것.
- 함수가 매개변수와 임시 변수를 많이 사용한다면 추출 작업에 방해가 된다.
  - 임시 변수를 질의 함수로 바꾸기로 임시 변수의 수를, 매개변수 객체 만들기 절와 객체 통째로 넘기기 절로는 매개변수의 수를 줄일 수 있을 것이다
  - 여전히 변수와 매개변수가 너무 많다면 함수를 명령으로 바꾸기를 고려해보자

**추출할 코드 덩어리는 어떻게 찾아낼까?**

- 주석을 참고하자
- 주석이 설명하는 코드와 함께 함수로 빼내고, 함수 이름은 주석 내용을 토대로 짓는다.

**조건문이나 반복문도 추출 대상의 실마리를 제공한다.**

- 조건문은 조건문 부해하기로 대응한다.
- switch문을 구성하는 case문 마다 함수추출하기를 적용한다.
- 같은 조건을 기준으로 나뉘는 switch문이 여러개라면 조건부 로직을 다형성으로 바꾸기를 적용한다.
- 반복문도 그 안의 코드와 함께 추출해서 독립된 함수로 만든다.
  - 추출한 반복문 코드에 적합한 이름이 떠오르지 않는다면 성격이 다른 두 가지 작업이 섞여있기 때문일 수 있다.
  - 이럴때는 반복문 쪼개기를 적용해서 작업을 분리한다.

### 긴 매개변수 목록

- 매개변수 목록이 길어지면 그 자체로 이해하기 어려울 때가 많다.

다른 매개변수에서 값을 얻어올수 있는 매개변수가 있을경우

- 매개변수를 질의 함수로 바꾸기로 제거한다.

사용중인 데이터 구조에서 값들을 뽑아 각각을 별개의 매개변수로 전달하는 코드라면

- 객체 통째로 넘기기를 적용해서 원본 데이터 구조를 그대로 전달한다.

항상 함께 전달되는 매개변수들은

- 매개변수 객체 만들기로 하나로 묶어버린다.

함수의 동작 방식을 정하는 플래그 역할의 매개변수는

- 플래그 인수 제거하기로 없애준다.

클래스는 매개변수 목록을 줄이는데 효과적인 수단이기도 하다.

여러개의 함수가 특정 매개변수들의 값을 공통으로 사용할 때 유용하다.

### 전역 데이터

- 전역 데이터는 코드베이스 어디에서든 접근가능하고 값을 누가 바꿨는지 찾아낼 메커니즘이 없다는게 문제다.

**변수 캡슐화하기**

- 다른 코드에서 오염시킬 가능성이 있는 데이터를 발견할 때마다 가장 먼저 적용
- 함수로 감싸는 것만으로 데이터를 수정하는 부분을 쉽게 찾을 수 있고 접근을 통제할 수 있게 된다.
- 더 나아가 접근자 함수들을 클래스나 모듈에 집어넣고 그 안에서만 사용할 수 있도록 접근 범위를 최소로 줄이는 것도 좋다.

전역 데이터가 아주 조금만 있더라고 캡슈로하 해라, 그래야 소프트 웨어가 진화하는뎅 따른 변화에 대처할 수 있다.

### 가변 데이터

데이터를 변경했더니 예상치 못한 결과나 골치 아픈 버그로 이어지는 경우가 종종있다.

무분별한 데이터 수정에 따른 위험을 줄이는 방법은 얼마든지 있다.

**변수 캡슐화하기**

- 정해놓은 함수를 거쳐야만 값을 수정할 수 있도록 하면 갑이 어떻게 수정되는지 감시하거나 코드를 개선하기 쉽다.

**변수 쪼개기**

- 하나의 변수에 용도가 다른 값들을 저장하느라 값을 갱신하는 경우에 용도별로 쪼개어 도립 변수에 저장하는게여 값 갱신이 문제를 일으킬 여지를 없앨 수 있다.

**문장 슬라이드하기, 함수 추출하기**

- 갱신 로직은 다른 코드와 떨어뜨려 놓는 것이 좋다, 무언가를 갱신하는 코드로부터 부작용이 없는 코드를 분리한다.

**질의 함수와 변경 함수 분리하기**

- 꼭 필요한 경우가 아니라면 부작용이 있는 코드를 호출할 수 없게한다.

**세터 제거하기**

- 세터를 호출하는 클라이언트를 찾는 것만으로도 변수의 유효범위를 줄이는 데 도움될 때가 있다.

**파생 변수를 질의 함수로 바꾸기**

- 값을 다른 곳에서 설정할 수 있는 가변 데이터가 풍기는 악취는 고약하다.
- 혼동과 버그와 야근을 부른다.
- 파생 변수를 질의 함수로 바꾸기를 적용해준다.

**여러 함수를 클래스로 묶기, 여러 함수를 변환 함수로 묶기**

- 변수의 유효범위가 넓어지면 위험도 덩달아 커진다.
- 변수를 갱신하는 코드들의 유효범위를 클래스나 변환으로 제한한다.
- 구조체처럼 내부 필드에 데이터를 담고 있는 변수라면 , 참조를 값으로 바꾸기를 적용하여 내부 필드를 직접 수정하지 말고 구조체를 통째로 교환하는 편이 낫다.

### 뒤엉킨 변경

코드를 수정할 때는 시스템에서 고쳐야 할 딱 한 군데를 찾아서 그 부분만 수정할 수 있기를 바란다.

이렇게 할 수 없다면 뒤엉킨 변경과 산탄총 수술 중 하나가 풍긴다.

**뒤엉킨 변경은 단일 책임 원칙 (Single Responsibility Principle)이 제대로 지켜지지 않을 때 나타난다.**

- 개발 초기에는 맥락 사이으이 경계를 명확히 나누기가 어렵고 소프트웨어 시스템의 기능이 변경되면서 이경계도 끊임 없이 움직이기 때문에 나중에 악취가 느껴지는 경우도 많다.

**순차적으로 실행되는게 자연스로운 맥락이라면**

- 다음 맥락에 필요한 데이터를 특정한 데이터 구조에 담아 전달하게 하는 식으로 단계를 분리 ( 단계 쪼개기 )

**전체 처리 과정 곳곳에서 각기 다른 맥락의 함수를 호출하는 빈도가 높다면**

- 각 맥락에 해당하는 적당한 모듈들을 만들어서 관련 함수들을 모은다(함수 옮기기), 그러면 처리 과정이 맥락별로 구분된다.

**여러 맥락의 일에 관여하는 함수가 있다면**

- 함수 추출하기를 먼저 수행한다
- 모듈이 클래스라면 클래스 추출하기가 맥락별 분리 방법을 잘 안내해 줄 수 있다.



### 산탄총 수술

산탄총 수술은 뒤엉킨 변경과 비슷하면서도 정반대다.

이 냄새는 코드를 변경할 때마다 자잘하게 수정해야 하는 클래스가 많을 때 풍긴다.

변경할 부분이 콛 전반에 퍼져 있다면 찾기도 어렵고 꼭 수정해야 할 곳을 지나치기 쉽다.

- **함께 변경되는 대상들을 함수 옮기기와 필드 옮기기로 모두 한 모듈에 묶어두면 좋다.**
- 비슷한 데이터를 다루는 함수가 많다면 여러 함수를 클래스로 묶기를 적용한다.
- 데이터구조를 변환하거나 보강 하는 함수들에는 여러 함수를 변환 함수로 묶기를 적용한다.
- 이렇게 묶은 함수들의의 출력 결과를 묶어서 다음 단계의 로직으로 전달할 수 있다면 단계 쪼개기를 적용한다.

어설프게 분리된 로직을 함수 인라인하기나 클래스 인라인하기절 같은 인라인 리팩터링으로 하나로 합치는 것도 산탄총 수술에 대처하는 좋은 방법이다

메서드나 클래스가 비대해지지만, 나중에 추출하기 리팩터링으로 더 좋은 형태로 분리할 수도 있다

### 기능 편애

프로그램을 모듈화할 때는 **영역 내부의 상호작용을 최대화하고, 영역 간의 상호작용을 최소화하는 것**이 중요하다.

**기능 편애는 특정 함수가 자신이 속한 모듈보다 다른 모듈의 함수나 데이터와 더 많이 상호작용할 때 발생하는 코드 악취다.**

- 함수를 어느 모듈로 옮길지 명확하지 않을 수도 있다.
  - 함수가 다양한 모듈의 데이터를 사용한다면 **가장 많은 데이터를 포함한 모듈로 옮긴다.**
  - **함수 추출하기**를 활용해 함수를 여러 조각으로 나눈 후, 각각 적절한 모듈로 이동하면 더 쉽게 해결할 수 있다.

**규칙을 거스르는 복잡한 패턴도 있다.**

- 대표적으로 **전략 패턴(Strategy Pattern)**, **방문자 패턴(Visitor Pattern)**, **켄트 벡의 자기 위임(Self-Delegation)** 등이 있다.
- 이 패턴들은 **뒤엉킨 변경** 악취를 제거할 때 유용하며, 핵심 원칙은 **함께 변경할 대상을 한데 모으는 것**이다.
- 데이터와 이를 활용하는 동작은 **함께 변경해야 할 경우가 많지만, 예외적인 상황도 존재한다.**
  - 예외적인 경우라면 **같은 데이터를 다루는 코드를 한 곳에서 변경할 수 있도록 옮긴다.**
  - 전략 패턴과 방문자 패턴을 적용하면 **오버라이드해야 할 동작 코드를 각각의 클래스로 격리**하여 수정이 쉬워지지만, **간접 호출이 늘어나는 단점**이 있다.

### 데이터 뭉치

어떤 데이터들이 항상 함께 다닌다면, 그들은 **보금자리를 따로 마련해줘야 하는 데이터 뭉치**일 가능성이 크다.

**데이터 뭉치는 클래스의 필드에서 발견되거나, 여러 메서드의 시그니처에서 반복적으로 등장할 수 있다.**

- **필드 형태의 데이터 뭉치**는 `클래스 추출하기`를 사용해 **하나의 객체로 묶는다.**
- **메서드 시그니처에서 발견되는 데이터 뭉치**는
  - `매개변수 객체 만들기` 또는 `객체 통째로 넘기기`를 적용하여 **매개변수 수를 줄인다.**
  - 이 과정에서 **메서드 호출 코드가 간결해진다.**

**데이터 뭉치인지 판별하는 방법**

- 데이터 중 **하나를 삭제했을 때 나머지만으로 의미가 없다면**,
  - **객체로 변환될 준비가 된 데이터 뭉치다.**

**데이터 뭉치를 클래스로 만들면 좋은 이유**

- **클래스를 활용하면 코드의 구조가 개선되고 재사용성이 높아진다.**
- **기능 편애를 제거하는 과정에서 생성된 클래스**라면,
  - **해당 클래스로 이동할 수 있는 동작(메서드)이 없는지 확인한다.**
  - **이 과정에서 중복을 줄이고, 향후 개발을 가속할 유용한 클래스를 만들 수 있다.**
- 데이터 뭉치가 **생산성을 높이는 클래스로 탄생될 수 있다.**

### 기본형 집착

- 문자열을 다루는 코드에서 특히 흔하다.
- 기본형으로 표현된 코드가 조건분 동작을 제어하는 타입 코드로 쓰였다면 `타입 코드를 서브클래스로 바꾸기`와 `조건부 로직을 다형성으로 바꾸기`를 차례로 적용한다.

자주 함께 몰려다니는 기본형 그룹도 데이터 뭉치다.

- 클래스 추출하기와 매개변수 객체만들기를 이용하여 문명사회로 이끌어줘야 한다.

### 반복되는 switch문

똑같은 조건부 로직(switch/case문 이나 길게 나열된 if/else)이 여러곳에서 반복해 등장하는 코드에 집중해보자.

**중복된 switch문이 문제가 되는 이유**

- 조건절을 하나  추가할 대마다 다른 switch문들도 모두 찾아서 함께 수정해야 하기 때문이다.
- 이럴 때 다형성은 반복된 switch문을 최신 스타일로 바꿔주는 세련된 무기이다.

### 반복문

- 핵심 프로그래밍 요소이지만 일급 함수를 지원하는 언어가 많아졌기 때문에 제거할 수 있다.
- 반복문을 파이프라인으로 바꾸기를 적용해서 제거할 수 있다.
- 필터나 맵 같은 파이프라인 연산을 사용하면 코드에서 각 원소들이 어떻게 처리되는지 쉽게 파악할 수 있다.

### 성의 없는 요소

- 본문 코드를드래도 쓰는 것과 진배없는 함수도 있고, 실질적으로 메서드가 하나뿐인 클래스도 있다.
- 이런 구조는 나중에 본문을 더 채우거나 다른 메서드를 추가할 생각이었지만, 어떠한 사정으로 인해 그렇게 하지 못한 결과일 수 있다.
- 이런 요소는 함수 인라인하기, 클래스 인라인하기로 처리한다, 상속을 사용했다면 계층 합치기를 적용한다.

### 추측성 일반화

**추측성 일반화는 "나중에 필요할 거야"라는 생각으로 당장은 필요 없는 후킹(hooking) 포인트나 특이 케이스 처리 로직을 작성할 때 발생하는 코드 악취다.**

이 개념은 브라이언 푸트(Brian Foote)가 명명했다.

**불필요한 일반화된 코드는 즉시 제거하자.**

- **하는 일이 거의 없는 추상 클래스** → `계층 합치기`를 사용해 제거
- **쓸데없이 위임하는 코드** → `함수 인라인하기` 또는 `클래스 인라인하기`로 정리
- **본문에서 사용되지 않는 매개변수** → `함수 선언 바꾸기`로 삭제
  - "나중에 다른 버전에서 필요할지도 몰라"라고 추가했지만 **한 번도 사용되지 않은 매개변수**도 제거 대상

**추측성 일반화는 테스트 코드에서만 사용되는 함수나 클래스에서 자주 발견된다.**

- 이런 코드를 발견하면 **테스트 케이스부터 삭제**
- 이후 `죽은 코드 제거하기`를 사용해 **완전히 제거**

### 임시 필드

**특정 상황에서만 값이 설정되는 필드는 코드의 이해를 어렵게 만드는 원인이 된다.**

객체를 사용할 때 **모든 필드가 채워져 있을 것이라 기대하는 것이 일반적**이므로,

**임시 필드는 "왜 존재하는가?"라는 의문을 유발하며 코드의 가독성을 해친다.**

**임시 필드를 발견하면 다음과 같은 리팩터링을 고려한다.**

- **클래스 추출하기**를 사용해 **임시 필드들이 속할 새로운 클래스를 만든다.**
- **함수 옮기기**를 활용해 **임시 필드와 관련된 코드를 새로운 클래스에 집중시킨다.**
- **임시 필드가 유효한지 확인하는 조건부 로직이 있다면**
  - **특이 케이스 추가하기**를 적용해 **필드가 유효하지 않을 경우를 처리하는 대안 클래스를 생성**한다.

**이러한 과정을 통해 코드의 구조가 개선되고 가독성이 높아진다.**

### 메시지 체인

다른 객체를 요청하는 작업이 연쇄적으로 이어지는 코드를 말한다.

이는 클라이언트가 객체 내비게이션 구조에 종속됐음을 의미한다.

**위임 숨기기 활용**

- 메시지 체인의 다양한 연결점에 적용할 수 있다.
- 체인을 구성하는 모든 객체에 적용할 수 있지만, 그러다 보면 중간 객체들이 모두 중재자가 돼버리기 쉽다
- 최종 결과 객체가 어떻게 쓰이는지 부터 살펴보는게 좋다.

**함수 추출하기로 결과 객체를 사용하는 코드 일부를 따로 빼낸 다음 함수 옮기기로 체인을 숨길수 있는지 살펴보자**

### 중재자

객체의 대표적인 기능 외부로 부터 세부사항을 숨겨주는 캡슐화가 있다.

캡슐화 과정에서는 위임이 자주 활용되는데 지나치면 문제가 된다.

클래스가 제공하는 메서드중 절반이 다른 클래스에 구현을 위임한다면?

**중재자 제거하기 적용**

- 실제로 일을 하는 객체와 직접 소통하게 한다.
- 위임 메서드를 제거한 후 남는 일이 거의 없다면 호출하는 쪽으로 인라인 하자

### 내부자 거래

**모듈 간의 데이터 거래가 많아지면 결합도(coupling)가 높아지고 유지보수가 어려워진다.**

거래 자체는 불가피하지만, **그 양을 최소화하고 투명하게 처리하는 것이 중요하다.**

**모듈 간 은밀한 데이터 주고받기가 발견되면 다음과 같은 리팩터링을 적용한다.**

- **함수 옮기기** 또는 **필드 옮기기**를 사용해 **불필요한 의존성을 줄인다.**
- **여러 모듈이 같은 관심사를 공유한다면**
  - **공통 부분을 담당할 제3의 모듈을 생성한다.**
  - **위임 숨기기**를 적용하여 중간자 역할을 수행하는 모듈을 만든다.

**상속 관계에서도 내부자 거래 문제가 발생할 수 있다.**

- 자식 클래스는 종종 부모 클래스의 공개 범위를 넘어 **불필요한 내부 정보를 알고자 한다.**
- 부모 클래스로부터 독립해야 할 시점이라면,
  - **서브클래스를 위임으로 바꾸기** 또는
  - **슈퍼클래스를 위임으로 바꾸기**를 적용해 구조를 개선한다.

**이러한 리팩터링을 통해 모듈 간 결합도를 낮추고, 코드의 유지보수성을 높일 수 있다.**

### 거대한 클래스

한 클래스가 너무 많은 일을 하려다 보면 필드 수가 상당히 늘어난다.

그리고 클래스에 필드가 너무 많으면 중복 코드가 생기기 쉽다.

**클래스 추출하기로 필드들을 따로 묶기**

- 같은 컴포넌트에 모아두는 것이 합당해 보이는 필드들을 선택하면 된다.
  - 한 클래스 안에서 접두어나 접미어가 같은 필드들이 함께 추출할 후보들.
- 분리할 컴포넌트를 원래 클래스와 상속 관계로 만드는게 좋다면 (클래스 추출하기 보다는) **슈퍼 클래스 추출하기나** **타입 코드를 서브클래스로 바꾸기**를 적용하는 편이 더 쉬울 것.

**필드가 너무 많은 클래스와 마찬가지로 코드량이 너무 많은 클래스도 중복 콛와 혼동을 일으킬 여지가 크다.**

- 그 클래스 안에서 중복을 제거
- 공통 부분을 작은 메서드로 뽑아내자.

**클라이언트들이 거대 클래스를 이용하는지 패턴을 파악해 클래스를 어떻게 쪼갤지 단서를 얻을 수도 있다.**

- 특정 기능 그룹만 주로 사용하는지 파악한다
- 각각의 기능 그룹이 개별 클래스로 추출될 후도.
- 찾은 기능 그룹들을 **클래스 추출하기, 슈퍼클래스 추출하기, 타입 코드를 서브클래스로 바꾸기** 등을 활용해서 여러 클래스로 분리

### 서로 다른 인터페이스의 대안 클래스들

클래스를 사용하는 **큰 장점 중 하나는 필요에 따라 다른 클래스로 교체할 수 있다는 것**이다.

하지만 **교체가 가능하려면 인터페이스가 동일해야 한다.**

**인터페이스를 맞추기 위한 리팩터링 방법**

- **메서드 시그니처를 일치시키기** → `함수 선언 바꾸기` 적용
- **필요한 동작을 클래스 내부로 이동** → `함수 옮기기` 활용
  - 이를 통해 **대안 클래스들의 인터페이스가 점점 유사해진다.**
- **대안 클래스들 사이에 중복 코드가 생긴다면?**
  - `슈퍼클래스 추출하기`를 고려하여 **중복된 부분을 공통 부모 클래스로 분리**

**이러한 과정을 통해 클래스 간 교체 가능성을 높이고 코드의 일관성을 유지할 수 있다.**

### 데이터 클래스

데이터 필드와 게터/세터 메서드로만 구성된 클래스

데이터 저장용도로만 쓰이다보니 다른 클래스 너무 깊이까지 함부로 다룰 때가 많다.

**접근 제한하기**

- public 필드가 있다면 레코드 캡슐화하기로 숨기자
- 변경하면 안되는 필드는 세터 제거하기로 접근을 원천 봉쇄한다.
- 게터나 세터를 사용하는 메서드를 찾아 데이터 클래스로 함수 옮기기
- 옮기기 어렵다면 함수 추출하기를 이용해 옮길 수 있는 부분만 별도 메서드로 추출한다.

**데이터 클래스는 필요한 동작이 엉뚱한 곳에 정의돼 있다는 신호일 수 있다.**

- 클라이언트 코드를 데이터 클래스로 옮기기만 해도 대폭 개선된다.

**불변이라면 캡슐화 할 필요가 없고 필드 자체를 공개해도 된다.**

### 상속 포기

**서브클래스는 부모로부터 데이터를 물려받는데 원치 않거나 필요없을 경우가 있다.**

- 같은 계층에 서브 클래스를 새로 만들고, **메서드 내리기와 필드 내리기**를 활용해 물려받지 않을 부모 코드를 모조리 새로 만든 서브클래스로 넘긴다

**상속 포기 냄새는 서브클래스가 부모의 동작은 필요로하지만 인터페이스는 따르고 싶지 않을 때 특히 심하게 난다**

- 인터페이스를 따르지 않는다는 것은 상당히 무례한 태도
- **이럴 서브클래스를 위임으로 바꾸기나 슈퍼클래스를 위임으로 바꾸기**를 활용해서 아예 상속 메커니즘에서 벗어나보자.

### 주석

주석이 장황하게 달린 원인이 코드를 잘못작성 했기 때문인 경우가 의외로 만다.

주석이 많으면 온갖 악취를 풍기는 코드가 나오기 쉽다.

**주석을 남겨야겠다는 생각이 들면, 가장 먼저 주석이 필요 없는 코드로 리팩터링해본다.**

- 특정 코드 블록이 하는 일에 주석을 남기고 싶다면 함수 추출하기를 적용해 본다.
- 이미 추출되어 있는 함수임에도 여전히 설명이 필요하다면 함수 선언 바꾸기로 함수 이름을 바꿔본다.
- 시스템이 동작하기 ㅜ이한 선행조건을 명시하고 싶다면 어서션 추가하기가 대기하고 있다.

</div>
</details>


<details>
<summary>4장</summary>
<div markdown="4">
**리팩터링을 제대로 하려면 실수를 잡아주는 견고한 테스트 스위트가 뒷받침돼야 한다.**

# 4.1 자가 테스트 코드의 가치

- 모든 테스트를 완전히 자동화하고 결과까지 스스로 검사하게 만들자.

### 버그를 찾는 강력한 도구가 된다.

- 디버깅 시간이 줄어, 컴파일할 때는 테스트와 함께하면 생산성이 상승한다.
- 의심되는 코드의 양이 많지 않고 아직 기억이 생생하니 버그를 쉽게 찾을 수 있다.
- 테스트 스트위틑 강력한 버그 검출 도구로, 버그를 찾는데 걸리는 시간을 대폭 줄여준다.

### TDD

- 테스트를 작성하기 가장 좋은 시간을 프로그래밍을 시작하기 전이다.
- 테스트를 작성하다보면 원하는 기능을 추가하기 위해 무엇이 필요한지 고민하게 된다.
  - 구현보다 인터페이스에 집중하게 된다는 장점도 있다.
- 코딩이 완료되는 시점을 정확하게 판단할 수 있다.
  - 테스트를 모두 통과한 시점이 바로 코드를 완성한 시점이다.
- 테스트를 작성하고, 테스트를 통과하게끔 코드를 작성하고, 결과 코드를 최대한 깔끔하게 리팩터링 하는 과정을 짧은 주기로 반복한다.

**자주 테스트하라. 작성중인 코드는 최소한 몇 분 간격으로 테스트하고, 적어도 하루에 한 번은 전체 테스트를 돌려보자.**

# 4.4 테스트 추가하기

- 테스트는 위험 요인을 중심으로 작성해야 한다.
- 테스트의 목적은 어디까지나 현재 혹은 향후에 발생하는 버그를 찾는데 있다.
- 단순히 필드를 읽고 쓰기만 하는 접근자는 테스트할 필요가 없다.

가장 걱정되는 영역을 집중적으로 테스트하자

- 테스트를 너무 많이 만들다 보면 오히려 필요한 테스트를 놓치기 쉽다.
- 잘못될까봐 가장 걱저오디는 영역을 집중적으로 테스트하라.
- 이렇게 해서 테스트에 쏟는 노력의 효과를 극대화 할 수 있다.

**완벽하게 만드느라 테스트를 수행하지 못하느니, 불와전한 테스트라도 작성해 실행하는게 낫다.**

### 테스트 픽스처

- 테스트끼리 상호작용하게 하는 공유 픽스처는 테스트 관련 버그 중 가장 지저분하다.
- 공유 객체는 테스트를 실행하는 순서에 따라 결과가 달라질 수 있다.
- 이렇게 되면 테스트 결과가 제멋대로가 되어 버그를 잡기가 어렵고 오래 걸린다.
- 매번 새로운 픽스처를 만드는 것이 가장 확실한 방법

# 4.5 픽스처 수정하기

- 설정한 표준 픽스처를 취해서, 테스트를 수행하고, 이 픽스처가 일을 기대한 대로 처리했는지를 검증한다.
- 패턴
  - 설정-실행-검증 setup-exercise-verify,
  - 조건-발생-결과 given-when-then,
  - 준비-수행-단언 arrange-act-assert 등으로 부른다
- 이 세 가지 단계가 한 테스트 안에 모두 담겨 있을 수도 있고, 초기 준비 작업 중 공통되는 부분을 beforeEach와 같은 표준 설정 루틴에 모아서 처리하기도 한다.

**구문 하나당 검증은 하나씩만 하는게 좋다.**

- 앞쪽 검증을 통과하지 못하면 나머지 검증은 실행해보지 못하고 테스트가 실패하게 되는데 원인 파악에 대한 정보를 놓치기쉽다.

# 4.6 경계 조건 검사하기

경계를 확인하는 테스트를 작성해보면 프로그램에서 특이 상황을 어떻게 처리하는게 좋을지 생각해볼 수 있다.

**문제가 생길 가능성이 있는 경계조건을 생각해보고 그 부분을 집중적으로 테스트하자.**

### 예외와 실패와 에러

- 실패란 검증 단계에서 실제 값이 예상 범위를 벗어났다는 뜻.
- 에러는 검증보다 앞선 과정에서 발생한 예외 상황을 말한다.
- 에러 상황을 지금보다 잘 처리하도록 코드를 추가할 수도 있고.
- 더 의미 있는 오류 메시지를 출력할 수도 있다.

오류로 인해 프로그램 내부에 잘못된 데이터가 흘러서 디버깅하기 어려운 문제가 발생한다면 어셔션 추가하기 를 적용해서 오류가 최대한 빨리 드러나게 하자.

**테스트 수확 체감 법칙**

- 테스트를 너무 많이 작성하다 보면 오히려 의욕이 떨어져 나중에는 하나도 작성하지 않게 될 위험도 있다.
- 위험한 부분에 집중하자.
- 테스트 스위트 부터 갖춘뒤 리팩터링, 하지만 리팩터링 하는 동안에도 계속해서 테스트를 추가한다.

# 끝나지 않은 여정

### 버그가 발생하면 버그를 드러내는 단위 테스트부터 작성하자.

- 버그를 발견하는 즉시 잡아내는 테스트를 작성하는 습관을 들이자.
- 해당 버그가 다시 나타나지 않는지 확인할 수 있다.
- 버그와 테스트를 계기로 테스트 스위트에 또 다른 구멍은 없는지 까지 살펴본다.

### 자가 테스트의 목적

- 믿음을 갖게 해주는 것.
- 리팩터링 후 테스트 결과가 모두 초록색인 것만 보고 리팩터링 과정에서 생겨난 버그가 하나도 없다고 확신할 수 있다면 충분히 좋은 테스트 스위트라 할 수 있다.
</div>
</details>


<details>
<summary>6장</summary>
<div markdown="6">

# 6장 기본적인 리팩터링

### 함수 추출하기

코드 조각을 찾가 무슨 일을 하는지 파악한 다음, 독립된 함수로 추출하고 목적에 맞는 이름을 붙인다.

**코드를 언제 독립된 함수로 묶어야 할까?**

- ‘목적과 구현을 분리’ 하는 방식이 가장 합리적인 기준
- 코드르 보고 무슨일을 하는지 파악하는데 한참이 걸린다면 그 부분을 함수로 추출한 뒤 ‘무슨 일’ 에 걸맞는 이름을 짓는다.
- 이렇게 하면 나중에 코드를 다시 읽을 때 함수의 목적이 눈에 확 들어오고, 본문 코드에 대해서는 더 이상 신경 쓸 일이 거의 없다.

**짧은 함수**

- 함수 안에 들어갈 코드가 대여섯 줄을 넘어갈 때부터 슬슬 냄새를 풍긴다.
- 길이는 중요하지 않다.
- 함수를 잛게 만들면 함수 호출이 많아져서 성능이 느려질까 걱정하지 마라
  - 함수가 짧으면 캐싱하기가 더 쉽기 때문에 컴파일러가 최적화하는데 유리할 때가 많다.
- 짧은 함수의 이점은 이름을 잘 지어야만 발휘되므로 이름 짓기에 특별히 신경써야 한다.

### 함수 인라인하기

- 함수 본문이 이름만큼 명확한 경우도 있다.
- 또는 함수 본문 코드를 이름만큼 깔끔하게 리팩터링 할 때도 잇다.
- 이럴 때 함수를 제거한다.
- 간접 호출은 유용할 수도 있지만 쓸데없는 간접 호출은 거슬릴 뿐이다.
- 핵심은 항상 단계를 잘게 나눠서 처리하는데 있다.

### 변수추출하기

- 표현식이 너무 복잡해서 이해하기 어려울 때 지역 변수를 활용하면 표현식을 쪼개 관리하기 더 쉽게 만들 수 있다.
- 그러면 복잡한 로직을 구성하는 단계마다 이름을 붙일 수 있어서 코드의 목적을 훨씬 명확하게 드러낼 수 있다.
- 클래스 전체에 영향을 줄 때 변수가 아닌 메서드로 추출한다.

**객체의 엄청난 장점**

객체는 특정 로직과 데이터를 외부와 공유하려 할때 공유할 정보를 설명해주는 적당한 크기의 문맥이 되어준다.

덩치가 큰 클래스에서 공통 동작을 별도 이름으로 뽑아내서 추상화해두면 객체를 다룰 때 쉽게 활용할 수 있어서 매우 유용한다.

### 변수 인라인하기

- 변수는 함수 안에서 표현식을 가리키는 이름으로 쓰이며, 대체로 긍정적인 효과를 준다.
- 이름이 원래 표현식과 다를 바 없을때 리팩터링 하는데 방해가 되기도 하며 이럴 떄 인라인 하는 것이 좋다.

### 함수 선언 바꾸기

**함수는 프로그램을 작은 부분을 나누는 주된 수단**

- 함수 선언은 각 부분이 서로 맞물리는 방식을 표현하며, 실질적으로 소프트웨어 시스템의 구성 요소를 조립하는 연결부 역할을 한다.
- 함수를 잘못정의하면 지속적인 방해요인으로 작용하여 동작을 파악하기 어렵고 적절히 수정하기 어렵다.
- 연결부에서 가장 중요한 요소는 함수의 이름
  - 이름이 좋으면 함수의 구현 코드를 살펴볼 필요 없이 호출문만 보고도 무슨 일을 하는지 파악할 수 있다.

**매개변수는 함수가 외부 세계와 어우러지는 방식을 정의**

- 매개변수는 함수를 사용하는 문맥을 설정

### 변수 캡슐화 하기

- 접근할 수 있는 범위가 넓은 데이터를 옮길 때는 먼저 그 데이터로의 접근을 독점하는 함수를 만드는 식으로 캡슐화 하는 것이 가장 좋은 방법일 때가 많다.
- 데이터 재구성이라는 어려운 작업을 함수 재구성이라는 더 단순한 작업으로 변환하는 것.
- 데이터 캡슐화는 데이터를 변경하고 사용하는 코드를 감시할 수 있는 확실한 통로가 되어준다.
  - 때문에 데이터 변경 전이나 변경 후 추가 로직을 쉽게 끼워 넣을 수 있다.
- 객체 지향해서 객체의 데이터를 private으로 유지해야 한다. 그래야 데이터의 유효범위를 제한하고 자주 사용하는 데이터에 대한 결합도가 높아지는 일을 막을 수 있다.

### 변수 이름 바꾸기

- 명확한 프로그래밍의 핵심은 이름짓기
  - 프로그래머가 하려는 일에 관해 많은 것을 설명해준다.

### 매개변수 객체 만들기

- 데이터 항목 여러개가 함수에 함께 몰려다니는 경우에 데이터 구조 하나로 모아준다.
  - 데이터 뭉치를 구조로 묶으면 데이터 사이의 관계가 명확해진다는 이점을 얻을 수 있다.
  - 같은 데이터 구조를 사용하는 모든 함수가 원소를 참조할때 항상 똑같은 이름을 사용하기 때문에 일관성도 높여준다.
- 이런 데이터 구조를 발견하면 이 데이터 구조를 활용하는 형태로 프로그램 동작을 재구성한다.
  - 공통으로 적용되는 동작을 추출해서 함수로 만듬
- 새로 만든 데이터 구조가 문제 영역을 간격하게 표현하는 새로운 추상 개념이 되면서 코드의 개념적인 그림을 다시 그릴 수도 있다.

### 여러 함수를 클래스로 묶기

- 함수들을 클래스로 묶으면 함수들이 공유한는 공통 환경을 더 명확하게 표현할 수 있고 각 함수에 전달되는 인수에 줄여서 객체안에서의 함수 호출을 간결하게 만들 수 있다.
- 또한 이런 객체를 시스템의 다른 부분에 전달하기 위한 참조를 제공 할 수 있다.
- 클래스로 묶을 때의 두드러진 장점은 클라이언트가 객체의 핵심 데이터를 변경할 수 있고, 파생 객체들을 일관되게 관리할 수 있다는 것.

**이 래팩터링은 이미 만들어진 함수들을 재구성할 때는 물론, 새로 만든 클래스와 관련하여 놓친 연산을 찾아서 새 클래스의 메서드로 뽑아내는 데도 좋다.**

### 여러 함수를 변환 함수로 묶기

- 여러 가지 정보를 도출할 때 도출된 정보는 여러곳에서 사용도리 수 있는데 한데로 모아두면 일관된 장소에서 처리할 수 있고 로직 중복도 막을 수 있다.
- 이렇게 하기 위해서 변환 함수를 사용할 수 있다.
- 변환 함수는 원본 데이터를 입력받아서 필요한 정보를 모두 도출한 뒤, 각각을 출력 데이터의 필드에 넣어 반환한다.
- 이러면 도출 과정을 검토할 일이 생겼을때 변환 함수만 살펴보면 된다.
- 변환 함수로 묶을 수도 클래스로 묶을 수도 있다.
  - 하지만 원본데이터가 코드 안에서 갱신될 때는 클래스로 묶는 편이 훨씬 낫다.
  - 변환 함수로 묶으면 가공한 데이터를 새로운 레코드에 저장하므로, 원본 데이터가 수정되면 일관성이 깨질 수 있다.
- 여러 함수를 한데 묶는 이유 하나는 도출 로직이 중복되는 것을 피하기 위해서
  - 변환 함수, 클래스로 묶으면 이런 함수를 쉽게 찾아 쓸 수 있다.

### 단계 쪼개기

- 두 대상을 한꺼번에 다루는 코드는 별개 모듈로 나누는 방법을 모색해라
- 코드를 수정해야 할 때 두 대상을 동시에 생각할 필요 없이 하나에만 집중하기 위해.
- 가장 간편한 방법은 동작을 연이은 단계로 쪼개는 것.
- 각 단계는 자신만의 문제에 집중하기 때문에 나머지 단계에 관해서는 자세히 몰라도 이해할 수 있다.
- 다른 단계로 볼 수 있는 코드 영역들이 마침 서로 다른 데이터와 함수를 사용한다면 단계 쪼개기에 적합하다는 뜻.
- 이 코드 영역들을 별도 모듈로 분리하면 그 차이를 코드에서 훨씬 분명하게 드러낼 수 있다.

**험블 객체 패턴**

- 느리고 불편한 작업과 자주 테스트해야 할 복잡한 동작을 분리함으로 테스트를 더 쉽게 수행할 수 있도록 하는 원칙
</div>
</details>


<details>
<summary>7장</summary>
<div markdown="7">

# 7장 캡슐화

**캡슐화**

**모듈을 분리하는 가장 중요한 기준**

- 각 모듈이 자신을 제외한 다른 부분에 드러내지 않아야 할 비밀을 얼마나 잘 숨기느냐
- 대표적 형태로 레코드 캡슐화하기, 컬렉션 캡슈로하하기
- 기본형 데이터도 기본형을 객체로 바꾸기로 캡슐화 할 수 있다.

**클래스**

- 클래스는 본래 정보를 숨기능 용도로 설계
- 클래스는 내부 정보뿐아니라 클래스 사이의 연결 관계를 숨기는 데도 유용하다.
- 가장 큰 캡슐화 단위는 클래스와 모듈이지만 함수도 구현을 캡슐화한다.

### 7.1 레코드 캡슐화 하기

**레코드**

- 레코드는 연관된 여러 데이터를 직관적인 방식으로 묶을 수 있어서 각각을 따로 취급할 떄보다 훨씬 의미 있는 단위로 전달할 수 있게 해준다.
- 하지만 단점이 존재
  - 계산해서 얻을 수 있는 값과 그렇지 않은 값을 명확히 구분해 저장해야 한다.

**객체**

어떻게 저장했는지를 숨긴 채 값을 각각의 메서드로 제공할 수 있다.

### 7.2 컬렉션 캡슐화

**가변 데이터 캡슐화**

- 가변 데이터를 캡슐화하면 데이터 구조가 언제 수정되는지 파악하기 쉬워서 필요한 시점에 데이터 구조를 변경하기도 쉬워진다.
- 컬렉션을 소유한 클래스를 통해서만 원소를 변경 하도록 하면 프로그램을 개선하면서 컬렉션 변경 방식도 원하는 대로 수정할 수 있다.
- 컬렉션 게터가 원본 컬렉션을 반환하지 않게 만들어 실수로 컬렉션을 바꿀 가능성을 차단하자

**내부 컬렉션을 직접 수정하지 못하게 막는 방법 중 하나.**

- 컬렉션이 소속된 클래스의 적절한 메서드를 반드시 거치게 하는 것. (비추천)
  - 표준 인터페이스 대신 전용 메서드들을 사용하게 하면 부가적인 코드가 상당히 늘어나며 컬렉션 연산들을 조합해 쓰기도 어렵다.
- 컬렉션 읽기 전용
  - 프락시가 내부 컬렉션을 읽는 연산은 그대로 전달하고, 쓰기는 모두 막는것.
- 컬렉션 복제본 반환
  - 컬렉션 게터를 제공하되 내부 컬렉션의 복제본을 반환
  - 복제본을 수정해도 캡슐화된 원본 컬렉션에는 아무런 영향을 주지 않는다.

**중요!**

- 코드베이스에서 일관성을 주는 것.
- 한 가지만 적용해서 컬렉션 접근 함수의 동작 방식을 통일 해야 한다.

### 7.3 기본형을 객체로 바꾸기

- 간단한 데이터 항목이 단순한 출력 이상의 기능이 필요해지는 순간 그 데이터를 표현하는 전용 클래스를 정의한다.
  - e.g. 전화번호 문자열, 포매팅, 지역 코드 추출 필요
- 후에 특별한 동작이 필요해지면 이 클래스에 추가하면 되니 프로그램이 커질수록 점점 유용한 도구가 된다.

### 7.4 임시 변수를 질의 함수로 바꾸기

- 함수 안에서 어떤 코드의 결괏값을 뒤에서 다시 참조할 목적으로 임시 변수를 쓰기도 한다.
- 임시 변수를 사용하면 값을 계산하는 코드가 반복되는 걸 줄이고 값의 의미를 설명할 수도 있어서 유용하다
- 하지만 더 나아가 아예 함수로 만들어 사용하는 편이 나을 때가 많다.
- 변수 대신 함수로 만들어두면 비슷한 계산을 수행하는 다른 함수에서도 사용할 수 있어 코드 중복이 줄어든다.
- 클래스 안에서 적용할 때 효과가 크다.
  - 클래스는 추출할 메서드에 공유 컨텍스트를 제공하기 때문이다.

### 7.5 클래스 추출하기

- 클래스는 명확하게 추상화하고 소수의 주어진 역할만 처리해야 한다.
- 메서드와 데이터가 너무 많은 클래스는 이해하기가 쉽지 않아 적절히 분리하는 것이 좋다.
  - 일부 데이터와 메서드를 따로 묶을 수 있다면 분리하라는 신호
  - 제거해도 다른 필드나 메서드들이 논리적으로 문제가 없다면 분리할 수 있다는 뜻.
- 작은 일부의 기능만을 위해 서브 클래스를 만들거나 확장해야할 기능이 무엇이냐에 따라 서브 클래스를 만드는 방식도 달리진다면 클래스를 나눠야 한다는 신호.

### 7.6 클래스 인라인하기

- 클래스 추출하기를 거꾸로 돌리는 리팩터링
- 더이상 제 역할을 못해서 그대로 두면 안되는 클래스 인라인
  - 특정 클래스에 남은 역할이 거의 없을 때
- 클래스를 가장 많이 사용하는 클래스로 흡수시킨다.
- 두 클래스의 기능을 지금과 다르게 배분하고 싶을 때도 클래스를 인라인

### 7.7 위임 숨기기

- 위임 객체의 인터페이스가 바뀌면 이 인터페이스를 사용하는 모든 클라이언트가 코드를 수정해야 한다.
- 이런한의존성을 없애려면 서버 자체에 위임 메서드를 만들어서 위임 객체의 존재를 숨기면 된다.

### 7.8 중개자 제거하기

- 클라이언트가 위임 객체의 또 다른 기능을 사용하고 싶을 때마다 서버는 위임 메서드를 작성해야함.
  - 단순히 전달만 하는 위임 메서드들이 점점 많아짐.
- 서버 클래스는 그저 중개자 역할로 전락해 클라이언트가 위임 객체를 직접 호출하는게 나을 수 있다.

### 7.9 알고리즘 교체하기

- 더 간명한 방법을 찾아내면 복잡한 기존 코드를 간명한 방식으로 고친다.
- 작업 전 메서드를 가능한 잘게 나눴는지 확인해야 한다.
- 거대하고 복잡한 알고리즘을 교체하기란 상당히 어려우니 알고리즘을 간소화하는 작업부터 해야 교체가 쉬워진다.
</div>
</details>



<details>
<summary>8장</summary>
<div markdown="8">

# 8장 기능 이동

요소를 다른 컨텍스트 (클래스나 모듈 등)으로 옮기는 일 역시 리팩터링의 중요한 축

### 8.1 함수 옮기기

**모듈성**

- 좋은 소프트웨어 설계의 핵심은 모듈화가 얼마나 잘 되어 있느냐
- 프로그램의 어딘가를 수정하려 할때 해당 기능과 깊이관련된 작은 일부만 이해해도 가능하게 해주는 능력
- **모듈성을 높이려면 서로 연관된 요소들을 함께 묶고, 요소 아이의 연결 관계를 쉽게 찾고 이해할 수 있도록 해야 한다.**

**객체 지향 프로그래밍의 핵심 모듈화 컨텍스트는 클래스**

**모듈성이 좋으면?**

- 캡슐화가 좋아진다.
- 각 요소의 역할에 집중하면서 다른 세부사항에 대해 덜 의존하게 된다.

### 8.2 필드 옮기기

**데이터 구조의 중요성**

- 주어진 문제에 적합한 데이터 구조를 활용하면 동작 코드는 자연스럽게 단순하고 직관적으로 짜여진다.
- 데이터 구조를 잘못 선택하면  이해하기 어려운 코드가 만들어지고 어떤 일을 하는지 파악하기 어려워진다.

**현재 데이터 구조가 적절치 않음을 깨닫게 되면 곧바로 수정해야 한다.**

### 8.3 문장을 함수로 옮기기

- 중복 제거는 코드를 건강하게 관리하는 가장 효과적인 방법 중 하나.
  - 수정이 단순해진다.
- 여러 변형이 생기는 순간이오면 문장 호출한 곳으로 옮기기를 사용해 쉽게 다시 뽑아낼 수 있다.

### 8.4 문장을 호출한 곳으로 옮기기

- 함수는 추상화의 기본 빌딩 블록
- 추상화의 경계를 올바르게 정하기 어렵다.
  - 코드베이스의 기능 범위가 달라지면 추상화의 경계도 움직이게 됨.
- 함수가 어느새 둘 이상의 다른 일을 수행하게 될 수도 있다.
- 여러 곳에서 사용하던 기능이 일부 호출자에게는 다르게 동작하도록 바뀌어야 한다면 이런 일이 발생

### 8.5 인라인 코드를 함수 호출로 바꾸기

- 함수의 이르밍 코드의 동작 방식보다는 목적을 말해주기 때문에 함수를 활용하면 코드를 이해하기 쉬워진다.
- 중복을 없애는데도 효과적
  - 똑같은 코드를 반복하는 대신 함수를 호출하면 된다.

### 8.6 문장 슬라이드하기

- 관련된 코드들이 가까이 모여 있다면 이해하기 더 쉽다.
- 관련 코드끼리 모으는 작업은 다른 리팩터링의 준비단계로 자주 행해진다.
- 슬라이드가 안전한 지를 판단하려면 관련된 연산이 우엇이고 어떻게 구성되는지를 완벽히 이해해야 한다.

### 8.7 반복문 쪼개기

- 반복문 하나에 두가지 일을 수행하면 반복문을 수정할 때무다 두 가지 일 모두를 잘 이해하고 진행해야 한다.
- 각각의 반복문으로 수정해두면 수정할 동작 하나만 이해하면 되기 때문에 더 명확하고 간단하다.
- 리팩터링과 최적화를 구분하자
  - 최적화는 코드를 깔끔히 정리한 이후에 수행하자
  - 반복문을 두 번 실행 하는게 병목이라 밝혀지면 그때 다시 하나로 합치기는 식은 죽 먹기.
- 반복문 쪼개기가 다른 더 강력한 최적화를 적용할 수 있는 길을 열어주기도 한다.

### 8.8 반복문을 파이프라인으로 바꾸기

- 논리를 파이프라인으로 표현하면 이해하기 훨씬 쉬워진다. 객체가 파이프라인을 따라 흐르며 어떻게 처리되는 지를 읽을 수 있기 때문이다.

### 8.9 죽은 코드 제거하기

- 사용하지 않는 코드가 있다면 소프트웨어의 동작을 이해하는 데 커다란 걸림돌이 될 수 있다.
  - 코드의 동작을 이해하기 위해 코드를 수정했는데도 기대한 결과가 나오지 않는 이유를 파악하기 위해 시간을 허비하게 된다.
- 버전 관리 시스템을 믿고 제거하라

</div>
</details>



<details>
<summary>9장</summary>
<div markdown="9">

# 9장 데이터 조직화

### 9.1 변수 쪼개기

- 변수에는 값을 단 한번만 대입해야 한다.
- 두번 이상 이뤄진다면 여러가지 역할을 수행한다는 신호
- 역할이 둘 이상인 변수가 있다면 큰 혼란을 줄 수 있기 때문에 쪼개야 한다.

### 9.2 필드 이름 바꾸기

- 데이터 구조는 프로그램을 이해하는 데 큰 역할을 하는데  그 중 레코드 구조체 필드 이름들은 더욱 중요하다.
- 데이터 구조가 중요한 만큼 깔끔하게 관리해야 한다.
- 개발을 하면서 깊어진 이해를 프로그램에 반드시 반영해야 한다.

### 9.3 파생 변수를 질의 함수로 바꾸기

- 가변데이터는 문제를 일으키는 큰 골칫거리
- 가변데이터는 서로 다른 두 코드를 결합하여 다른 쪽 코드에 원인을 찾기 어려운 문제를 야기하기도 함
- 가변 데이터의 유효 범위를 가능한 좁혀야 한다.
- 좋은 방법으로 값을 쉽게 계산해낼 수 있는 변수들은 모두 제거.
  - 코드 자체 데이터의 의미를 더 분명히 드러내는 겨우도 자주 있으며
  - 변경된 값을 깜빡하고 변수에 반영하지 않는 실수를 막아준다.

**예외**

- 불변
  - 피연산자 데이터가 불변이라면 계산 결과도 일정

변형 연산

- 새로운 데이터 구조를 생성
1. 데이터 구조를 감싸며 그 데이터에 기초하여 계산한 결과를 속성으로 제공하는 객체
2. 데이터 구조를 받아 다른 데이터 구조로 변환해 반환하는 함수.

### 9.4 참조를 값으로 바꾸기

- 객체를 다른 객체에 중첩하면 내부 객체를 참조 혹은 값으로 취급할 수 있다.
- 참조와 값의 차이는 내부 객체 속성을 갱신하는 방식에서 극명하게 드러남.
  - 참조는 내부 객체는 그대로 둔채 속성만 갱신
  - 값은 새로운 속성을 담은 객체로 기존 내부 객체를 통째로 대체

**값 객체**

- 필드를 값으로 다룬다면 내부 객체의 클래스를 수정하여 값객체로 만들 수 있다.
- 값 객체는 불변
- 값 객체는 분산 시스템과 동시성 시스템에서 특히 유용
- 공유 객체의 값을 변경했을때 관련 객체에 모두 알려줘야 한다면 공유 객체를 참조로 다뤄야 한다.

### 9.5 매직 리터럴 바꾸기

- 매직 리터럴이란 소스 코드에 등장하는 일반적인 리터럴 값
- 매직 리터럴 값 보다는 코드 자체가 뜻을 분명하게 드러내는게 좋다
  - 상수를 정의하고 숫자 대신 상수를 사용하도록 바꾸면 될것.

</div>
</details>


<details>
<summary>10장</summary>
<div markdown="10">

# 10장 조건부 로직 간소화

**조건부 로직은 프로그램의 힘을 강화하는데 크게 기여하지만, 프로그램을 복잡하게 만드는 주요 원흉이기도 함**

### 10.1 조건문 분해하기

- 조건을 검사하고 그 결과에 따른 동작을 표현한 코드는 무슨 일이 일어나는지 이야기해주지만 ‘왜’ 일어나는지는 제대로 말해주지 않을 때가 많은 것이 문제
- 거대한 코드블록을 부위별로 분해한 다음 각 덩어리의 의도를 산린 이름의 함수 호출로 바꿔라
  - 그러면 전체적인 의도가 더 확실히 드러난다.
- 이렇게 되면 무엇인지 강조하고 그래서 무엇을 분기했는지가 명백해진다.

### 10.2 조건식 통합하기

- 여러 조각으로 나뉜 조건들을 하나로 통합함으로 하려는 일이 더 명확해진다
- 함수 추출하기 까지 이어질 가능성이 높다
  - 복잡한 조건식을 함수로 추출하면 코드의 의도가 훨씬 분명하게 드러나는 경우가 많다.
  - 함수 추출하기는 ‘무엇’을 하는지를 기술하던 코드를 ‘왜’ 하는지를 말해주는 코드로 바꿔주는 효과적인 도구
- 하나의 검사라고 생각할 수 없는, 진짜로 독립된 검사들이라고 판단되면 이 리팩터링을 해서는 안된다.

### 10.3 중첩 조건문을 보호 구문으로 바꾸기

- 조건문은 두 가지 형태로 쓰이기 때문에 서로 의도하는 바가 다르므로 그 의도가 코드에 드러나야 한다.
  - 참인 경로와 거짓인 경로 모두 정상동작
  - 한쪽만 정상
- 두 경로 모두 정상 동작이라면 if else
- 보호 구문
  - 한쪽만 정상이라면 비정상 조건을 if에서 검사한후 조건이 참이면(비정상) 함수에서 빠져나온다.
- 중첩 조건문을 보호 구문으로 바꾸기 리팩터링의 핵심은 의도를 부각시키는 것.

### 10.4 조건부 로직을 다형성으로 바꾸기

- 복잡한 조건부 로직을 프로그래밍에서 해석하기 가장 난해한 대상에 속함
- 더 높은 수주느이 개념을 도입해 이 조건들을 분리해낼 수 있다.
- 클래스와 다형성을 이용하면 더 확실하게 분리할 수 있다.
- switch → case별로 클래스를 하나씩만들어 다형성을 활용하여 어떻게 동작할지 각 타입이 알아서 처리하도록 구성
- 기본 동작을위한 case문자 그 변형 동작으로 구성된 로직
  - 기본 동작을 슈퍼 클래스로 넣어서 기본 동작에 집중
  - 변형 동작을 뜻하는 case들을 서브 클래스로 구성
- 다형성은 객체지향의 핵심, 그러나 모든 조건부 로직을 다형성으로 대체해야 하는 것은 아님

### 10.5 특이 케이스 추가하기

- 코드베이스에서 특정 값에 대해 똑같이 반응하는 코드가 여러 곳이라면 그 반응들을 한 데로 모으는게 효율적

**특이 케이스 패턴**

- 특수한 경우의 공통 동작을 요소 하나에 모아서 사용
- 특이 케이스를 확인하는 코드 대부분을 단순한 함수 호출로 바꿀 수 있다.

**널 객체 패턴**

- 널 은 특이 케이스로 처리해야 할 때가 많다.

### 10.6 어서션 추가하기

- 가정이 코드에 항상 명시적으로 기술되어 있지 않는 경우, 어서션을 이용해서 코드 자체에 삽입해놓을 수 있다
- 어서션은 프로그램이 어떤 상태임을 가정한 채 실행되는지를 다른 개발자에게 알려주는 훌륭한 소통 도구
- 테스트가 있다면 디버깅 용도로서 효용은 줄어들 수 있지만 소통 측면에서는 어서션이 여전히 매력적

### 10.7 제어 플래그를 탈출문으로 바꾸기

- 제어 플래그란 코드의 동작을 변경하는데 사용되는 변수
- 어딘가에서 값을 계산해 제어 플래그에 설정한 후 다른 어딘가의 조건문에서 검사하는 형태로 쓰임
- 충분히 간소화할 수 있음에도 복잡하게 작성된 코드에서 흔히 나타나기 때문


</div>
</details>



<details>
<summary>11장  API 리팩터링</summary>
<div markdown="11">

- 모듈화 함수는 소프트웨어를 구성하는 빌딩 블록, API는 이 블록들을 끼워 맞추는 연결부
- 좋은 API는 데이터를 갱신하는 함수와 그저 조회만 하는 함수를 명확히 구분한다.

### 11.1 질의 함수와 변경 함수 분리하기

- 외부에서 관찰할 수 있는 겉보기 부수효과가 전혀 없이 값을 반환해주는 함수를 추구해야 한다.
  - 호출하는 어디로든 옮겨도 되며 테스트하기도 쉽다.

**명령 질의 분리(command query separation)**

- 질의 함수(읽기 함수)는 모두 부수효과가 없어야 한다는 규칙
- 상태를 변경하는 부분과 질의하는 부분을 분리하려 시도.

### 11.2 함수 매개변수화 하기

- 두 함수의 로직이 아주 비슷하고 단지 리터럴 값만 다르다면, 그 다른 값만 매개변수로 받아 처리하는 함수 하나로 합쳐 중복을 제거할 수 있다.
- 매개변수 값만 바꿔 여러 곳에서 쓸 수 있으니 함수의 유용성이 커진다.

### 11.3 플래그 인수 제거하기

- 플래그 인수란 호출되는 함수가 실행할 로직을 호출하는 쪽에서 선택하기 위해 전달해야 하는 인수
- 플개르 인수를 사용하면 호출할 수 있는 함수들이 무었이고 어떻게 호출해야 하는지 이해하기 어려워지기 때문
  - 플래그 인수가 있으면 함수들의 기능 차이가 잘 드러나지 않는다.
- 특정한 기능 하나만 수행하는 명시적인 함수를 제공하는 편이 훨씬 깔끔하다.
- 함수 하나에서 플래그 인수를 두 개 이상 사용하면 플래그 인수를 써야 하는 합당한 근거가 될 수 있지만 너무 많은 일을 처리하고 있다는 신호이기도 하다.

### 11.4 객체 통째로 넘기기

- 하나의 레코드에서 값 두어개를 가져와 인수로 넘기는 코드보다 레코드를 통째로 넘기면 변화에 대응하기 쉽다.
  - 더 다양한 데이터를 사용하도록 바뀌어도 목록은 수정할 필요가 없다.
  - 매개변수 목록이 짧아져서 일반적으로 함수 사용법을 이해하기 쉬워진다.
- 레코드에 담긴 데이터중 일부를 받는 함수가 여러개라면 중복 로직도 제거할 수 있다.
- 하지만 함수 자체가 레코드 자체에 의존하기를 원치 않을 때는 이 리팩터링을 수행하지 않는다.
  - 코드와 함수가 서로 다른 모듈에 속한 상황이면 더 그렇다.
- 객체로부터 값 몇개를 받은 후 그 값들로만 무언가를 하는 로직이 존재한다면 객체 안으로 집어넣어야 하는 악취로 볼 수 있다.
- 한 객체가 제공하는 기능 중 항상 똑같은 일부만을 사용하는 코드가 많다면, 그 기능만 따로 묶어서 클래스로 추출하라는 신호일 수 있다.

### 11.5 매개변수를 질의 함수로 바꾸기

- 매개변수 목록은 함수의 변동요인을 모아놓은 곳
  - 즉, 함수의 변화를 줄 수 있는 일차적인 수단
  - 이 목록에서는 중복은 피하는게 좋고 짧을수록 이해하기 좋다.
- 매개변수를 제거하면 값을 결정하는 책임 주체가 달라진다.
  - 매개변수가 있다면 결정 주체가 호출자가 되고
  - 매개변수가 없다면 결정 주체는 피호출함수가 된다.
- 매개변수를 제거하면 피호출 함수에 원치 않는 의존성이 생길때는 매개변수를 제거하지 말아야 할 경우이다.
- 대상 함수가 참조 투명 해야 한다.
  - 참조투명이란 함수에 똑같은 값을 건네 호출하면 항상 똑같이 동작한다는 뜻이다.
  - 참조투명하면 동작을 예측하고 테스트하기가 훨씬 쉬워진다.

### 11.6 질의 함수를 매개변수로 바꾸기

- 전역변수를 참조한다거나 제거하길 원하는 원소를 참조하는 경우 해당 참조를 매개변수로 바꿔 해결할 수 있다.
- 이런 상황은 코드의 의존 관계를 바꾸려 할 때 벌어진다
  - 함수가 더 이상 특정 원소에 의존하길 원치 않을 때 일어난다.
- 참조 투명하지 않은 원소에 접근하는 원소에 접근하는 모든 함수는 참조 투명성을 읽게 되는데 이 문제는 해당 원소를 매개변수로 바꾸면 해결된다.
- 질의 함수를 매개 변수로 바꾸면 어떤 값을 제공할지 호출자가 알아내야 한다.
  - 책임 소재를 어디에 배정하느냐의 문제로 구결된다.
  - 항상 정답이 있는 것이 아니기 때문에 균형점이 옮겨질 수 있다.

**참조 투명**

- 참조투명이란 함수에 똑같은 값을 건네 호출하면 항상 똑같이 동작한다는 뜻이다.
- 참조 투명의 장점은 대체로 아주 큼
- 모듈을 개발할 때 순수 함수들을 따로 구분하고, 프로그램의 입출력과 기타 가변 원소들을 다루는 로직으로 순수 함수들의 겉을 감싸는 패턴을 많이 활용

### 11.7 세터 제거하기

- 세터가 없을경우 수정하지 않겠다는 의도가 분명하고, 변경될 가능성이 봉쇄된다.
- 필드를 접근자 메서드를 통해서 다루려할때 필요하다.
- 세터를 제거해 객체가 생성된 후 값이 바뀌면 안된다는 뜻을 분명히 할 수 있다.
- 세터를 제고해 의도를 더 정확히 전달할 수 있다.

### 11.8 생성자를 팩터리 함수로 바꾸기

- 생성자에는 일반 함수에는 없는 이상한 제약이 따라붙기도 한다.
- 생성자의 이름도 고정된다
- 팩터리 함수에는 이런 제약이 없다
- 팩터리 함수를 구현하는 과정에서 생성자를 호출할 수는 있지만 다른 무언가로 대체할 수 도 있다.

### 11.9 함수를 명령으로 바꾸기

- 함수를 그 함수만을위한 객체안으로 캡슐화하면 더 유용해지는 상황의 객체를 가리켜 명령 이라 한다.
- 명령 객체 대부분은 메서드 하나로 구성되며 메서드를 요청해 실행하는 것이 객체의 목적이다.
- 명령으로 얻는 이점은 많지만 복잡성을 키우고 얻는 대가이다.
- 명령과 일급함수를 선택해야 한다면 95%는 일급 함수일 것.
- 명령보다 더 간단한 방식으로는 얻을 수 없는 기능이 필요할 때 사용한다.

### 11.10 명령을 함수로 바꾸기

- 명령은 복잡한 연산을 다룰 수 있는 강력한 메커니즘이다
- 명령은 그저 함수를 하나 호출해 정해진 일을 수행하는 용도로 주로 쓰인다.
- 로직이 크게 복잡하지 않다면 명령 객체는 장점보다 단점이 크니 평범한 함수로 바꿔주는게 낫다.

### 11.11 수정된 값 반환하기

- 데이터가 수정된다면 그 사실을 명확히 알려주어서, 어느 함수가 무슨 일을 하는지 쉽게 알 수 있게 하는 것은 매우 중요하다.
- 변수를 갱신하는 함수라면 수정된 값을 반환하여 호출자가 그 값을 변수에 담아두도록 하는것은 데이터가 수정됨을 알려주는 좋은 방법
  - 변수의 값을 단 한번만 정하면 될 때 특히 유용하다.

### 11.12 오류 코드를 예외로 바꾸기

- 예외를 사용하면 오류 코드를 일일이 검사하거나 오류를 식별해 콜스택 위로 던지는 일을 신경쓰지 않아도 된다.
- 예외에는 독자적인 흐름이 있어서 프로그램의 나머지에서는 오류 발생에 따른 복잡한 상황에 대처하는 코드를 작성하거나 읽을 일이 없게 해준다.

### 11.13 예외를 사전 확인으로 바꾸기

- 예외는 과용되면 안된다, 말 그래도 예외적으로 동작할 때만 쓰여야 한다.
- 문제가 될 수 있는 조건을 함수 호출 전에 검사할 수 있다면 호출하는곳에서 조건을 검사하도록 해야 한다.

</div>
</details>




<details>
<summary>12장 상속 다루기</summary>
<div markdown="12">

**상속은 아주 유용한 동시에 오용하기 쉽다.**

### 12.1 메서드 올리기

- 중복 제거는 중요하다.
- 무언가 중복되었다는 것은 한쪽의 변경이 다른 쪽에는 반영되지 않을 수 있다는 위험을 항상 수반

### 12.2 필드 올리기

- 서브 클래스들이 독립적으로 개발되었거나 뒤늦게 하나의 계층구조로 리팩터링 된 경우 필드가 중복되기 쉽다.

### 12.3 생성자 본문 올리기

- 생성자는 다루기 까다로워 생성자에서 하는 일과 순서에 제약을 두어야 한다.

### 12.4 메서드 내리기

- 특정 서브클래스에만 관련된 메서드는 슈퍼클래스에서 제거하고 해당 서브 클래스에 추가하는 편이 깔끔.

### 12.5 필드 내리기

- 서브 클래스 하나에서만 사용하는 필드는 해당 서브클래스로 옮긴다.

### 12.6 타입 코드를 서브클래스로 바꾸기

- 특정 특성에 따라 구분해야할 떄 매력적으로 조건에 따라 다르게 동작하도록 해주는 다형성을 제공한다.
- 동작이 달라져야 하는 함수가 여러 개 일때 특히 유용하다.
- 특정 타입에서만 의미가 있는 값을 사용하는 필드나 메서드가 있을때 서브클래스 방식이 관계를 더 명확히 드러내준다.

### 12.7 서브클래스 제거하기

- 서브클래스는 데이터 구조와 다른 변종을 만들거나 종류에 따라 동작이 달라지게 할 수 있는 유용한 메커니즘
- 하지만 시스템이 성장함에 따라 변종이 다른 모듈로 이동하거나 사라지면서 가치가 바래지기도 함.
- 더 이상 쓰이지 않는 서브클래스를 이해하느라 에너지가 낭비될 수 있다.
- 이런 상황에 서브 클래스를 슈퍼 클래스의 필드로 대체해 제거하는게 최선이다.

### 12.8 슈퍼클래스 추출하기

- 비슷한 일을 수행하는 두 클래스가 보이면 상속 메커니즘을 이용해서 비슷한 부분을 공통의 슈퍼클래스로 옮겨 담을 수 있다.
- 상속을 보통 프로그램이 성장하면서 깨우치며 슈퍼클래스로 끌어올리고 싶은 공통요소를 찾았을 때 수행하는 사례가 많다.
- 슈퍼클래스 추출하기의 대안으로 클래스 추출하기가 있다.
  - 어느방법을 사용하는지는 상속으로 중복을 해결할 것인지 위임으로 해결하느냐에 따라 달렸다.
  - 보통 슈퍼클래스 추출하기 방법이 더 간단한 경우가 많다.
  - 먼저 슈퍼클래스 추출하기를 먼저 시도해봐라 슈퍼클래스를 위임으로 바꾸기는 어렵지 않다.

### 12.9 계층 합치기

- 계층 구조도 진화하면서 어떤 클래스와 부모가 너무 비슷해져서 독립적으로 존재해야할 이유가 사라지는 경우 그 둘을 하나로 합쳐야 할 시점이다.

### 12.10 서브클래스 위임으로 바꾸기

- 속한 갈래에다라 동작이 달래지는 객체는 상속으로 표현하는 게 자연스럽다.
  - 공통 데이터와 동작은 모두 슈퍼클래스에두고 서브클래스는 자신에 맞게 기능을 추가하거나 오버라이드하면 된다.
- 하지만 상속은 단점이 명확하다, 상속은 한번만 사용할 수 있다.
- 상속은 클래스들의 관계를 아주 긴밀하게 결합한다.
  - 부모를 수정하면 자식들의 기능을 해치기가 쉽다.
- 위임은 두문제를 모두 해결해준다.
  - 다양한 클래스에 서로 다른 이유로 위임할 수 있다.
  - 위임은 객체 사이의 일반적인 관계이기 때문에 상호작용에 필요한 인터페이스를 명확히 정의 할수 있다.
  - 때문에 결합도가 훨씬 약하다.
- 서브클래싱 관련 문제가 생기면 흔히 서브클래스를 위임으로 바꾸고는 한다.
- 상속보다는 컴포지션을 사용하라
  - 컴포지션은 사실상 위임과 같은 말.
- 상속으로 접근한 다음, 문제가 생기기 싲가하면 위임으로 갈아타라.
- 서브클래스를 상태패터닝나 전략패턴으로 대체한다고 생각하면 도음이 될 것.
- 위임을 적용하면 분배 로직과 양방향 참조가 더해지는 등 복잡도가 높아질 수 있다.
  - 하지만 상속을 다른 목적으로 사용할 수 있게 되었고
  - 장점이 상속을 없애는 단점보다 클 수 있다.

### 12.11 슈퍼 클래스를 위임으로 바꾸기

- 상속은 기존 기능을 재활용하는강결갛고 손쉬운 수단이지만 상속이 혼란과 복잡도를 키우는 방식으로 이뤄지기도 한다.
- 클래스의 기능들이 서브클래스에는 어울리지 않는다면 그 기능들을 상속을 통해 이용하면 안된다.

**제대로된 상속이라면**

- 슈퍼클래스가 사용되는 모든 곳에서 서브 클래스의 인스턴스를 대신 사용하도 이상없이 동작해야 한다.
- 위임을 이용하면 기능 일부만 빌려올 뿐인, 서로 별개인 개념임이 명확해진다.

**서브클래스 방식 모델링이 합리적일 때도 위임으로 바꾸기도 한다.**

- 슈퍼/서브 클래스는 강하게 결합된 관계이기 때문에 슈퍼클래스를 수정하면 서브클래스가 망가지기 쉽기 때문

**상속을 먼저 적용하고 이상이 생기면 슈퍼클래스로 바꿔라**

- 상속은 상위 타입의 모든 메서드가 하위타입에도 적용되고, 하위 타입의 모든 인스턴스가 상위 타입의 인스턴스도 되는등 의미상 적합한 조건이라면 간단하고 효과적인 메커니즘
- 더는 최선의 방법이 아니게 되면 언제는 리팩터링을 이용해 슈퍼클래스를 위임으로 변경할 수 있다.

</div>
</details>