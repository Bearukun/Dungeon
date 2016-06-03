package model;

import interfaces.ChestInterface;
import interfaces.ItemInterface;
import interfaces.LockTypeInterface;
import java.util.ArrayList;

public class Chest implements ChestInterface{
    
    private String locationDescription;
    private boolean isEndGameChest;
    private ArrayList<Item> inventory = new ArrayList();
    private LockTypeInterface lockTypeInterface;

    public Chest(String description, boolean isEndGameChest, LockTypeInterface lockTypeInterface) {
        this.locationDescription = description;
        this.isEndGameChest = isEndGameChest;
        this.lockTypeInterface = lockTypeInterface;
    }

    public void addItem(String name, String roomText, String inspectText, int value, ItemInterface itemType){
        inventory.add(new Item(name, roomText, inspectText, value, itemType));
    }

    @Override
    public boolean isEndGameChest() {
        
        return isEndGameChest;
        
    }

    
    @Override
    public ArrayList<Item> getInventory() {
        
        return inventory;
        
    }



    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public boolean isIsEndGameChest() {
        return isEndGameChest;
    }

    public void setIsEndGameChest(boolean isEndGameChest) {
        this.isEndGameChest = isEndGameChest;
    }

    public LockTypeInterface getLockTypeInterface() {
        return lockTypeInterface;
    }

    public void setLockTypeInterface(LockTypeInterface lockTypeInterface) {
        this.lockTypeInterface = lockTypeInterface;
    }
    
    



    
    
}
