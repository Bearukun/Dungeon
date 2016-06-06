package control;

import java.io.Serializable;
import model.Player;
import model.Room;
import model.monsterType.Boss;
import model.Item;
import model.TextGenerator;
import model.itemType.ArmorSet;
import model.itemType.Consumable;
import model.itemType.Key;
import model.itemType.Weapon;
import model.monsterType.Minion;
import model.lockType.Locked;
import model.lockType.Unlocked;

/**
 * GameControl class
 */
public class GameControl implements Serializable {

    //Declaring, initializing and instanciating variables. 
    private int highScore;
    private boolean hasBeenRun, hasDied, inBattle, gameActive;

    //Declaring objects. 
    Room room1, room2, room3, room4, room5, room6, room7, room8, room9, room10,
            room11, room12, room13, room14, room15, room16, room17, room18, room19,
            room20, room21, room22, room23, room24, room25, room26, room27, room28, room29, room30,
            room31, room32, room33, room34, room35, room36, room37, room38, room39, room40,
            room41, room42, room43, room44, room45, room46, room47, room48, room49, room50,
            room51, room52, room53, room54, room55, room56, room57, room58, room59, room60,
            room61, room62, room63, room64, room65, room66, room67, room68, room69, room70,
            room71, room72, room73, room74, room75, room76, room77, room78, room79, room80,
            room81, room82, room83, room84, room85, room86, room87, room88, room89, room90,
            room91, room92, room93, room94, room95, room96, currentRoom, previousRoom;
    Item item;
    Player player;
    private TextGenerator textGen;

    /**
     * Constructor
     */
    public GameControl(String playerName) {

        createPlayer(playerName);
        createRooms();
        highScore = 0;
        gameActive = true;
    }

