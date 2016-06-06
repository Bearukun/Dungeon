package model.monsterType;

import model.TextGenerator;
import interfaces.MonsterInterface;
import java.io.Serializable;
import java.util.ArrayList;
import model.Item;

public class Minion implements MonsterInterface , Serializable{
    
    private int hp, damage, level;
    private String taunt;
    private ArrayList<Item> inventory = new ArrayList();

    public Minion(int hp, int damage, int level, String taunt) {
        
        this.hp = hp;
        this.damage = damage;
        this.level = level;
        this.taunt = taunt;
    
    }

    @Override
    public int getDamage() {
        
        return damage;
        
    }

    @Override
    public int getLevel() {

        return level;
        
    }

    @Override
    public String getTaunt() {
        
        return taunt;
        
    }

    @Override
    public ArrayList<Item> getInventory() {
    
        return inventory;
        
    }

    @Override
    public int getHp() {
        
        return hp;
   
    }

    @Override
    public void setHp(int hp) {
        
        this.hp = hp;
    
    }

}
