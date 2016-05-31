package model.itemType;

import interfaces.ItemInterface;

public class Weapon implements ItemInterface{
    
    private int damageModifier;

    public Weapon(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }
    
    
    
}
