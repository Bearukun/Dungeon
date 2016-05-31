package model;

import interfaces.ItemInterface;
import interfaces.MonsterInterface;
import java.util.ArrayList;

/**
 * Room class
 */
public class Room {

    //Initializing and instanciating variables. 
    private String roomName, description;
    private ArrayList<Item> items = new ArrayList();
    private TextGenerator textGen = new TextGenerator();
    private Monster monster;

    public Room north, south, west, east;

    /**
     * Constructor for the Room class.
     *
     * @param roomname Name for the room.
     * @param description Description for the room.
     */
    public Room(String roomname, String description) {

        this.roomName = roomname;
        this.description = description;
        this.north = null;
        this.south = null;
        this.west = null;
        this.east = null;

    }

    public void addItem(String name, String roomText, String inspectText, int value, ItemInterface itemType) {

        items.add(new Item(name, roomText, inspectText, value, itemType));

    }

    public void addMonster(String name, String description, int id, MonsterInterface monsterType) {

        monster = new Monster(name, description, id, monsterType);

    }

    /**
     * Method used to look up room items.
     * @return Returns a string with available items. 
     */
    public String itemLookup() {

        String returnString = "";

        if (!items.isEmpty()) {
            returnString = textGen.generateItemLookupText();

            if (items.size() == 1) {

                returnString += "" + items.get(0).getRoomText() + ".\n";

            } else {

                for (int i = 0; i < items.size(); i++) {
                    
                    returnString += "" + items.get(i).getRoomText();
                    
                    if(i != items.size()-1){
                        
                        returnString += " and ";
                        
                    }else if(i == items.size()-1){
                        
                        returnString += ".\n";
                        
                    }
                    
                }

            }

        }

        return returnString;

    }

    @Override
    public String toString() {
        return description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Item> getItems() {
        return items;

    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public TextGenerator getTextGen() {
        return textGen;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

}