    /**
     * Method used to create rooms and place player.
     */
    private void createRooms() {

        //Initalising and instantiating new rooms. 
        room1 = new Room("Entrance", "It's very dark and you feel a very unwelcoming aura around you.", new Unlocked());
        room2 = new Room("Corridor", "You see many bones laying around as if this have been some sort of mass burial.", new Unlocked());
        room3 = new Room("Great South Hall", "It seems like this is some sort of ancient Sacrefice site, it still reeks of corpses.", new Unlocked());
        room4 = new Room("Chamber of Worship", "S/M Dungeon ", new Locked("Dungeon", true));
        room5 = new Room("Corridor", "McDonalds", new Unlocked());
        room6 = new Room("Corridor", "Burger King", new Unlocked());
        room7 = new Room("Corridor", "Kingdom from Dark Souls 1 & 2", new Unlocked());
        room8 = new Room("Entrance to Anubis Chamber", "Land of Warcraft", new Unlocked());
        room9 = new Room("Chamber of Preparation", "The space ship in Cuppertino", new Unlocked());
        room10 = new Room("Servants Chambers", "There is food here!", new Unlocked());
        room11 = new Room("Sacrifice Room", "There is no dead parrots here!", new Unlocked());
        room12 = new Room("Corridor", "The other tech company in Seattle", new Unlocked());
        room13 = new Room("Chamber of Worship", "Land of Diablo", new Unlocked());
        room14 = new Room("Chamber of Burial", "StarCraft univers", new Unlocked());
        room15 = new Room("Trasure Room", "Home of the Diamond Dogs", new Unlocked());
        room16 = new Room("Corridor", "Home of Crane, Pool & Smitch", new Unlocked());
        room17 = new Room("High Priest of Anubis Chamber", "The land of Super Mario", new Unlocked());
        room18 = new Room("Corridor", "Land of the Pale Blood Moon", new Unlocked());
        room19 = new Room("Altar of Anubis", "Land of JRR Tolkien", new Locked("Altar of Anubis Key", true));
        room20 = new Room("Corridor", "A room full of exploding kittens", new Unlocked());
        room21 = new Room("Corridor", "empty 21", new Unlocked());
        room22 = new Room("Corridor", "empty 22", new Unlocked());
        room23 = new Room("Corridor", "empty 23", new Unlocked());
        room24 = new Room("Entrance to Horus Chamber", "A room full of exploding kittens", new Unlocked());
        room25 = new Room("Servants Chambers", "Empty 25", new Unlocked());
        room26 = new Room("Corridor", "Empty 26", new Unlocked());
        room27 = new Room("Chamber of Light", "Empty 27", new Unlocked());
        room28 = new Room("Treasure Room", "Empty 28", new Unlocked());
        room29 = new Room("Chamber of Worship", "Empty 29", new Unlocked());
        room30 = new Room("Sacrifice Room", "Empty 30", new Unlocked());
        room31 = new Room("High Priest of Horus Chamber", "Empty 31", new Unlocked());
        room32 = new Room("Chamber of The Sun", "Empty 32", new Unlocked());
        room33 = new Room("Altar of Horus", "Empty 33", new Locked("Altar of Horus Key", true));
        room34 = new Room("Corridor", "Empty 34", new Unlocked());
        room35 = new Room("Corridor", "Empty 35", new Unlocked());
        room36 = new Room("Corridor", "Empty 36", new Unlocked());
        room37 = new Room("Corridor", "Empty 37", new Unlocked());
        room38 = new Room("Corridor", "Empty 38", new Unlocked());
        room39 = new Room("Corridor", "Empty 39", new Unlocked());
        room40 = new Room("Great North Hall", "Empty 40", new Unlocked());
        room41 = new Room("Entrance to Ra' Chamber", "Empty 41", new Unlocked());
        room42 = new Room("High Priest of Ra' Chamber", "Empty 42", new Unlocked());
        room43 = new Room("Altar of Ra'", "Empty 43", new Locked("Altar of Ra' Key", true));
        room44 = new Room("Corridor", "Empty 44", new Unlocked());
        room45 = new Room("Corridor", "Empty 45", new Unlocked());
        room46 = new Room("Corridor", "Empty 46", new Unlocked());
        room47 = new Room("Corridor", "Empty 47", new Unlocked());
        room48 = new Room("Corridor", "Empty 48", new Unlocked());
        room49 = new Room("Corridor", "Empty 49", new Unlocked());
        room50 = new Room("Corridor", "Empty 50", new Unlocked());
        room51 = new Room("Corridor", "Empty 51", new Unlocked());
        room52 = new Room("Corridor", "Empty 52", new Unlocked());
        room53 = new Room("Corridor", "Empty 53", new Unlocked());
        room54 = new Room("Corridor", "Empty 54", new Unlocked());
        room55 = new Room("Corridor", "Empty 55", new Unlocked());
        room56 = new Room("Entrance to Osiris Chamber", "Empty 56", new Unlocked());
        room57 = new Room("Chamber of Mercy", "Empty 57", new Unlocked());
        room58 = new Room("Corridor", "Empty 58", new Unlocked());
        room59 = new Room("Sacrifice Room", "Empty 59", new Unlocked());
        room60 = new Room("Chamber of Worship", "Empty 60", new Unlocked());
        room61 = new Room("Servants Chambers", "Empty 61", new Unlocked());
        room62 = new Room("Chamber of Souls", "Empty 62", new Unlocked());
        room63 = new Room("Treasure Room", "Empty 63", new Unlocked());
        room64 = new Room("Chamber of the Underworld", "Empty 64", new Unlocked());
        room65 = new Room("Chamber of Death", "Empty 65", new Unlocked());
        room66 = new Room("High Priest of Osiris Chamber", "Empty 66", new Unlocked());
        room67 = new Room("Altar of Osiris", "Empty 67", new Locked("Altar of Osiris Key", true));
        room68 = new Room("Entrance to Seth Chamber", "Empty 68", new Unlocked());
        room69 = new Room("Corridor", "Empty 69", new Unlocked());
        room70 = new Room("Servants Chambers", "Empty 70", new Unlocked());
        room71 = new Room("Corridor", "Empty 71", new Unlocked());
        room72 = new Room("Treasure Room", "Empty 72", new Unlocked());
        room73 = new Room("Corridor", "Empty 73", new Unlocked());
        room74 = new Room("Chamber of Deception", "Empty 74", new Unlocked());
        room75 = new Room("Corridor", "Empty 75", new Unlocked());
        room76 = new Room("Chamber of Betrayel", "Empty 76", new Unlocked());
        room77 = new Room("Corridor", "Empty 77", new Unlocked());
        room78 = new Room("Chamber of Torture", "Empty 78", new Unlocked());
        room79 = new Room("Chamber of Fear", "Empty 79", new Unlocked());
        room80 = new Room("Chamber of Hatred", "Empty 80", new Unlocked());
        room81 = new Room("Sacrifice Room", "Empty 81", new Unlocked());
        room82 = new Room("Corridor", "Empty 82", new Unlocked());
        room83 = new Room("Chamber of Illusion", "Empty 83", new Unlocked());
        room84 = new Room("Chamber of Worship", "Empty 84", new Unlocked());
        room85 = new Room("Corridor", "Empty 85", new Unlocked());
        room86 = new Room("High Priest of Seth Chamber", "Empty 86", new Unlocked());
        room87 = new Room("Corridor", "Empty 87", new Unlocked());
        room88 = new Room("Altar of Seth", "Empty 88", new Locked("Altar of Seth Key", true));
        room89 = new Room("Stairway of Imsety", "Empty 89", new Locked("Stairway of Imsety", true));
        room90 = new Room("Stairway of Hapy", "Empty 90", new Locked("Stairway of Hapy", true));
        room91 = new Room("Starway of Duamutef", "Empty 91", new Locked("Starway of Duamutef", true));
        room92 = new Room("Stairway of Qebehsenuef", "Empty 92", new Locked("Stairway of Qebehsenuef", true));
        room93 = new Room("Corridor", "Empty 93", new Unlocked());
        room94 = new Room("Treasure Room", "Empty 94", new Unlocked());
        room95 = new Room("Treasure Room", "Empty 95", new Unlocked());
        room96 = new Room("Tomb of Tal'Rasha", "Empty 96", new Locked("Key to The Tomb Of Tal'Rasha", true));

        //Room 1: Entrance
        room1.east = null;
        room1.north = room2;
        room1.west = null;
        room1.south = null;

        //Room 2 : Corridor
        room2.west = null;
        room2.east = null;
        room2.south = room1;
        room2.north = room3;
        room2.addMonster("Swarm of Scarabs", "a large group of flesh eating beetles", 0, new Boss(10, 1, 1, textGen.generateTaunt("Minion")));
        room2.addItemToMonster("Mace of the Skeleton King", "a mace lies on the ground", "A powerfull mace that belonged to the Skeleton King", 200, new Weapon(20));

        room2.addItemToMonster("Tal'Rasha's Elements", "a bunch of robes lies on the ground", "This is the magical impowered amor of the mage Tal'Rasha", 20, new ArmorSet(5, 10));
        room2.addItemToMonster("Rusty key", "an old key with the inscription \"Go weeeeest\"", "This key unlocks the room west of the entrance.", 0, new Key(true, "Dungeon"));

        //Room 3: Great South Hall
        room3.east = room5;
        room3.west = room56;
        room3.south = room2;
        room3.north = room4;
        room3.addRoomItem("Mystic Potion", "a mysterious looking potion", "You don't know what effect it will have on you", 900, new Consumable(50, true, false));
        room3.addRoomItem("Odd-looking vial", "an odd-looking vial", "You don't know what effect it will have on you", 300, new Consumable(-20, true, false));
        room3.addRoomItem("An old key", "an odd-looking key", "This will open a chest.", 0, new Key(false, "room3"));
        room3.addChest("in the corner of the room", false, new Locked("room3", true));
        room3.addItemToChest("Broad Sword", "a shiny broad sword", "forged by the flames of hell", 45, new Weapon(10));
        room3.addMonster("Lich King", "The lord of the Undead Scourge", 0, new Boss(20, 5, 999, textGen.generateTaunt("Boss")));

        //Room4: Chamber of Worship
        room4.east = null;
        room4.west = null;
        room4.south = room3;
        room4.north = null;
        room4.addMonster("Lich", "A servent of the Lich King", 0, new Minion(20, 2, 20, textGen.generateTaunt("Minion")));

        //Room5: Corridor
        room5.east = room6;
        room5.west = room3;
        room5.south = null;
        room5.north = null;

        //Room6: Corridor
        room6.east = room8;
        room6.west = room5;
        room6.south = room7;
        room6.north = room20;

        //Room7: Chamber of Tools
        room7.east = null;
        room7.west = null;
        room7.south = null;
        room7.north = room6;

        //Room8: Entrance to Anubis Chamber
        room8.east = room9;
        room8.west = room6;
        room8.south = null;
        room8.north = null;

        //Room9: Chamber of Preparation
        room9.east = room10;
        room9.west = room8;
        room9.south = null;
        room9.north = null;

        //Room10: Servants Chamber
        room10.east = room11;
        room10.west = room9;
        room10.south = null;
        room10.north = null;

        //Room11: Sacrifice Room
        room11.east = null;
        room11.west = room10;
        room11.south = room12;
        room11.north = null;

        //Room12: Corridor
        room12.east = null;
        room12.west = null;
        room12.south = room13;
        room12.north = room11;

        //Room13: Chamber of Worship
        room13.east = null;
        room13.west = null;
        room13.south = room14;
        room13.north = room12;

        //Room14: Chamber of Burial
        room14.east = null;
        room14.west = room15;
        room14.south = null;
        room14.north = room13;

        //Room15: Treasure Room
        room15.east = room14;
        room15.west = null;
        room15.south = null;
        room15.north = room16;

        //Room16: Corridor
        room16.east = null;
        room16.west = null;
        room16.south = room15;
        room16.north = room17;

        //Room17: High Priest of Anubis Chamber
        room17.east = null;
        room17.west = room18;
        room17.south = room16;
        room17.north = null;
        room17.addMonster("High Priest of Anubis", "High Priest of Anubis, God of mummification and the afterlife", 0, new Minion(50, 20, 10, textGen.generateTaunt("minion")));
        room17.addItemToMonster("Altar of Anubis Key", " a strange silver key ", "An inscription on the key states: \"Key to the Altar of Anubis\"", 0, new Key(true, "Altar of Anubis Key"));

        //Room18: Corridor
        room18.east = room17;
        room18.west = room19;
        room18.south = null;
        room18.north = null;

        //Room19: Altar of Anubis
        room19.east = room17;
        room19.west = room7; //SECRET DOOR THAT OPENS AFTER ANUBIS BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room19.south = null;
        room19.north = null;
        room19.addMonster("Anubis", "God of mummification and the afterlife", 0, new Boss(200, 25, 999, textGen.generateTaunt("Boss")));

        //Room20: Corridor
        room20.east = null;
        room20.west = null;
        room20.south = room6;
        room20.north = room21;

        //Room21: Corridor
        room21.east = null;
        room21.west = null;
        room21.south = room20;
        room21.north = room22;

        //Room22: Corridor
        room22.east = null;
        room22.west = null;
        room22.south = room21;
        room22.north = room23;

        //Room23: Corridor
        room23.east = room24;
        room23.west = null;
        room23.south = room22;
        room23.north = room34;

        //Room24: Entrance to Horus Chamber
        room24.east = room25;
        room24.west = room23;
        room24.south = null;
        room24.north = null;

        //Room25: Servants Chambers
        room25.east = room26;
        room25.west = room24;
        room25.south = null;
        room25.north = null;

        //Room26: Corridor
        room26.east = null;
        room26.west = room25;
        room26.south = null;
        room26.north = room27;

        //Room27: Chamber of Light
        room27.east = null;
        room27.west = null;
        room27.south = room27;
        room27.north = room28;

        //Room28: Treasure Room
        room28.east = null;
        room28.west = null;
        room28.south = room27;
        room28.north = room29;

        //Room29: Chamber of Worship
        room29.east = null;
        room29.west = null;
        room29.south = room28;
        room29.north = room30;

        //Room30: Sacrifice Room
        room30.east = null;
        room30.west = null;
        room30.south = room29;
        room30.north = room31;

        //Room31: High Priest of Horus Chamber
        room31.east = null;
        room31.west = room32;
        room31.south = room30;
        room31.north = null;
        room31.addMonster("High Priest of Horus", "The High Priest of the God Horus, God of the Skies", 0, new Minion(50, 20, 10, textGen.generateTaunt("Minion")));
        room31.addItemToMonster("Altar of Horus Key", " a strange blue key ", "An inscription on the key states: \"Key to the Altar of Horus\"", 0, new Key(true, "Altar of Horus Key"));

        //Room32: Chamber of the Sun
        room32.east = room31;
        room32.west = room33;
        room32.south = null;
        room32.north = null;

        //Room33: Altar of Horus
        room33.east = room32;
        room33.west = room38; //SECRET DOOR THAT OPENS AFTER HORUS BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room33.south = null;
        room33.north = null;
        room33.addMonster("Horus", "God of the Skies", 0, new Boss(150, 20, 999, textGen.generateTaunt("Boss")));
        room33.addItemToMonster("Sword of Horus", "a golden gleaming sword sticks out from under the corps of Horus", "A Golden powerfull imbued Sword, forged for the God Horus", 250, new Weapon(50));

        //Room34: Corridor
        room34.east = null;
        room34.west = null;
        room34.south = room23;
        room34.north = room35;

        //Room35: Corridor
        room35.east = null;
        room35.west = null;
        room35.south = room34;
        room35.north = room36;

        //Room36: Corridor
        room36.east = null;
        room36.west = null;
        room36.south = room35;
        room36.north = room37;

        //Room37: Corridor
        room37.east = null;
        room37.west = null;
        room37.south = room36;
        room37.north = room38;

        //Room38: Corridor
        room38.east = room33;
        room38.west = room39;
        room38.south = room37;
        room38.north = null;

        //Room39: Corridor
        room39.east = room38;
        room39.west = room40;
        room39.south = null;
        room39.north = null;

        //Room40: Great North Hall
        room40.east = room39;
        room40.west = room44;
        room40.south = room89;
        room40.north = room41;
        room40.addRoomItem("Canopic Jar of Imsety", "a strange jar with a human head on the top", "A canopic jar containing the liver of Tal'Rasha", 0, new Key(true, "Stairway of Imsety"));
        room40.addRoomItem("Canopic Jar of Hapy", "a strange jar with a baboon head on the top", "A canopic jar containing the lungs of Tal'Rasha", 0, new Key(true, "Stairway of Hapy"));
        room40.addRoomItem("Canopic Jar of Duamutef", "a strange jar with a jackal head on the top", "A canopic jar containing the stomach of Tal'Rasha", 0, new Key(true, "Stairway of Duamutef"));
        room40.addRoomItem("Canopic Jar of Quebehsenuef", "a strange jar with a falcon head on the top", "A canopic jar containing the intestines of Tal'Rasha", 0, new Key(true, "Stairway of Quebehsenuef"));

        //Room41: Entrance to Ra' Chamber
        room41.east = null;
        room41.west = null;
        room41.south = room40;
        room41.north = room42;

        //Room42: High Priest of Ra' Chamber
        room42.east = null;
        room42.west = null;
        room42.south = room41;
        room42.north = room43;
        room42.addMonster("High Priest of Ra'", "High Priest of the God Ra', God of the Sun", 0, new Minion(20, 10, 10, textGen.generateTaunt("Minion")));
        room42.addItemToMonster("Altar of Ra' Key", " a strange golden key ", "An inscription on the key states: \"Key to the Altar of Ra'\"", 0, new Key(true, "Altar of Ra' Key"));

        //Room43: Altar of Ra'
        room43.east = null;
        room43.west = null;
        room43.south = room42;
        room43.north = null;
        room43.addMonster("Ra'", "God of the Sun", 0, new Boss(150, 20, 999, textGen.generateTaunt("Boss")));
        room43.addItemToMonster("Key to The Tomb Of Tal'Rasha", "a magnificient gleaming obsidian key", "Inscription of the key states: \"Tomb Of Tal'Rasha\"", 0, new Key(true, "Key to The Tomb Of Tal'Rasha"));
        room43.addItemToMonster("Staff of Ra'", "a staff lies on a table", "A golden staff with the insciption \"Staff of Ra'\"", 300, new Weapon(75));
        //Room44: Corridor
        room44.east = room40;
        room44.west = room45;
        room44.south = null;
        room44.north = null;

        //Room45: Corridor
        room45.east = room44;
        room45.west = null;
        room45.south = room46;
        room45.north = room88;

        //Room46: Corridor
        room46.east = null;
        room46.west = null;
        room46.south = room47;
        room46.north = room45;

        //Room47: Corridor
        room47.east = null;
        room47.west = room68;
        room47.south = room48;
        room47.north = room46;

        //Room48: Corridor
        room48.east = null;
        room48.west = null;
        room48.south = room49;
        room48.north = room47;

        //Room49: Corridor
        room49.east = null;
        room49.west = null;
        room49.south = room50;
        room49.north = room48;

        //Room50: Corridor
        room50.east = null;
        room50.west = room67;
        room50.south = room51;
        room50.north = room49;

        //Room51: Corridor
        room51.east = null;
        room51.west = null;
        room51.south = room52;
        room51.north = room50;

        //Room52: Corridor
        room52.east = null;
        room52.west = null;
        room52.south = room53;
        room52.north = room21;

        //Room53: Corridor
        room53.east = null;
        room53.west = null;
        room53.south = room54;
        room53.north = room52;

        //Room54: Corridor
        room54.east = room55;
        room54.west = null;
        room54.south = null;
        room54.north = room53;

        //Room55: Corridor
        room55.east = room3;
        room55.west = room54;
        room55.south = null;
        room55.north = null;

        //Room56: Entrance to Osiris Chamber
        room56.east = room52;
        room56.west = room57;
        room56.south = null;
        room56.north = null;

        //Room57: Chamber of Mercy
        room57.east = room56;
        room57.west = room60;
        room57.south = null;
        room57.north = null;

        //Room58: Corridor
        room58.east = room66;
        room58.west = null;
        room58.south = null;
        room58.north = room65;

        //Room59: Chamber of Sacrifice
        room59.east = null;
        room59.west = room62;
        room59.south = room60;
        room59.north = room64;

        //Room60: Chamber of Worship
        room60.east = room57;
        room60.west = room61;
        room60.south = null;
        room60.north = room59;

        //Room61: Servants Chambers
        room61.east = room60;
        room61.west = null;
        room61.south = null;
        room61.north = room62;

        //Room62: Chamber of Souls
        room62.east = room59;
        room62.west = null;
        room62.south = room61;
        room62.north = room63;

        //Room63: Treasure Room
        room63.east = room64;
        room63.west = null;
        room63.south = room62;
        room63.north = null;

        //Room64: Chamber of the Underworld
        room64.east = room65;
        room64.west = room63;
        room64.south = room59;
        room64.north = null;

        //Room65: Chamber of Death
        room65.east = null;
        room65.west = room64;
        room65.south = room58;
        room65.north = null;

        //Room66: High Priest of Osiris Chamber
        room66.east = null;
        room66.west = room58;
        room66.south = null;
        room66.north = room67;
        room66.addMonster("High Priest of Osiris", "The High Priest of the God Osiris, God of the Underworld", 0, new Minion(30, 10, 0, textGen.generateTaunt("Minion")));
        room66.addItemToMonster("Altar of Osiris Key", " a strange bronze key ", "An inscription on the key states: \"Key to the Altar of Osiris\"", 0, new Key(true, "Altar of Osiris Key"));

        //Room67: Altar of Osiris
        room67.east = room50; //SECRET DOOR THAT OPENS AFTER OSIRIS BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room67.west = null;
        room67.south = room66;
        room67.north = null;
        room67.addMonster("Osiris", "God of the Underworld", 0, new Boss(150, 30, 999, textGen.generateTaunt("Boss")));

        //Room68: Entrance to Seth Chamber
        room68.east = room47;
        room68.west = room69;
        room68.south = null;
        room68.north = null;

        //Room69: Corridor
        room69.east = room68;
        room69.west = room70;
        room69.south = null;
        room69.north = room76;

        //Room70: Servants Chamber
        room70.east = room69;
        room70.west = room71;
        room70.south = null;
        room70.north = room75;

        //Room71: Corridor
        room71.east = room70;
        room71.west = room72;
        room71.south = null;
        room71.north = room74;

        //Room72: Treasure Room
        room72.east = room71;
        room72.west = null;
        room72.south = null;
        room72.north = room73;

        //Room73: Corridor
        room73.east = room74;
        room73.west = null;
        room73.south = room72;
        room73.north = room80;

        //Room74: Chamber of Deception
        room74.east = room75;
        room74.west = room73;
        room74.south = room71;
        room74.north = room79;

        //Room75: Corridor
        room75.east = room76;
        room75.west = room74;
        room75.south = room70;
        room75.north = room78;

        //Room76: Chamber of Betrayel
        room76.east = null;
        room76.west = room75;
        room76.south = room69;
        room76.north = room77;

        //Room77: Corridor
        room77.east = null;
        room77.west = room78;
        room77.south = room76;
        room77.north = room84;

        //Room78: Chamber of Torture
        room78.east = room77;
        room78.west = room79;
        room78.south = room75;
        room78.north = room83;

        //Room79: Chamber of Fear
        room79.east = room78;
        room79.west = room80;
        room79.south = room74;
        room79.north = room82;

        //Room80: Chamber of Hatred
        room80.east = room79;
        room80.west = null;
        room80.south = room73;
        room80.north = room81;

        //Room81: Sacrifice Room
        room81.east = room82;
        room81.west = null;
        room81.south = room80;
        room81.north = null;

        //Room82: Corridor
        room82.east = room83;
        room82.west = room81;
        room82.south = room79;
        room82.north = null;

        //Room83: CHamber of Illusion
        room83.east = room84;
        room83.west = room82;
        room83.south = room78;
        room83.north = null;

        //Room84: Chamber of Worship
        room84.east = room85;
        room84.west = room83;
        room84.south = room77;
        room84.north = null;

        //Room85: Corridor
        room85.east = null;
        room85.west = room84;
        room85.south = null;
        room85.north = room86;

        //Room86: High Priest of Seth Chamber
        room86.east = room87;
        room86.west = null;
        room86.south = room85;
        room86.north = null;
        room86.addMonster("High Priest of Seth", "The High Priest of the God Seth, God of Disorder and Violence", 0, new Minion(20, 5, 10, textGen.generateTaunt("Minion")));
        room86.addItemToMonster("Altar of Seth Key", " a strange obsidian key ", "An inscription on the key states: \"Key to the Altar of Seth\"", 0, new Key(true, "Altar of Seth Key"));

        //Room87: Corridor
        room87.east = null;
        room87.west = room86;
        room87.south = room88;
        room87.north = null;

        //Room88: Altar of Seth
        room88.east = null;
        room88.west = null;
        room88.south = room45; //SECRET DOOR THAT OPENS AFTER SETH BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room88.north = room88;
        room88.addMonster("Seth", "God of Disorder and Violence", 0, new Boss(175, 35, 999, textGen.generateTaunt("Boss")));

        //Room89: Stairway of Imsety
        room89.east = null;
        room89.west = null;
        room89.south = room90;
        room89.north = room40;

        //Room90: Stairway of Hapy
        room90.east = null;
        room90.west = null;
        room90.south = room91;
        room90.north = room89;

        //Room91: Stairway of Duamutef
        room91.east = null;
        room91.west = null;
        room91.south = room92;
        room91.north = room90;

        //Room92: Stairway of Qebehsenuef
        room92.east = null;
        room92.west = null;
        room92.south = room93;
        room92.north = room91;

        //Room93: Corridor
        room93.east = room95;
        room93.west = room94;
        room93.south = room96;
        room93.north = room92;

        //Room94: Treasure Room
        room94.east = room93;
        room94.west = null;
        room94.south = null;
        room94.north = null;

        //Room95: Corridor
        room95.east = null;
        room95.west = room93;
        room95.south = null;
        room95.north = null;

        //Room96: Tomb of Tal'Rasha
        room96.east = null;
        room96.west = null;
        room96.south = room93;
        room96.north = null;
        room96.addMonster("Tal'Rasha", "The powerfull ancient Egyptian sorcerer and Lord of the Pyramid", highScore, new Boss(250, 25, 9999, textGen.generateTaunt("Boss")));
        room96.addItemToMonster("Stone Obsidian Key", "a strange heavy obsidian key", "The key looks very old, only part of the inscription is intact spelling \"...Covernant\"", 0, new Key(true, "Stone Obsidian Key"));
        room96.addChest("Behind Tal'Rashas sarcofacus stands a stone chest made of obsidian", true, new Locked("Stone Obsidian Key", true)); //Spillet skal slutte når denne chest åbnes! Ceo har teksten!

        //Room97: Corridor
//        room97.east = null;
//        room97.west = null;
//        room97.south = room6;
//        room97.north = room21;
        //Room98: Corridor
//        room98.east = null;
//        room98.west = null;
//        room98.south = room6;
//        room98.north = room21;
        //Room99: Corridor
//        room99.east = null;
//        room99.west = null;
//        room99.south = room6;
//        room99.north = room21;
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
                } else if (currentRoom.west.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.west.getRoomName() + " is locked. Find the key!";

                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.west;
                }
                break;
            case "east":
                if (currentRoom.east == null) {
                    print = "\n***You hit a wall***\n";
                } else if (currentRoom.east.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.east.getRoomName() + " is locked. Find the key!";

                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.east;
                }
                break;
            case "north":
                if (currentRoom.north == null) {
                    print = "\n***You hit a wall***\n";
                } else if (currentRoom.north.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.north.getRoomName() + " is locked. Find the key!";

                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.north;

                }
                break;
            case "south":
                if (currentRoom.south == null) {
                    print = "\n***You hit a wall***\n";

                } else if (currentRoom.south.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.south.getRoomName() + " is locked. Find the key!";

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
            player.setHp(player.getHp() - (currentRoom.getMonster().getMonsterInterface().getDamage() - calculateMonsterDamage()));
            print = "As you enter the " + currentRoom.getRoomName() + ", you encounter " + currentRoom.getMonster().getName() + " - " + currentRoom.getMonster().getDescription() + ".\n"
                    + currentRoom.getMonster().getName() + " attacks you " + currentRoom.getMonster().getMonsterInterface().getTaunt() + "\nYou recive " + (currentRoom.getMonster().getMonsterInterface().getDamage() - calculateMonsterDamage()) + " damage!"
                    + " - You now have " + player.getHp() + "HP left.";

        } else if (print.equals("") && !hasDied) {

            print = "You are now standing in the " + currentRoom.getRoomName() + ". " + currentRoom.getDescription() + "\n" + currentRoom.itemLookup(textGen.generateItemLookupText()) + currentRoom.chestLookup(textGen.generateChestLookupText());

        }

