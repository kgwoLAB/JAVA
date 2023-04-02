public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gobble();
    }

    public void fly(){
        // 칠면조는 오리처럼 멀리 날지 못하니 5번 호출해 좀더 멀리 움직이도록 설정함.
        for(int i=0; i<5; i++){
            turkey.fly();
        }
    }
}
