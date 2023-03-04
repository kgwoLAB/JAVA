## 싱글턴 패턴의 정의

- 클래스 인스턴스를 하나만 만들고, 그 인스턴스로의 전역 접근을 제공합니다.
- 싱글턴 패턴은 실제로 적용할 때는 클래스에서 하나뿐인 인스턴스를 관리하도록 만들면 됩니다. 
- 다른 어떤 클래스에도 자신의 인스턴스를 추가로 만들지 못하게 해야 합니다. 필요하다면 반드시 클래스 자신을 거치도록 해야합니다.
- 자원을 많이 잡아먹는 인스턴스가 있다면 해당 기법은 꽤나 유용합니다. 

## 클래스 다이어그램
- Singleton 
- < static uniqueInsatnce : 싱글턴의 하나뿐인 인스턴스가 저장됩니다. 
- < static getInstance() : 언제 어디서든 이 메소드를 호출 할 수 있습니다, 전역 변수에 접근하는것 만큼 쉬우면서 게으른 인스턴스를 생성할 수 있다는 장점이 있습니다. 


# 골치덩어리 스레드 문제 
- synchronized 키워드를 사용하면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다려야 합니다.
- 처음을 제외하면 동기화는 불필요한 오버헤드만 증가시킬 뿐입니다. 그러기에 해당 키워드는 그리 좋은방법은 아닙니다.

## getInstance()의 속도가 그리 중요하지 않는다면 그냥 둡니다.
-  [synchronized 키워드]메소드를 동기화 한다면 성능이 100배 정도 저하된다는 사실만 기억해 두면 됩니다.
- 해당 메서드가 병목작용을 한다면 다른 방법을 찾아야 합니다.

## 인스턴스가 필요할 때는 생성하지 말고 처음부터 만듭시다.
- singleton의 인스턴스를 생성하고 계속 사용하거나 인스턴스를 실행 중에 수시로 만들고 관리하기 성가시다면 처음부터 싱글턴 인스턴스를 만들면 좋습니다.
```
public class Singleton{
    // 정적 초기화 부분에서 싱글턴 인스턴스를 생성합니다. 이러면 스레드를 써도 별 문제가 없습니다.
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }

}
```

## 'DCL'을 써서 getinstance()에서 동기화되는 부분을 줄입니다.
- Double-Checked Locking을 사용하면 인스턴스가 생성되어 있는지 확인한 다음 생성되지 않았을 때만 동기화 할 수 있습니다.
- 이러면 처음에만 동기화하고 나중에는 동기화하지 않아도 됩니다. 
- 여기서 확인할 키워드는 volatile 입니다.
```
public class Singleton{
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance(){
        // 인스턴스가 있는지 확인하고 없으면 동기화된 블록으로 들어갑니다. 
        if (uniqueInstance == null){ 
            // 이러며은 처음에만 동기화가 진행됩니다.
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                    // 다시한번 확인하기
                }
            }
        }
        return uniqueInstance();
    }
}
```
- volatile 키워드를 사용하면 멀티스레딩을 쓰더라도 uniqueInstance 변수가 singleton 인스턴스로 초기화되는 과정이 올바르게 진행됩니다. 
- 싱근턴을 구현하면 getinstance() 메소드를 사용할 때 발생하는 속도를 극적으로 줄일 수 있습니다. 


# 싱글톤은 동기화 문제, 클래스 로딩 문제, 리플렉션, 직렬화와 역직렬화 문제 등 "ENUM"으로 싱글턴을 생성해 해결할 수 있습니다.
- 하단 코드를 보면은 getInstance() 메소드를 왜 사용했을까? 라는 생각이 들것이다.
- 이는 싱글턴의 작동 원리를 하나하나 거처간 것이기에 이제 enum으로 쓰면 됩니다. 
```
public enum Singleton {
    UNIQUE_INSTANCE;
}
public class SingletonClient{
    public static void main(String[] args){
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        // 여기서 싱글턴 사용
    }
}


```