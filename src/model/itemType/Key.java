package model.itemType;

import interfaces.ItemInterface;

public class Key implements ItemInterface{
    
    private boolean isQuestItem;
    private int keyId;

    public Key(boolean isQuestItem, int keyId) {
        this.isQuestItem = isQuestItem;
        this.keyId = keyId;
    }

    public boolean isIsQuestItem() {
        return isQuestItem;
    }

    public void setIsQuestItem(boolean isQuestItem) {
        this.isQuestItem = isQuestItem;
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }
    
    
    
}
