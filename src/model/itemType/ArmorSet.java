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




    
}
