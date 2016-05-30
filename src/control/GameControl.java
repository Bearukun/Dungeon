package control;

import model.Player;
import model.Room;

/**
 *
 * @author bearu
 */
public class GameControl {

    public GameControl(String name) {
        createPlayer(name);
    }

    
    
    private void createRooms() {

        Room room1 = new Room("You are standing in the Entrance ", 0);
        Room room2 = new Room("Tomb", 0);
        Room room3 = new Room("Sacrefice Pit", 0);
        Room room4 = new Room("S/M Dungeon ", 0);
        Room room5 = new Room("McDonalds", 0);

        room1.east = room2;
        room1.north = room3;
        room1.west = room4;
        room1.south = room5;
        //Room 1

    }

    private void createPlayer(String name) {
        Player player = new Player();

        player.setName(name);

        System.out.println(player.getName());

    }

}
