package model;

import interfaces.PlayerInterface;
import java.util.ArrayList;
import model.itemType.Consumable;
import model.itemType.Weapon;

public class Player implements PlayerInterface {

    private String name;
    private int hp, tempHp, startingDamage, damage, level, armor, startingArmor;
    private ArrayList<Item> inventory = new ArrayList();
    private ArrayList<Item> equipment = new ArrayList();

    public Player(String name) {
        this.name = name;

        hp = 30;
        tempHp = hp;
        level = 1;
        startingDamage = 6;
        startingArmor = 0;
        damage = startingDamage;
        armor = startingArmor;

        equipment.add(new Item("Short Sword", "", "This is a short sword", 1, new Weapon(6)));
        inventory.add(new Item("Healing potion", "an healing potion", "A healing potion that will give you full health", 0, new Consumable(1, true, true)));

        calculateStats();

    }

    @Override
    public String getStats() {

        return "You have " + hp + "HP, your level is " + level + ", you give " + damage + "HP in damage and your armorrating is " + armor + ".";

    }

    @Override
    public void calculateStats() {

        int weaponDamage = 0;

        //Calculate damage
        for (Item item : equipment) {

            if (item.getItemInterface().isAWeapon()) {

                weaponDamage += item.getItemInterface().getDamageModifier();

            }

        }

        damage = startingDamage + weaponDamage;

    }

    @Override
    public void levelUp() {

        level++;
        hp = tempHp + 10;
        tempHp = hp;

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
    public String getInventory() {

        String returnString = "You have the following items in your inventory:\n";

        for (Item item : inventory) {

            returnString += item.getName() + ": " + item.getInspectText() + " - worth " + item.getValue() + " gold coins.\n";

        }

        if (inventory.isEmpty()) {

            return "You have nothing in your inventory.";

        } else {

            return returnString;

        }

    }

    @Override
    public ArrayList<Item> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<Item> equipment) {
        this.equipment = equipment;
    }

    @Override
    public String useItem(String itemName) {

        String returnString = "";
        
        for (int i = 0; i < inventory.size(); i++) {
            
            if(inventory.get(i).getName().equalsIgnoreCase(itemName)){
                
                heal(inventory.get(i).getItemInterface().getHealthModifier());
                
                returnString = inventory.get(i).getName() + " has been used, you now have " + hp + ".";
                
                inventory.remove(i);
                
                break;
                
            }
            
            
        }


        if (returnString.equals("")) {

            return "No such item found";

        } else {

            return returnString;

        }

    }

    @Override
    public void heal(int amount) {

        //If it's a full health pot
        if (amount == 1337) {

            hp = tempHp;

        } else {

            hp += amount;

        }

    }

}
