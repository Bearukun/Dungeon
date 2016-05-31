package control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Player;
import model.Room;
import model.monsterType.Boss;
import model.Item;
import model.itemType.Consumable;

/**
 * GameControl class
 */
public class GameControl {

    //Initializing and instanciating variables. 
    ArrayList<String> highScore = new ArrayList();

    Room currentRoom, previousRoom;
    Item item;
    
    private boolean inBattle = false;

    /**
     * Constructor
     */
    public GameControl() {

        createRooms();

    }

    /**
     * Method used to create rooms.
     */
    private void createRooms() {

        //Initalising and instantiating new rooms. 
        Room room1 = new Room("Entrance", "You are standing in the Entrance ");
        Room room2 = new Room("Tomb", "You are in the tomb");
        Room room3 = new Room("Pit", "Sacrefice Pit");
        Room room4 = new Room("Dungeon", "S/M Dungeon ");
        Room room5 = new Room("Fast Food joint", "McDonalds");
        Room room6 = new Room("Fast Food joint", "Burger King");
        Room room7 = new Room("Ano Lando", "Kingdom from Dark Souls 1 & 2");
        Room room8 = new Room("Azeroth", "Land of Warcraft");
        Room room9 = new Room("Apple", "The space ship in Cuppertino");
        Room room10 = new Room("Kitchen", "There is food here!");
        Room room11 = new Room("Pet Shop", "There is no dead parrots here!");
        Room room12 = new Room("Microsoft", "The other tech company in Seattle");
        Room room13 = new Room("Sanctuary", "Land of Diablo");
        Room room14 = new Room("Capulo Sector", "StarCraft univers");
        Room room15 = new Room("Mother Base", "Home of the Diamond Dogs");
        Room room16 = new Room("Boston", "Home of Crane, Pool & Smitch");
        Room room17 = new Room("Mushroom Kingdom", "Te land of Super Mario");
        Room room18 = new Room("Yharnam", "Land of the Pale Blood Moon");
        Room room19 = new Room("Middle-Earth", "Land of JRR Tolkien");
        Room room20 = new Room("Exploding Kitten Room", "A room full of exploding kittens");

        //Room 1
        room1.east = room2;
        room1.north = room3;
        room1.west = room4;
        room1.south = room5;
        room1.addItem("Mystic Potion", "a mysterious looking potion", "You don't know what effect it will have on you", 900, new Consumable(50, true));
        room1.addItem("Odd-looking vial", "an odd-looking vial", "You don't know what effect it will have on you", 300, new Consumable(-20, true));

        //Room 2
        room2.west = room1;
        room2.east = room6;
        room2.south = null;
        room2.north = null;
        room2.addMonster("Big boss", "A baddass motherfucker", 0, new Boss(50, 5, 900, room2.getTextGen().generateTaunt("Boss")));

        //Room 3
        room3.east = null;
        room3.west = null;
        room3.south = room1;
        room3.north = room7;

        //Room4
        room4.east = room1;
        room4.west = room16;
        room4.south = null;
        room4.north = null;

        //Room5
        room5.east = null;
        room5.west = null;
        room5.south = room14;
        room5.north = room1;

        //Room6
        room6.east = null;
        room6.west = room2;
        room6.south = room11;
        room6.north = room10;

        //Room7
        room7.east = room8;
        room7.west = null;
        room7.south = room3;
        room7.north = null;

        //Room8
        room8.east = room7;
        room8.west = room9;
        room8.south = null;
        room8.north = null;

        //Room9
        room9.east = null;
        room9.west = room8;
        room9.south = room10;
        room9.north = null;

        //Room10
        room10.east = null;
        room10.west = null;
        room10.south = room6;
        room10.north = room9;

        //Room11
        room11.east = null;
        room11.west = null;
        room11.south = room12;
        room11.north = room6;

        //Room12
        room12.east = null;
        room12.west = room13;
        room12.south = null;
        room12.north = room11;

        //Room13
        room13.east = room12;
        room13.west = room14;
        room13.south = room15;
        room13.north = null;

        //Room14
        room14.east = room13;
        room14.west = null;
        room14.south = null;
        room14.north = room5;

        //Room15
        room15.east = null;
        room15.west = null;
        room15.south = null;
        room15.north = room13;

        //Room16
        room16.east = room4;
        room16.west = room17;
        room16.south = null;
        room16.north = null;

        //Room17
        room17.east = room16;
        room17.west = room19;
        room17.south = room20;
        room17.north = room18;

        //Room18
        room18.east = null;
        room18.west = null;
        room18.south = room17;
        room18.north = null;

        //Room19
        room19.east = room17;
        room19.west = null;
        room19.south = null;
        room19.north = null;

        //Room20
        room20.east = null;
        room20.west = null;
        room20.south = null;
        room20.north = room17;

        currentRoom = room1;
        previousRoom = currentRoom;

    }

    /**
     * Method used to create a new player.
     * @param name Takes a string, used to name the player. 
     */
    public void createPlayer(String name) {
        Player player = new Player(name);

        System.out.println(player.getName());

    }

    /**
     * Method used to move around. 
     * @param direction Used to tell what direction the player should move. 
     */
    public void move(String direction) {

        if (direction.equalsIgnoreCase("North") || direction.equalsIgnoreCase("N")) {
            if (currentRoom.north == null) {
                System.out.println("\n***You hit a wall***\n");
            } else {
                
                previousRoom = currentRoom;
                currentRoom = currentRoom.north;

            }
        } else if (direction.equalsIgnoreCase("west") || direction.equalsIgnoreCase("w")) {
            if (currentRoom.west == null) {
                System.out.println("\n***You hit a wall***\n");
            } else {
                
                previousRoom = currentRoom;
                currentRoom = currentRoom.west;
            }
        } else if (direction.equalsIgnoreCase("east") || direction.equalsIgnoreCase("e")) {
            if (currentRoom.east == null) {
                System.out.println("\n***You hit a wall***\n");
            } else {
                
                previousRoom = currentRoom;
                currentRoom = currentRoom.east;
            }
        } else if (direction.equalsIgnoreCase("south") || direction.equalsIgnoreCase("s")) {
            if (currentRoom.south == null) {
                System.out.println("\n***You hit a wall***\n");
            } else {
                
                previousRoom = currentRoom;
                currentRoom = currentRoom.south;
            }
        } else {
            
            System.out.println("Error in movement");

        }

        roomPrinter();

    }

    public void inputAnalyzer(String input) {

        if (!inBattle) {
            if (input.equalsIgnoreCase("West") || input.equalsIgnoreCase("w")) {
                move(input);

            } else if (input.equalsIgnoreCase("East") || input.equalsIgnoreCase("e")) {
                move(input);
                System.out.println("EEEEEEAAAAASTT");
            } else if (input.equalsIgnoreCase("North") || input.equalsIgnoreCase("n")) {
                move(input);
            } else if (input.equalsIgnoreCase("South") || input.equalsIgnoreCase("s")) {
                move(input);

            }
        }

    }

    public void roomPrinter() {

        System.out.println("----" + getCurrentRoom().getRoomName() + "--------");
        System.out.println("------------------------------------------");
        System.out.println(getCurrentRoom().getDescription());
        System.out.println(getCurrentRoom().itemLookup());

    }

    /**
     * Save method, used to save the current state of game variables. #NOTE#
     * Currently only saving highScore
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
     * variables. #NOTE# Currently only loading highScore
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
