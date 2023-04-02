public class App {
    public static void main(String[] args) throws Exception {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("오리가 말하길");
        testDuck(duck);

        System.out.println("칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);

        System.out.println("오리 어댑터가 말하길");
        duckAdapter.gobble();
        duckAdapter.fly();
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
