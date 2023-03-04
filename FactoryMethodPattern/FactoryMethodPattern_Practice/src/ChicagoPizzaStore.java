import Ingredient.ChicagoPizzaIngredientFactory;
import Ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        
        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("시카고 스타일 치즈 피자");
        }
        else if (item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("시카고 스타일 패패로니 피자");
        }
        return pizza;
    }


}
