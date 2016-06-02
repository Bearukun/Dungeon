package control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import model.Player;
import model.Room;
import model.monsterType.Boss;
import model.Item;
import model.TextGenerator;
import model.itemType.ArmorSet;
import model.itemType.Consumable;
import model.itemType.Weapon;

/**
 * GameControl class
 */
public class GameControl {

    //Declaring, initializing and instanciating variables. 
    ArrayList<String> highScore = new ArrayList();

    //Declaring objects. 
    Room room1, room2, room3, room4, room5, room6, room7, room8, room9, room10,
            room11, room12, room13, room14, room15, room16, room17, room18, room19,
            room20, currentRoom, previousRoom;
    Item item;
    Player player;
    private TextGenerator textGen;

    private boolean gameActive = true;
    private boolean hasDied = false;

    private boolean inBattle = false;

    /**
     * Constructor
     */
    public GameControl(String playerName) {

        createPlayer(playerName);
        createRooms();
        move("");
    }

    /**
     * Method used to create rooms.
     */
    private void createRooms() {

        //Initalising and instantiating new rooms. 
        room1 = new Room("Entrance", "It's very dark and you feel a very unwelcoming aura around you.");
        room2 = new Room("Tomb", "You see many bones laying around as if this have been some sort of mass burial.");
        room3 = new Room("Pit", "It seems like this is some sort of ancient Sacrefice site, it still reeks of corpses.");
        room4 = new Room("Dungeon", "S/M Dungeon ");
        room5 = new Room("Fast Food joint", "McDonalds");
        room6 = new Room("Fast Food joint", "Burger King");
        room7 = new Room("Ano Lando", "Kingdom from Dark Souls 1 & 2");
        room8 = new Room("Azeroth", "Land of Warcraft");
        room9 = new Room("Apple", "The space ship in Cuppertino");
        room10 = new Room("Kitchen", "There is food here!");
        room11 = new Room("Pet Shop", "There is no dead parrots here!");
        room12 = new Room("Microsoft", "The other tech company in Seattle");
        room13 = new Room("Sanctuary", "Land of Diablo");
        room14 = new Room("Capulo Sector", "StarCraft univers");
        room15 = new Room("Mother Base", "Home of the Diamond Dogs");
        room16 = new Room("Boston", "Home of Crane, Pool & Smitch");
        room17 = new Room("Mushroom Kingdom", "Te land of Super Mario");
        room18 = new Room("Yharnam", "Land of the Pale Blood Moon");
        room19 = new Room("Middle-Earth", "Land of JRR Tolkien");
        room20 = new Room("Exploding Kitten Room", "A room full of exploding kittens");

        //Room 1
        room1.east = room2;
        room1.north = room3;
        room1.west = room4;
        room1.south = room5;

        //Room 2
        room2.west = room1;
        room2.east = room6;
        room2.south = null;
        room2.north = null;
        room2.addMonster("Skeleton King", "the mad king of Tristram, bound once again to the mortal realm", 0, new Boss(20, 2, 900, textGen.generateTaunt("boss")));
        room2.addItemToMonster("Mace of the Skeleton King", "a mace lies on the ground", "A powerfull mace that belonged to the Skeleton King", 200, new Weapon(20));
        room2.addItemToMonster("Staff of Ra'", "a staff lies on a table","A golden staff with the insciption \"Staff of Ra'\"", 100000, new Weapon(1000));
        room2.addItemToMonster("Tal'Rashas", "a bunch of robes lies on the ground", "This is the magical impowered amor of the mage Tal'Rasha", 20, new ArmorSet(5, 10));

        //Room 3
        room3.east = null;
        room3.west = null;
        room3.south = room1;
        room3.north = room7;
        room3.addRoomItem("Mystic Potion", "a mysterious looking potion", "You don't know what effect it will have on you", 900, new Consumable(50, true, false));
        room3.addRoomItem("Odd-looking vial", "an odd-looking vial", "You don't know what effect it will have on you", 300, new Consumable(-20, true, false));

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
     *
     * @param name Takes a string, used to name the player.
     */
    public void createPlayer(String name) {

        player = new Player(name);
        textGen = new TextGenerator(name);

    }

    /**
     * Method used to move around.
     *
     * @param direction Used to tell what direction the player should move.
     */
    public void move(String direction) {

        String print = "";

        switch (direction) {
            case "west":
                if (currentRoom.west == null) {
                    print = "\n***You hit a wall***\n";
                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.west;
                }
                break;
            case "east":
                if (currentRoom.east == null) {
                    print = "\n***You hit a wall***\n";
                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.east;
                }
                break;
            case "north":
                if (currentRoom.north == null) {
                    print = "\n***You hit a wall***\n";
                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.north;

                }
                break;
            case "south":
                if (currentRoom.south == null) {
                    print = "\n***You hit a wall***\n";
                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.south;

                }
                break;
            default:
                break;
        }

        //Checking if the room has a boss in it
        if (currentRoom.getMonster() != null && currentRoom.getMonster().isIsAlive()) {

            inBattle = true;
            player.setHp(player.getHp() - currentRoom.getMonster().getMonsterInterface().getDamage());
            print = "As you enter the " + currentRoom.getRoomName() + ", you encounter " + currentRoom.getMonster().getName() + " - " + currentRoom.getMonster().getDescription() + ".\n"
                    + currentRoom.getMonster().getName() + " attacks you " + currentRoom.getMonster().getMonsterInterface().getTaunt() + "\nYou recive " + currentRoom.getMonster().getMonsterInterface().getDamage() + " damage!"
                    + " - You now have " + player.getHp() + "HP left.";

        } else {

            print = "You are now standing in the " + currentRoom.getRoomName() + ". " + currentRoom.getDescription() + "\n" + currentRoom.itemLookup(textGen.generateItemLookupText());

        }

        printer(print);

    }

    /**
     * This is the combat system
     *
     * @param command Takes a string with the command.
     */
    public void combatSystem(String command) {

        
        if (command.equals("attack")) {

            currentRoom.getMonster().getMonsterInterface().setHp(currentRoom.getMonster().getMonsterInterface().getHp() - player.getDamage());
            player.setHp(player.getHp() - currentRoom.getMonster().getMonsterInterface().getDamage());
            printer("You hit " + currentRoom.getMonster().getName() + " for " + player.getDamage() + "! " + currentRoom.getMonster().getMonsterInterface().getHp() + "HP left."
                    + "\n" + currentRoom.getMonster().getName() + " attacks you for " + currentRoom.getMonster().getMonsterInterface().getDamage() + "! You have " + player.getHp() + "HP left!");

            if (currentRoom.getMonster().getMonsterInterface().getHp() <= 0 && player.getHp() > 0) {

                printer(currentRoom.getMonster().getName() + " has been slayed!\nYou have gained a level, your health has been incrased and fully healed.");
                player.levelUp();
                currentRoom.getMonster().setIsAlive(false);
                inBattle = false;
                
                currentRoom.dropMonsterItems();
                
//                System.out.println(currentRoom.getMonster().getInventory().toString());
                move("");
                
            }
            if (player.getHp() <= 0) {

                printer("You have been slayed, game over!");
                hasDied = true;
                gameActive = false;

            }

        } else if (command.equals("use")) {

        } else if (command.equals("flee")) {

            currentRoom = previousRoom;
            printer("You flee from the enemy, and have returned to " + currentRoom.getRoomName() + ".");
            inBattle = false;

        }

    }

    public void inputAnalyzer(String input) {
       
        //This is used for the use command.
        String[] splitString = input.split(" ");
              

        if (input.equalsIgnoreCase("Help") && !inBattle) {

            String commands = "Movement: Used to move north/n, south/s, east/e or west/w.\n\tSyntax: go 'heading' or 'heading'\n"
                    + "Statistics: Used to show your stats.\n\t.Syntax: 'stats' or 'show stats'\n"
                    + "Inventory: Show the items you have in your inventory.\n\t.Syntax: 'inventory' or 'inv'\n"
                    + "Use: Use a consumable, such as a potion.\n\t.Syntax: 'use #itemName#'\n"
                    + "Equip: Equip an item from your inventory (Weapon and Armor) \n\t.Syntax: 'Equip #itemName#'\n"
                    + "Quit the game: If you want to leave the game, remember to save you progress..!\n\t.Syntax: 'quit'\n";
            printer(commands);

        }

        if (!inBattle) {
            if (input.equalsIgnoreCase("go west") || input.equalsIgnoreCase("west")) {
                move("west");

            } else if (input.equalsIgnoreCase("go east") || input.equalsIgnoreCase("east")) {
                move("east");
            } else if (input.equalsIgnoreCase("go north") || input.equalsIgnoreCase("norht")) {
                move("north");
            } else if (input.equalsIgnoreCase("go south") || input.equalsIgnoreCase("south")) {
                move("south");

            } else if (input.equalsIgnoreCase("Take all") || input.equalsIgnoreCase("all") || input.equalsIgnoreCase("pickup") || input.equalsIgnoreCase("take") ){
                printer(player.addItemToInventory(currentRoom.getItems()));
                currentRoom.setItems(null);
               
            } else if (splitString[0].equalsIgnoreCase("Equip")){
                
                printer(player.equipItem(input.substring(input.indexOf(' ')+1)));
                
            }

        }

        if (input.equalsIgnoreCase("Help") && inBattle) {

            String commands = "While in a battle, you can't move further in the dungeon..!"
                    + "\nAttack: Attacks the enemy in the current room"
                    + "\n\tSyntax: attack"
                    + "\nInventory: Show the items you have in your inventory."
                    + "\n\tSyntax: 'inventory' or 'inv'"
                    + "\nUse: Use an item in your inventory, if you have any."
                    + "\n\tSyntax: use 'itmename"
                    + "\nFlee: Flees to the previous room."
                    + "\n\tSyntax: flee";
            printer(commands);

        }

        if (inBattle) {

            if (input.equalsIgnoreCase("Attack")) {

                combatSystem("attack");

            } else if (input.equalsIgnoreCase("use")) {

                combatSystem("use");
            } else if (input.equalsIgnoreCase("Flee")) {

                combatSystem("flee");
            }

        }

        //Input that can be used in or out of battle.
        if (input.equalsIgnoreCase("stats") || input.equalsIgnoreCase("show stats")) {

            printer(player.getStats());

        }
        if (input.equalsIgnoreCase("inventory") || input.equalsIgnoreCase("inv")) {

            printer(player.getInventory());

        }
        if (splitString[0].equalsIgnoreCase("use")) {

            printer(player.useItem(input.substring(input.indexOf(' ')+1)));

        }

    }

    /**
     * Print method, can be useful to implement some GUI with an text window.
     *
     * @param toPrinter Takes a String to print.
     */
    public void printer(String toPrinter) {

        System.out.println(toPrinter);

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

    public boolean isGameActive() {
        return gameActive;
    }

    public boolean hasDied() {
        return hasDied;
    }

}
