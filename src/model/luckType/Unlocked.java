package model.luckType;

import java.io.Serializable;
import interfaces.LockTypeInterface;

public class Unlocked implements LockTypeInterface, Serializable{

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
