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
        
        if(isMaximumHealing){
            
            return 1337;
            
        }else{
            
            return healthModifier;
        
        }
        
        
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

    @Override
    public boolean isConsumable() {
        return true;
    }

    @Override
    public boolean isEquippable() {
        return false;
    }

    @Override
    public boolean isArmor() {
        return false;
    }

    @Override
    public int getArmorRating() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
