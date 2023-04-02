public class WildTurkey implements Turkey {
    // 가금류 class을 만든 이유?
    // Duck 객체가 모자라서 Turkey 객체를 대신 사용해야 하는 상황이라고 가정해야 할때
    // 인터페이스가 서로 다르기 떄문에 Turkey 객체를 바로 사용할수 없으니 어댑터를 만들어야 하겠죠?

    public void gobble(){
        System.out.println("골골");
    }    

    public void fly(){
        System.out.println("짧은 거리를 날고 있어요!");
    }
}
