import java.util.Scanner;
import action.*;
import type.*;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner stdIn = new Scanner(System.in);

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly(); 

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
