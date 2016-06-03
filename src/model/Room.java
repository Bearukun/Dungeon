package model;

import interfaces.ItemInterface;
import interfaces.MonsterInterface;
import java.io.Serializable;
import java.util.ArrayList;
import interfaces.LockTypeInterface;

/**
 * Room class
 */
public class Room implements Serializable {

    //Initializing and instanciating variables. 
    private String roomName, description;
    private ArrayList<Item> items = new ArrayList();
    private Monster monster;
    private Chest chest;
    private LockTypeInterface lockTypeInterface;

    public Room north, south, west, east;

    /**
     * Constructor for the Room class.
     *
     * @param roomname Name for the room.
     * @param description Description for the room.
     */
    public Room(String roomname, String description, LockTypeInterface roomTypeInterface) {

        this.roomName = roomname;
        this.description = description;
        this.north = null;
        this.south = null;
        this.west = null;
        this.east = null;
        this.lockTypeInterface = roomTypeInterface;

    }

    public void addRoomItem(String name, String roomText, String inspectText, int value, ItemInterface itemType) {

        items.add(new Item(name, roomText, inspectText, value, itemType));

    }

    public void addChest(String locationDescription, boolean isEndGameChest, LockTypeInterface lockTypeInterface) {

        chest = new Chest(locationDescription, isEndGameChest, lockTypeInterface);

    }

    public void addMonster(String name, String description, int id, MonsterInterface monsterType) {

        monster = new Monster(name, description, id, monsterType);

    }

    public void addItemToMonster(String name, String roomText, String inspectText, int value, ItemInterface itemType) {

        monster.addItem(name, roomText, inspectText, value, itemType);
    }

    /**
     * Method used to look up room items.
     *
     * @return Returns a string with available items.
     */
    public String itemLookup(String itemLookupText) {

        if (items == null) {

            return "";

        }

        String returnString = "";

        if (!items.isEmpty()) {
            returnString = itemLookupText;

            if (items.size() == 1) {

                returnString += "" + items.get(0).getRoomText() + ".\n";

            } else {

                for (int i = 0; i < items.size(); i++) {

                    returnString += "" + items.get(i).getRoomText();

                    if (i != items.size() - 1) {

                        returnString += " and ";

                    } else if (i == items.size() - 1) {

                        returnString += ".\n";

                    }

                }

            }

        }

        return returnString;

    }

    /**
     * Method used to look up chest.
     *
     * @return Returns a string with available items.
     */
    public String chestLookup(String itemLookupText) {

        if (chest == null) {

            return "";

        }

        String returnString = itemLookupText;

        returnString += chest.getLocationDescription() + ".\n";

        return returnString;

    }

    public void dropMonsterItems() {

        items.addAll(monster.getInventory());
        monster.setInventory(null);
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

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public LockTypeInterface getLockTypeInterface() {
        return lockTypeInterface;
    }

    public void setLockTypeInterface(LockTypeInterface lockTypeInterface) {
        this.lockTypeInterface = lockTypeInterface;
    }

}
