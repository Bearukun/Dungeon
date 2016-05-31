package model.itemType;

import interfaces.ItemInterface;

public class Consumable implements ItemInterface{
    
    private double healthModifier;
    private boolean isConsumable;

    public Consumable(double healthModifier, boolean isConsumable) {
        this.healthModifier = healthModifier;
        this.isConsumable = isConsumable;
    }

    public double getHealthModifier() {
        return healthModifier;
    }

    public void setHealthModifier(double healthModifier) {
        this.healthModifier = healthModifier;
    }

    public boolean isIsConsumable() {
        return isConsumable;
    }

    public void setIsConsumable(boolean isConsumable) {
        this.isConsumable = isConsumable;
    }
    
    
    
}
