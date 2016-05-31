package model;

import java.util.ArrayList;
import interfaces.MonsterInterface;

/**
 * Monster class
 */
public class Monster {
   
    private String name, description;    
    private int id;
    private ArrayList<Item> inventory = new ArrayList();

    public Monster(String name, String description, int id, MonsterInterface monsterType) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

   
    
    
    
    
    
    
    
}


