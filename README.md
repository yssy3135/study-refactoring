


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