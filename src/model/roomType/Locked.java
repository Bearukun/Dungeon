package model.roomType;

import interfaces.RoomTypeInterface;

public class Locked implements RoomTypeInterface{

    String unlockCode;
    boolean isLocked;

    public Locked(String unlockCode, boolean isLocked) {
        this.unlockCode = unlockCode;
        this.isLocked = isLocked;
    }
    
    

    
    @Override
    public boolean isLocked() {
        return isLocked;
    }

    @Override
    public void setUnlocks(String nameOfRoomToUnlock) {
        unlockCode = nameOfRoomToUnlock;
    }

    @Override
    public String getUnlocks() {
        return unlockCode;
    }

    @Override
    public void unlockRoom() {
        isLocked = false;
    }

 

            
            
    
   
}
