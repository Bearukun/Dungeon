/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ceo
 */
public class Item {
    
    private String name, roomText, inspectText;
    private int value;
    private boolean isKeyItem, isEquiptAble, isConsumable;

    public Item(String name, String roomText, String inspectText, int value, boolean isKeyItem, boolean isEquiptAble, boolean isConsumable) {
        this.name = name;
        this.roomText = roomText;
        this.inspectText = inspectText;
        this.value = value;
        this.isKeyItem = isKeyItem;
        this.isEquiptAble = isEquiptAble;
        this.isConsumable = isConsumable;
    }

    

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomText() {
        return roomText;
    }

    public void setRoomText(String roomText) {
        this.roomText = roomText;
    }

    public String getInspectText() {
        return inspectText;
    }

    public void setInspectText(String inspectText) {
        this.inspectText = inspectText;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isIsKeyItem() {
        return isKeyItem;
    }

    public void setIsKeyItem(boolean isKeyItem) {
        this.isKeyItem = isKeyItem;
    }

    public boolean isIsEquiptAble() {
        return isEquiptAble;
    }

    public void setIsEquiptAble(boolean isEquiptAble) {
        this.isEquiptAble = isEquiptAble;
    }

    public boolean isIsConsumable() {
        return isConsumable;
    }

    public void setIsConsumable(boolean isConsumable) {
        this.isConsumable = isConsumable;
    }
    
    
    
    
    
    
}


