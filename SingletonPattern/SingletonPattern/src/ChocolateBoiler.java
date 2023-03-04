public class ChocolateBoiler {
    
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler(){
        empty = true;
        boiled =false;
    }

    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }


}
