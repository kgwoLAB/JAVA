
public class App {
    public static void main(String[] args) throws Exception {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagosStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한"+pizza.getName()+"\n");

        pizza = chicagosStore.orderPizza("cheese");
        System.out.println("조엘이 주문한"+pizza.getName() + "\n");
    }
}
