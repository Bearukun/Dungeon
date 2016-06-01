package model.itemType;

import interfaces.ItemInterface;

public class Consumable implements ItemInterface{
    
    private int healthModifier;
    private boolean isConsumable, isMaximumHealing;

    public Consumable(int healthModifier, boolean isConsumable, boolean isMaximumHealing) {
        this.healthModifier = healthModifier;
        this.isConsumable = isConsumable;
        this.isMaximumHealing = isMaximumHealing;
    }

    public int getHealthModifier() {
        return healthModifier;
    }

    public void setHealthModifier(int healthModifier) {
        this.healthModifier = healthModifier;
    }

    public boolean isIsConsumable() {
        return isConsumable;
    }

    public void setIsConsumable(boolean isConsumable) {
        this.isConsumable = isConsumable;
    }

    public boolean isIsMaximumHealing() {
        return isMaximumHealing;
    }

    public void setIsMaximumHealing(boolean isMaximumHealing) {
        this.isMaximumHealing = isMaximumHealing;
    }

    @Override
    public boolean isAWeapon() {
        return false;
    }

    @Override
    public int getDamageModifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
