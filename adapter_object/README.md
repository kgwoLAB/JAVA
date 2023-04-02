# Enumeration (구형)
- 컬랙션의 각 항목이 어떻게 관리되는지 신경 쓸 필요 없이 컬렉션의 모든 항목에 접근할 수 있음.
```
Enumeration
hasMoreElements()
nextElement()
```

# Iterator (신형)
- 일련의 항목 접근 및 제거할 수 있음
```
hasNext()
next()
remove()
```

# Enumeration을 Iterator에 적응시키기
- 타깃 클래스 -> Iterator
- 구현 : 1.타깃 인터페이스 구현 2.어댑티 객체로 구성된 어댑터 구현 
## 생각해볼것. remove()는 어떻게 처리해야 하는가?
- 가장 좋은 방법은 런타임 예외를 던지는 것. 
- Iterator 인터페이스는 디자인한 사람들은 이를 예견하고 OperationException을 지원합니다.
## 메소드가 일대일로 대응되지 않은 상황은 어뎁터를 완벽하게 적용할 수 없음.

## EnumerationIterator 어댑터 코드
```
// Enumeration을 Iterator에 적응시키고 있기에 어댑터는 Iterator 언터페이스를 구현해야 합니다. 
public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration){
        this.enumeration = enumeration;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
```


# 퍼사드, 복잡한 시스템을 훨씬 편리하게 사용

# 최소 지식 원칙 : 진짜 절친에게만 이야기 해야 한다.
# 상호작용을 하는 클래스의 개수와 상호작용 방식에 주의를 기울어야 합니다. 