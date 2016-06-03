package model.itemType;

import interfaces.ItemInterface;
import java.io.Serializable;

public class Weapon implements ItemInterface, Serializable{
    
    private double damageModifier;

    public Weapon(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    public double getDamageModifier() {
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
    public double getHealthModifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEquippable() {
        return true;
    }

    @Override
    public boolean isArmor() {
        return false;
    }

    @Override
    public double getArmorRating() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
