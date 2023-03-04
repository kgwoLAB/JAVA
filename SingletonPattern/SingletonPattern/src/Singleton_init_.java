public class Singleton_init_ {
    // 싱글톤 클래스의 하나뿐인 인스턴스를 저장하는 정적변수 입니다.
    private static Singleton_init_ uniqueInstance;

    // 생성자를 private으로 선언했기에 싱글톤에서만 클래스의 인스턴스를 만들 수 있습니다.
    private Singleton_init_() {}


    // 클래스의 인스턴스를 만들어서 리턴합니다.
    
    // 코드 자세히 들여다 보기
    // uniqueInstance에 하나뿐인 인스턴스가 저장됩니다. 정적변수임.
    // 인스턴스란? 클래스를 통해서 구현해야할 대상(객체)이 실제로 구현된 구체적인 실체를 말한다
    // null 이라면 아직 인스턴스가 생성되지 않았다는 사실을 알 수 있습니다.
    public static Singleton_init_ getInstance(){
        if (uniqueInstance == null){
            //인스턴스가 만들어 지지 않았다면 private으로 선언된 생성자를 사용해 싱글턴 객체를 만들고 uniqueinstance에 그 객체를 대입합니다. 
            // 이러면 인스턴스가 필요한 상황이 닥치기 전까지 아예 인스턴스를 생성하지 않게 됩니다.
            // 해당 방법을 게으른 인스턴스 생성이라고 부릅니다. 
            uniqueInstance = new Singleton_init_(); 
        }
        return uniqueInstance; // uniqueInstance가 null이 아니라면 이미 객체가 생성된것이기에 return 선언문으로 넘어갑니다.
        // 
    }

    // 기타 메소드
    // 특이하긴 하지만 싱글톤도 보통 클래스입니다. 여기에도 다른 인스턴스 변수나 메소드가 있을 수 있습니다. 

}
