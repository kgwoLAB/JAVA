package type;
import action.*;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    // 행동 인터페이스 형식의 레퍼런스 변수 2개를 선언 

    public Duck() {}

    public abstract void display();


    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}