package character;

import javax.swing.event.AncestorEvent;

import weaponBehavior.*;

public abstract class Character {
    
    WeaponBehavior weaponBehavior;

    public Character() {}

    public abstract void display();

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }
    public void setWeapon(WeaponBehavior wb) {
        weaponBehavior = wb;
    }


    public void talk(){
        System.out.println("WTF");
    }


}
