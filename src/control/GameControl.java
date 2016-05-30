package control;

import model.Player;
import model.Room;

/**
 *
 * @author bearu
 */
public class GameControl {

      Room currentRoom;
    
    public GameControl() {
    createRooms();
    }

   
    
    private void createRooms() {

       
        
        Room room1 = new Room("You are standing in the Entrance ", 0);
        Room room2 = new Room("Tomb", 0);
        Room room3 = new Room("Sacrefice Pit", 0);
        Room room4 = new Room("S/M Dungeon ", 0);
        Room room5 = new Room("McDonalds", 0);

         //Room 1
        room1.east = room2;
        room1.north = room3;
        room1.west = room4;
        room1.south = room5;
        
        room2.west = room1;
       

        
        currentRoom = room1;
    }

    public void createPlayer(String name) {
        Player player = new Player();

        player.setName(name);

        System.out.println(player.getName());

    }
    
    public void move(String direction){
        
        
        
        switch (direction) {
            case "north":
                
                currentRoom = currentRoom.north;
                
                
                break;
                
            case "west":
                
                currentRoom = currentRoom.west;
                break;
                
            case "east":
                
                currentRoom = currentRoom.east;
                break;
                
            case "south":
                
                currentRoom = currentRoom.south;
                break;
                
                
                
            default:
                System.out.println("Error in movement");
                throw new AssertionError();
        }
            
        

        
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

  
    
    

}
