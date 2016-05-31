/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.PlayerInterface;
import java.util.ArrayList;
import model.itemType.Weapon;

public class Player implements PlayerInterface {

    private String name;
    private int hp, damage, level, armor;
    private ArrayList<Item> inventory = new ArrayList();
    private ArrayList<Item> equipment = new ArrayList();

    public Player(String name) {
        this.name = name;
    
        hp = 10;
        level = 1;
        damage = 6;
        
        equipment.add(new Item("Short Sword", "", "This is a short sword", 1, new Weapon(6)));
        
    }
    
    
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    @Override
    public ArrayList<Item> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<Item> equipment) {
        this.equipment = equipment;
    }

 

}
