package model.itemType;

import interfaces.ItemInterface;
import java.io.Serializable;

public class Key implements ItemInterface, Serializable{
    
    private boolean isQuestItem;
    private String keyId;

    public Key(boolean isQuestItem, String keyId) {
        this.isQuestItem = isQuestItem;
        this.keyId = keyId;
    }

    public boolean isIsQuestItem() {
        return isQuestItem;
    }

    public void setIsQuestItem(boolean isQuestItem) {
        this.isQuestItem = isQuestItem;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public double getArmorRating() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isKey() {
        return true;
    }

    @Override
    public String getKeyId() {
        return keyId;
    }

    @Override
    public void setKeyId(String roomId) {
        keyId = roomId;
    }
    
    
    
}
