public class App {
    public static void main(String[] args) throws Exception {
        HouseBlend hb = new HouseBlend();
        System.out.println(hb.getDescription());
        System.out.println(hb.cost());
        

        Beverage beverage2 = new Decaf();
        beverage2.setSize(beverage2.size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());
    }
}
