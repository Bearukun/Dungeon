package model.monsterType;

import interfaces.MonsterInterface;
import java.util.ArrayList;
import model.Item;

public class Boss implements MonsterInterface{
    
    
    private int hp, damage, level;
    private String taunt = TauntGenerator.generateTaunt("Boss");
    private ArrayList<Item> inventory = new ArrayList();

    public Boss(int hp, int damage, int level) {
        this.hp = hp;
        this.damage = damage;
        this.level = level;
    }
    
    
    

    @Override
    public int getHp() {
        
        return hp;
        
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
    

             
   
    
}
