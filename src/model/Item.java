package model;

import interfaces.ItemInterface;

public class Item {
    
    private String name, roomText, inspectText;
    private int value;
    private ItemInterface itemInterface;

    public Item(String name, String roomText, String inspectText, int value, ItemInterface itemType) {
        this.name = name;
        this.roomText = roomText;
        this.inspectText = inspectText;
        this.value = value;
        this.itemInterface = itemType;
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

    public ItemInterface getItemInterface() {
        return itemInterface;
    }

    public void setItemInterface(ItemInterface itemInterface) {
        this.itemInterface = itemInterface;
    }
   

    
    
}