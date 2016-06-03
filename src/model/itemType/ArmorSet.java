package model.itemType;

import interfaces.ItemInterface;
import java.io.Serializable;

public class ArmorSet implements ItemInterface, Serializable{
    
    private double healthMultiplier;
    private double armorRating;

    public ArmorSet(double healthMultiplier, double armorMultiplier) {
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
    public double getDamageModifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isConsumable() {
        return false;
    }

    @Override
    public double getHealthModifier() {
        return healthMultiplier;
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
    public double getArmorRating() {
        return armorRating;
    }

    @Override
    public boolean isKey() {
        return false;
    }

    @Override
    public String getKeyId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKeyId(String roomName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    
}
