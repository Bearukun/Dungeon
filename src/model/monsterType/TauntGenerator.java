package model.monsterType;

public class TauntGenerator {

    public static String generateTaunt(String type){
        
        if(type.equalsIgnoreCase("Boss")){
            
            return bossTaunt();
            
        }else if(type.equalsIgnoreCase("Minion")){
            
            return minionTaunt();
            
        }
        
        return "#ERROR# No monstertype associated!";
        
    }
    
    public static String bossTaunt(){
        
        
        
        return "big baws";
    }
    
    public static String minionTaunt(){
        
        return "minionTaunt";
        
    }
    
}
