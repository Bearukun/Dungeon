package interfaces;

public interface ItemInterface {
    
    public boolean isAWeapon();
    
    public boolean isConsumable();
    
    public double getDamageModifier();
    
    public double getHealthModifier();
    
    public boolean isEquippable();
    
    public boolean isArmor();
    
    public boolean isKey();
    
    public String getKeyId();
    
    public void setKeyId(String roomName);
    
    public double getArmorRating();

    
}
