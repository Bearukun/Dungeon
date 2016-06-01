package model.itemType;

import interfaces.ItemInterface;

public class ArmorSet implements ItemInterface{
    
    private double healthMultiplier;
    private double armorMultiplier;

    public ArmorSet(double healthMultiplier, double armorMultiplier) {
        this.healthMultiplier = healthMultiplier;
        this.armorMultiplier = armorMultiplier;
    }
    
    

    public double getHealthMultiplier() {
        return healthMultiplier;
    }

    public void setHealthMultiplier(double healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
    }

    public double getArmorMultiplier() {
        return armorMultiplier;
    }

    public void setArmorMultiplier(double armorMultiplier) {
        this.armorMultiplier = armorMultiplier;
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
