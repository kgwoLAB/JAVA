import character.*;
import character.Character;
import weaponBehavior.*;


public class App {
    public static void main(String[] args) throws Exception {
        Character Kk = new King();
        Kk.display();
        Kk.performWeapon();
        
        Character Qq = new Queen();
        Qq.setWeapon(new KnifeBehavior());
        Qq.display();
        Qq.performWeapon();
    }
}
