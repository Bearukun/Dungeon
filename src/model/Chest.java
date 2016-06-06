package model;

import interfaces.ChestInterface;
import interfaces.ItemInterface;
import interfaces.LockTypeInterface;
import java.io.Serializable;
import java.util.ArrayList;

public class Chest implements ChestInterface, Serializable{
    
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

    public LockTypeInterface getLockTypeInterface() {
        return lockTypeInterface;
    }

}