        printer(print);
        checkHp();

    }

    /**
     * Method used to unlock the rooms around you.
     */
    public void unlockRoom() {

        boolean keyNotUsed = true;

        if (currentRoom.west != null) {

            if (currentRoom.west.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.west.getRoomName())) {

                currentRoom.west.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.west.getRoomName() + ", that is located west of you.\n");
            }

        }
        if (currentRoom.east != null) {

            if (currentRoom.east.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.east.getRoomName())) {

                currentRoom.east.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.east.getRoomName() + ", that is located east of you.\n");
            }

        }
        if (currentRoom.north != null) {

            if (currentRoom.north.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.north.getRoomName())) {

                currentRoom.north.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.north.getRoomName() + ", that is located north of you.\n");
            }

        }
        if (currentRoom.south != null) {

            if (currentRoom.south.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.south.getRoomName())) {

                currentRoom.south.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.south.getRoomName() + ", that is located south of you.\n");
            }

        }
        if (keyNotUsed) {

            printer("You can not use that key here.");

        }

    }

    /**
     * This is the combat system
     *
     * @param command Takes a string with the command.
     */
    public void combatSystem(String command) {

        if (command.equals("attack")) {

            currentRoom.getMonster().getMonsterInterface().setHp(currentRoom.getMonster().getMonsterInterface().getHp() - player.getDamage());
            player.setHp(player.getHp() - calculateMonsterDamage());

            printer("You hit " + currentRoom.getMonster().getName() + " for " + player.getDamage() + "! " + currentRoom.getMonster().getMonsterInterface().getHp() + "HP left."
                    + "\n");

            if (currentRoom.getMonster().getMonsterInterface().getHp() <= 0 && player.getHp() > 0) {

                printer(currentRoom.getMonster().getName() + " has been slayed!\nYou have gained a level, your health has been incrased and fully healed.");
                player.levelUp();
                currentRoom.getMonster().setIsAlive(false);
                inBattle = false;

                currentRoom.dropMonsterItems();

            }
            if (currentRoom.getMonster().isIsAlive()) {

                printer(currentRoom.getMonster().getName() + " attacks you for " + calculateMonsterDamage() + "! You have " + player.getHp() + "HP left!");

            } else {

                printer("You have " + player.getHp() + "HP left!");

                move("");

            }

            checkHp();

        } else if (command.equals("flee")) {

            currentRoom = previousRoom;
            printer("You flee from the enemy, and have returned to " + currentRoom.getRoomName() + ".");
            inBattle = false;

        }

    }

    /**
     * Method used to check player HP.
     */
    public void checkHp() {

        if (player.getHp() <= 0) {

            endGame(2);

        }

    }

    /**
     * Method used to end the game, with different conditions.
     *
     * @param endGamecode
     */
    public void endGame(int endGamecode) {

        if (endGamecode == 1) {

            player.calculateHighscore();
            printer("\n\nWOW, YOU BIG BOY! SO AMAZING :O OH MAH GAAAH GAME O-VA\n " + "Your score: " + player.calculateHighscore() + "\nYou ended the game with a max health of " + player.getTempHp() + " hitpoints." + " Your level was " + player.getLevel() + ", and your base damage was " + player.getStartingDamage() + " and your armor-rating was " + player.getArmor() + ".\n\nYou have the following in your inventory:\n" + player.getInventory() + "\nYou had the following items equipped:\n" + player.equippedItems());
            hasDied = false;
            gameActive = false;

        } else if (endGamecode == 2) {

            player.calculateHighscore();
            printer("\n\nYou have been slayed by " + currentRoom.getMonster().getName() + ", game over!\n" + "Your score: " + player.calculateHighscore() + "\nYou ended the game with a max health of " + player.getTempHp() + " hitpoints." + " Your level was " + player.getLevel() + ", and your base damage was " + player.getStartingDamage() + " and your armor-rating was " + player.getArmor() + ".\n\nYou have the following in your inventory:\n" + player.getInventory() + "\nYou had the following items equipped:\n" + player.equippedItems());
            hasDied = true;
            gameActive = false;

        } else if (endGamecode == 3) {

            player.calculateHighscore();
            printer("\n\nGame over!\n" + "Your score: " + player.calculateHighscore() + "\nYou ended the game with a max health of " + player.getTempHp() + " hitpoints." + " Your level was " + player.getLevel() + ", and your base damage was " + player.getStartingDamage() + " and your armor-rating was " + player.getArmor() + ".\n\nYou have the following in your inventory:\n" + player.getInventory() + "\nYou had the following items equipped:\n" + player.equippedItems());
            hasDied = true;
            gameActive = false;

        }

    }

    /**
     * Method used to calculate how much damage that need to be removed from the
     * monsters attack.
     *
     * @return Returns the amount of damage that need to be removed.
     */
    public int calculateMonsterDamage() {

        double percentageOfAttack;

        percentageOfAttack = ((player.getArmor() / 100.0) * currentRoom.getMonster().getMonsterInterface().getDamage());

        return (int) (percentageOfAttack);

    }

    /**
     * Method used to analyze the input from the player.
     *
     * @param input Takes a string as input with the command from the player.
     */
    public void inputAnalyzer(String input) {

        //This is used for the use command.
        String[] splitString = input.split(" ");

        boolean used = false;

        //If the player is not in battle.
        if (!inBattle) {

            if (input.equalsIgnoreCase("Help")) {
             
                //Send string to printer.
                printer(textGen.getGameText(TextGenerator.GameText.HELP));

                used = true;

            }

            if (input.equalsIgnoreCase("go west") || input.equalsIgnoreCase("west")) {

                move("west");
                used = true;

            } else if (input.equalsIgnoreCase("go east") || input.equalsIgnoreCase("east")) {

                move("east");
                used = true;

            } else if (input.equalsIgnoreCase("go north") || input.equalsIgnoreCase("north")) {

                move("north");
                used = true;

            } else if (input.equalsIgnoreCase("go south") || input.equalsIgnoreCase("south")) {

                move("south");
                used = true;

            } else if (input.equalsIgnoreCase("Take all") || input.equalsIgnoreCase("all") || input.equalsIgnoreCase("pickup") || input.equalsIgnoreCase("take")) {

                printer(player.addItemToInventory(currentRoom.getItems()));
                currentRoom.setItems(null);
                used = true;

            } else if (input.equalsIgnoreCase("chest") || input.equalsIgnoreCase("open chest")) {

                if (currentRoom.getChest() != null) {

                    if (currentRoom.getChest().getLockTypeInterface().isLocked()) {

                        if (player.hasKey(currentRoom.getChest().getLockTypeInterface().getCode())) {

                            if (currentRoom.getChest().isEndGameChest()) {

                                endGame(1);
                                used = true;

                            } else {

                                printer("You unlock the chest...\n" + player.addItemToInventory(currentRoom.getChest().getInventory()));
                                currentRoom.setChest(null);
                                used = true;

                            }

                        } else {

                            printer("You do not have the key for this chest");
                            used = true;

                        }

                    } else {

                        printer(player.addItemToInventory(currentRoom.getChest().getInventory()));
                        currentRoom.setChest(null);
                        used = true;

                    }
                } else {

                    printer("No chest is located in this room.");
                    used = true;

                }

            } else if (splitString[0].equalsIgnoreCase("Equip")) {

                printer(player.equipItem(input.substring(input.indexOf(' ') + 1)));
                used = true;

            }

        }

        //If the player is in battle.
        if (inBattle) {

            if (input.equalsIgnoreCase("Help")) {

                String commands = "While in a battle, you can't move further in the dungeon..!"
                        + "\nAttack: Attacks the enemy in the current room"
                        + "\n\tSyntax: attack"
                        + "\nInventory: Show the items you have in your inventory."
                        + "\n\tSyntax: 'inventory' or 'inv'"
                        + "\nUse: Use an item in your inventory, if you have any."
                        + "\n\tSyntax: use 'itmename"
                        + "\nFlee: Flees to the previous room."
                        + "\n\tSyntax: flee";

                printer(textGen.getGameText(TextGenerator.GameText.HELP_COMBAT));
                used = true;

            } else if (input.equalsIgnoreCase("Attack")) {

                combatSystem("attack");
                used = true;

            } else if (input.equalsIgnoreCase("Flee")) {

                combatSystem("flee");
                used = true;

            }

        }

        //Input that can be used in or out of battle.
        if (input.equalsIgnoreCase("stats") || input.equalsIgnoreCase("show stats")) {

            printer(player.getStats());

        } else if (input.equalsIgnoreCase("inventory") || input.equalsIgnoreCase("inv")) {

            printer("You have the following items in your inventory: " + player.getInventory());

        } else if (splitString[0].equalsIgnoreCase("use")) {

            String temp = player.useItem(input.substring(input.indexOf(' ') + 1));

            if (temp.equalsIgnoreCase("opened")) {

                unlockRoom();

            } else {

                printer(temp);

            }

        }
        
        //Reminding person that the command was unknown.  
        if (!used && hasBeenRun) {
            
            printer("'" +input+"'" +" is a unknown command, type 'help' to get list of available commands.");

        }
        
        hasBeenRun = true;

    }

    /**
     * Print method, handling everything being output.
     *
     * @param toPrinter Takes a String to print.
     */
    public static void printer(String toPrinter) {

        System.out.println(toPrinter);

    }

    public boolean isGameActive() {
        return gameActive;
    }

    public boolean hasDied() {
        return hasDied;
    }

}
