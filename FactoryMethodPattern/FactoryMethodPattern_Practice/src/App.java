public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PizzaStore storeA = new ChicagoPizzaStore();

        Pizza pizza = storeA.orderPizza("cheese");
        System.out.println(pizza);
        

        



    }
}
