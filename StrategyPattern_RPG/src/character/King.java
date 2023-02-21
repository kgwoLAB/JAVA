package character;

import weaponBehavior.*;

public class King extends Character {
    
    public King() {
        weaponBehavior = new AxeBehavior();
    }
    
    public void display(){
        System.out.println("I'M the King");
    }

}
