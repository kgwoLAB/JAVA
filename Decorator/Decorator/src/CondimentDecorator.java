
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    // 각 데코레이터가 감쌀 음료를 나타내는 객체를 여기에 저장합니다. 
    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
    
}