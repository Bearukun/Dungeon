/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ceo
 */
public class Room {
    
    private String description;
    private ArrayList<Item> items = new ArrayList();
    private int spawnMonsterID;
    
//    public Room north;
//    public Room south;
//    public Room west;
//    public Room east;
    
    public Room north, south, west, east;

    public Room(String description, int spawnMonsterID) {
        this.description = description;
        this.spawnMonsterID = spawnMonsterID;
        this.north = null;
        this.south = null;
        this.west = null;
        this.east = null;
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

    public int getSpawnMonsterID() {
        return spawnMonsterID;
    }

    public void setSpawnMonsterID(int spawnMonsterID) {
        this.spawnMonsterID = spawnMonsterID;
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
    
    
    
    
    
    
    
    
}
