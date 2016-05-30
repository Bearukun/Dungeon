package control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Player;
import model.Room;

/**
 * GameControl class
 */
public class GameControl {

    //Initializing and instanciating variables. 
    ArrayList<String> highScore = new ArrayList();

    Room currentRoom;
    Room prevRoom;

    /**
     * Constructor
     */
    public GameControl() {
        createRooms();
    }

    
    /**
     * Method used to create the rooms. 
     */
    private void createRooms() {

        Room wall = new Room("Wall", "You've hit a wall and are still in the same room!.... Dumbass!", 0);

        Room room1 = new Room("Entrance", "You are standing in the Entrance ", 0);
        Room room2 = new Room("Tomb", "You are in the tomb", 0);
        Room room3 = new Room("Pit", "Sacrefice Pit", 0);
        Room room4 = new Room("Dungeon", "S/M Dungeon ", 0);
        Room room5 = new Room("Fast Food joint", "McDonalds", 0);
        Room room6 = new Room("Fast Food joint", "Burger King", 0);
        Room room7 = new Room("Ano Lando", "Kingdom from Dark Souls 1 & 2", 0);
        Room room8 = new Room("Azeroth", "Land of Warcraft", 0);
        Room room9 = new Room("Apple", "The space ship in Cuppertino", 0);
        Room room10 = new Room("Kitchen", "There is food here!", 0);
        Room room11 = new Room("Pet Shop", "There is no dead parrots here!", 0);
        Room room12 = new Room("Microsoft", "The other tech company in Seattle", 0);
        Room room13 = new Room("Sanctuary", "Land of Diablo", 0);
        Room room14 = new Room("Capulo Sector", "StarCraft univers", 0);
        Room room15 = new Room("Mother Base", "Home of the Diamond Dogs", 0);
        Room room16 = new Room("Boston", "Home of Crane, Pool & Smitch", 0);
        Room room17 = new Room("Mushroom Kingdom", "THe land of Super Mario", 0);
        Room room18 = new Room("Yharnam", "Land of the Pale Blood Moon", 0);
        Room room19 = new Room("Middle-Earth", "Land of JRR Tolkien", 0);
        Room room20 = new Room("Exploding Kitten Room", "A room full of exploding kittens", 0);

        //Room 1
        room1.east = room2;
        room1.north = room3;
        room1.west = room4;
        room1.south = room5;

        //Room 2
        room2.west = room1;
        room2.east = room6;
        room2.south = room2;
        room2.north = room2;

        //Room 3
        room3.east = room3;
        room3.west = room3;
        room3.south = room1;
        room3.north = room7;

        //Room4
        room4.east = room1;
        room4.west = room16;
        room4.south = room4;
        room4.north = room4;

        //Room5
        room5.east = room5;
        room5.west = room5;
        room5.south = room14;
        room5.north = room1;

        //Room6
        room6.east = room6;
        room6.west = room2;
        room6.south = room11;
        room6.north = room10;

        //Room7
        room7.east = room8;
        room7.west = room7;
        room7.south = room3;
        room7.north = room7;

        //Room8
        room8.east = room7;
        room8.west = room9;
        room8.south = room8;
        room8.north = room8;

        //Room9
        room9.east = room9;
        room9.west = room8;
        room9.south = room10;
        room9.north = room9;

        //Room10
        room10.east = room10;
        room10.west = room10;
        room10.south = room6;
        room10.north = room9;

        //Room11
        room11.east = room11;
        room11.west = room11;
        room11.south = room12;
        room11.north = room6;

        //Room12
        room12.east = room12;
        room12.west = room13;
        room12.south = room12;
        room12.north = room11;

        //Room13
        room13.east = room12;
        room13.west = room14;
        room13.south = room15;
        room13.north = room13;

        //Room14
        room14.east = room13;
        room14.west = room14;
        room14.south = room14;
        room14.north = room5;

        //Room15
        room15.east = room15;
        room15.west = room15;
        room15.south = room15;
        room15.north = room13;

        //Room16
        room16.east = room4;
        room16.west = room17;
        room16.south = room16;
        room16.north = room16;

        //Room17
        room17.east = room16;
        room17.west = room19;
        room17.south = room20;
        room17.north = room18;

        //Room18
        room18.east = room18;
        room18.west = room18;
        room18.south = room17;
        room18.north = room18;

        //Room19
        room19.east = room17;
        room19.west = room19;
        room19.south = room19;
        room19.north = room19;

        //Room20
        room20.east = room20;
        room20.west = room20;
        room20.south = room20;
        room20.north = room17;

        prevRoom = currentRoom;

        wall = prevRoom;
        currentRoom = room1;

    }

    public void createPlayer(String name) {
        Player player = new Player();

        player.setName(name);

        System.out.println(player.getName());

    }

    public void move(String direction) {

        if (direction.equalsIgnoreCase("North") || direction.equalsIgnoreCase("N")) {
            currentRoom = currentRoom.north;
        } else if (direction.equalsIgnoreCase("west") || direction.equalsIgnoreCase("w")) {
            currentRoom = currentRoom.west;
        } else if (direction.equalsIgnoreCase("east") || direction.equalsIgnoreCase("e")) {
            currentRoom = currentRoom.east;
        } else if (direction.equalsIgnoreCase("south") || direction.equalsIgnoreCase("s")) {
            currentRoom = currentRoom.south;
        } else {
            System.out.println("Error in movement");

        }

    }

    /**
     * Save method, used to save the current state of game variables. 
     * #NOTE# Currently only saving highScore
     */
    public void save() {

        //Catch errors in I/O if necessary.
        try {

            // Open a file to write to, named SavedObj.sav.
            FileOutputStream saveFile = new FileOutputStream("saveFile.sav");

            // Create an ObjectOutputStream to put objects into save file.
            ObjectOutputStream save = new ObjectOutputStream(saveFile);

            //Write objects in the ObjectOutputStream.
            save.writeObject(highScore);

            //Closes the stream.
            save.close();

        } catch (Exception exc) {

            //If there was an error, print the info.
            exc.printStackTrace();

        }
    }

    /**
     * Load method, used to read the data in saveFile and load it into the game
     * variables. 
     * #NOTE# Currently only loading highScore
     */
    public void load() {

        //Catch errors in I/O if necessary.
        try {

            //Open file to read from, named SavedObj.sav.
            FileInputStream saveFile = new FileInputStream("saveFile.sav");

            //Create an ObjectInputStream to get objects from save file.
            ObjectInputStream save = new ObjectInputStream(saveFile);

            highScore = (ArrayList<String>) save.readObject();

            //Closes the input stream.
            save.close();

        } catch (Exception exc) {

            //If there was an error, print the info.
            exc.printStackTrace();

        }

    }

    //Getters and Setters, nothing special here - move along..!
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getPrevRoom() {
        return prevRoom;
    }

    public void setPrevRoom(Room prevRoom) {
        this.prevRoom = prevRoom;
    }

}
