package model.roomType;

import interfaces.RoomTypeInterface;
import java.io.Serializable;

public class Unlocked implements RoomTypeInterface, Serializable{

    public Unlocked() {
    }
    
    

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public void setUnlocks(String nameOfRoomToUnlock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUnlocks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unlockRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    
}