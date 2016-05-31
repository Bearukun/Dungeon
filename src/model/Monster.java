package model;

import java.util.ArrayList;
import interfaces.MonsterInterface;

/**
 * Monster class
 */
public class Monster {

    //Initializing and instanciating variables. 
    private String name, description;
    private int id;
    private ArrayList<Item> inventory = new ArrayList();
    private MonsterInterface monsterInterface;

    /**
     * Constructor for the monster class. 
     * @param name Name for the monster.
     * @param description Description for the monster.
     * @param id Monster ID. 
     * @param monsterType Used to decide what type of monster is spawned. 
     */
    public Monster(String name, String description, int id, MonsterInterface monsterType) {

        this.name = name;
        this.description = description;
        this.id = id;
        this.monsterInterface = monsterType;

    }

    //Getters and setters, nothing to see here - move along..!
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public MonsterInterface getMonsterInterface() {
        return monsterInterface;
    }

    public void setMonsterInterface(MonsterInterface monsterInterface) {
        this.monsterInterface = monsterInterface;
    }

}
