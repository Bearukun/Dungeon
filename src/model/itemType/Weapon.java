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

    @Override
    public boolean isAWeapon() {
        return true;
    }

    @Override
    public boolean isConsumable() {
        return false;
    }

    @Override
    public int getHealthModifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
