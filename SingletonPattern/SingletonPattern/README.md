## Getting Start Singleton

- 인스턴스를 하나만 만들어야 하는 클래스가 있습니다. (예: 자원의 비효율성, 일관성 문제 등)
- 전역변수 단점 : 전역 변수에 객체를 대입하면 애플리케이션이 시작될 떄 객체가 생성되는대 만약 해당 객체를 한번도 쓰지 않는다면 괜히 자원만 먹는 객체가 됩니다.
- 싱글턴 패턴은 특정 클래스에 객체 인스턴스가 하나만 만들어지도록 해주는 패턴입니다.
- 싱글턴 패턴은 전역 변수를 사용할 때와 마찬가지로 객체 인스턴스를 어디서든지 액서스 할수 있으며, 전역 변수를 쓸 때처럼 여러 단점을 감수할 필요가 없습니다.
- 싱글턴 패턴은 전역변수의 단점을 해결하여 필요할 때만 객체를 만들 수 있습니다. 

## 기본 배경

- 정적 클래스 변수와 메소드를 잘 처리할 수 있고 접근 변경자도 잘 다룰줄 안다면 별로 어렵지 않습니다. 
- 싱글턴 패턴은 겉으로 보면 간단할거 같지만 제대로 이해하기는 쉽지 않습니다. 

## 알아야 할점

- "어떻게 하면 한 클래스의 인스턴스를 2개 이상 만들지 않게 하지?" 라는 질문을 던져보면은 간단한 질문이 아니라는 것을 알 수 있습니다. 


## 기본 지식 : 고전 리틀 싱글턴 알아보기

- 1개의 객체를 만들려면 어떻게 하는게 좋을까요? : new MyObject();
- 다른 객체에서 MyObject을 만들려면 어떻게 하죠? 다시쓸수 있나요? : 네
- 클래스만 있으면 언제든지 인스턴스를 만드나요? : public으로 선언한다면 상관없습니다.
- public Myclass({ private Myclass(){}}) : 생성자가 private으로 선언되어 있으서 인스턴스를 만들 수 없는 클래스 형태입니다.
- public Myclass({ public static MyClass getInstance(){}}) : Myclass에 정적 메소드가 있습니다. 그 정적 메소드는 다음과같은 방식으로 호출할 수 있습니다. Myclass.getInstance();
- getinstance()는 정적 메소드 입니다. 크랠스 메소드라고 부르기도 하지만 정적 메소드를 지칭할 떄는 클래스 이름을 써야 합니다. 
- 두가지를 합치면 하단의 코드가 나오는대 이러면 MyClass의 인스턴스를 만들 수 있습니다.
```
public MyClass(){
    private MyClass() {}
    public static MyClass getInstance(){
        return new MyClass();
    }
}
```
- 객체를 만드는 또 다른 방법을 말해 주세요 : MyClass.getInstance();
- MyClass의 인스턴스가 하나만 만들어지도록 코드를 마무리해 볼까요? : Singleton_init_.java 코드를 확인해주세요.


## 고전 싱글턴 패턴 자세히 알아보기

- 연결 풀이나 스레드 풀과 같은 자원 풀을 관리할 때 유용합니다.
- public으로 지정된 생성자가 없기에 getinstance()라는 정적메소드를 통해 호출되어 일할 준비를 마치고 나타납니다.
- 종종 한 객체를 도와주다가 다른 객체에게 호출을 받고 불려가는 경우도 있습니다. 