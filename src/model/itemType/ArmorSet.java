package model.itemType;

import interfaces.ItemInterface;

public class ArmorSet implements ItemInterface{
    
    private int healthMultiplier;
    private int armorRating;

    public ArmorSet(int healthMultiplier, int armorMultiplier) {
        this.healthMultiplier = healthMultiplier;
        this.armorRating = armorMultiplier;
    }
    
    

    public double getHealthMultiplier() {
        return healthMultiplier;
    }

    public void setHealthMultiplier(int healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
    }

    public double getArmorMultiplier() {
        return armorRating;
    }

    public void setArmorMultiplier(int armorMultiplier) {
        this.armorRating = armorMultiplier;
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
        return false;
    }

    @Override
    public int getHealthModifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEquippable() {
        return true;
    }

    @Override
    public boolean isArmor() {
        return true;
    }

    @Override
    public int getArmorRating() {
        return armorRating;
    }




    
}
