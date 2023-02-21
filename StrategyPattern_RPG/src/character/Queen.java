package character;
import weaponBehavior.*;


public class Queen extends Character {
    public Queen() {
        weaponBehavior = new SwordBehavior();
    }
    
    public void display(){
        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQUeen");
    }
}
