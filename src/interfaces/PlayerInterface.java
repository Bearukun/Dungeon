package interfaces;

import java.util.ArrayList;
import model.Item;

public interface PlayerInterface {
    
    public String getStats();
    
    public void calculateStats();
    
    public String getName();
    
    public int getHp();
    
    public int getDamage();
    
    public int getLevel();
    
    public int getArmor();
    
    public ArrayList<Item> getInventory();
    
    public ArrayList<Item> getEquipment();


}
