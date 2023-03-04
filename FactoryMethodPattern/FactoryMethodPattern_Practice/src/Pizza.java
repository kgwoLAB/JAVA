import java.util.*;

import Ingredient.Cheese;
import Ingredient.Clams;
import Ingredient.Dough;
import Ingredient.Pepperoni;
import Ingredient.Sauce;
import Ingredient.Veggies;

public abstract class Pizza {

    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;


    // prepare 메소드를 추상메소드로 만듬, 해당 부분에서 피자를 만드는데 필요한 재ㅑ료들을 가져옵니다. 
    abstract void prepare();


    List<String> toppings = new ArrayList<String>();

    void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }
    
    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    void box(){
        System.out.println("상자에 피자 담기");
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    public String toString(){
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
    }
}
