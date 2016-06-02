package view;

import control.GameControl;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Game class
 */
public class Game {

    //Declaring, initializing and instanciating variables. 
    GameControl gc;
    String input;
    private Scanner sca = new Scanner(System.in);

    /**
     * Constructor
     */
    public Game() {
        NewGame();
    }

    /**
     * Method used to start a new game.
     */
    private void NewGame() {
        boolean boolean1 = true;

        while (boolean1) {
            System.out.println("Do you wish to start a new game, or load a save.\nType 'new' to start a new game, or 'load' to load a saved game.");
            String begin = sca.next();

            if (begin.equalsIgnoreCase("new")) {

                System.out.println("\n\n“For every joy there is a price to be paid”\n" +
"\t-Ancient Egyption saying.\n" +
"\n\n" +
"Valley of the Kings, Egypt, summer of 1951.\n" +
"\n\n" +
"After having spent the past 5 years in the Valley of the Kings, you and your expedition have found nothing but broken pots and unfinished masonry.\n" +
"Your hopes of finding an undiscovered tomb like the one that Howard Carter found almost 30 years ago is fading away, just as your financial support\nfrom England and the museum is drying up as the sands that surrounds you. Your workers and people around you are demoralized for not having found anything of significant value"
                        + "\nand more and more of local hard working labors that you’ve hired form around the country are leaving your camp as the days go by to seek their fortune else were.\n" +
"\n" +
"You are beginning to wonder what will force you and your expedition out of the valley: The summer climate of Egypt, which pushes the temperature down in the valley to above 50 Celsius,\n"
                        + "or if the museum will pull their financial support and not commit to another excavation season.\n" +
"\nDays goes by and no sight of progress.\n" +
"\n" +
"While your workers are digging at your latest designated spot, you sit down in your chair overlooking the site and pull up an old note book and a map of the valley from your brief case."
                        + "\nFearing that this dig site won’t yield anything of value as the previous, you start researching where to dig next. You take a look of the map of the valley. It’s an old map, dating back to the early 1900’s,"
                        + "\nbut one that is now filled with hand-written and drawn updates of the valley progress over the past 50 years."
                        + "\nYou glance over the name of the Tombs that have been discovered here: A long line of tombs belonging to Pharos named Ramesse, Seti the Second, Amenhotep the First and many more. \n" +
"\n" +
"\n" +
"The valley of the Kings was founded because the Pharos of ancient Egypt usual burial sites, the Pyramids, were ravaged, desecrated and robbed by tomb robbers even 4000 years ago,"
                        + "\ndisturbing the Pharos grave peace and their journey to an eternal afterlife. "
                        + "\nThe pyramids, such as the ones at the Giza plateau near Cairo, took over 30 years to build and still stands as a proud monument and engineering achievement of the ancient civilization."
                        + "\nIn the valley of kings though, no pyramids were ever build. Instead, the tombs of the pharos were carved into the rock at the bottom of the valley and some tombs could be over 100 meters long,"
                        + "\nmaking twist and turns down towards the main burial chamber itself.\n" +
"\n" +
"\nAll tombs discovered throughout the past hundred years where found empty of treasure and even the pharos mummy themselves… except for one: Tutankhamen Tomb, found by Howard Carter back in 1922.\n" +
"\n" +
"\nWhile reminiscing of the valleys history and purpose, a telegram is handed to you.\n" +
"\n" +
"\n" +
"It states the same as the ones from the previous 2 days:"
                        + "\nIts another report, warning that a sandstorm from the Sahara dessert is heading down towards the valley. "
                        + "\nThe telegrams state that it would be a matter of days before it hits the valley, but by your calculations, it would take weeks before it found its way down here.\n" +
"\n" +
"You crumble the telegram in one hand and toss it aside.\n" +
"\n" +
"The sun is setting and todays work is over. Nothing found… nothing gained.\n" +
"\n" +
"You return to your camp a couple of miles from the valley and heads for your tent at the end of the night, feeling a bit down,"
                        + "\nbut hopeful that tomorrow will bring you the discovery and glory you so desperately seek.\n" +
"\n" +
"That night, you sleep exceptionally well, not knowing that the storm that you predicted wouldn’t hit for another couple of weeks, was now sweeping across the valley and your expedition.\n" +
"\n" +
"The next day, you wake up and upon exiting your tent find your camp in buried in meters of sands, with no sign of life in sight. You keep your calm and notice that while the camp is buried in sand,"
                        + "\nthe storm seems to have moved sand from the valley itself.\n" +
"Thinking your expedition might have headed into the valley, you grab your gear and head for the valley.\n" +
"\n" +
"Getting closer and closer to the heart of the valley, you notice that more and more sands has been removed, possible due to the sandstorm.\n" +
"\n" +
"Then, upon arriving that the heart of the valley, you see something you never thought possible: A giant Pyramid now sits in the middle of the Valley, having been un-buried by the sandstorm. \n" +
"While there is no sight of your expedition, you approach the pyramid and finds a sealed entrance doorway.\n" +
"Standing in front of the entrance, you notice the doorway is sealed with a hieroglyphic inscription:\n" +
"“Tomb of Tal Rasha”\n" +
"\n" +
"Your thoughts are speeding inside your brain with all kinds of questions, since there has never been any record of a Pharo named “Tal Rasha” in Egyptian history."
                        + "\nBut your eager to find out what lies inside the pyramid gets the better of you and with your tools, you carve a hole big enough to crawl inside the pyramid.\n" +
"Upon entering the pyramid, you light your lighter and spot a convenient placed torch on the left wall just a few meters in front of you. "
                        + "\nYou walk towards the torch and lights it up, but as pull it the torch down from its resting place, you hear a giant slab of rock coming down from the ceiling behind you, blocking the way you came in from.\n" +
"\n" +
"There is no way out. \n" +
"Your are now trapped inside this ancient and strange pyramid.\n" +
"It is now up to you to discover its secrets and find a way out!");
                System.out.println("\nYou suddenly feel a rush a air coming from the adjacent rooms and for one second,\n"
                        + "you believed to have someone (or something) whispereing: \"Who are you\"?\n\n ");
                System.out.println("\n\nYou answer the whisper with a softspoken reply:");
                gc = new GameControl(sca.next());

                System.out.println("\nAnother breath of wind rushes through the pyramid, but his time no voices... Perhaps it was just your imagination.");
                System.out.println("Type 'help' to show a list of available commands.");
                
                boolean1 = false;

            } else if (begin.equalsIgnoreCase("load")) {

                load();
                
                boolean1 = false;
                
                System.out.println("Load successfull");
                
            }
            
            if(boolean1){
                
                System.out.println("Please choose a valid commmand!");
                
            }
            
        }

        
        

        while (gc.isGameActive() == true) {

            input = sca.nextLine();

            if (input.equalsIgnoreCase("save")) {

                save();

            } else if (input.equalsIgnoreCase("load")) {

                load();
            }

            gc.inputAnalyzer(input);

        }

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
            save.writeObject(gc);

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

            gc = (GameControl) save.readObject();

            //Closes the input stream.
            save.close();

        } catch (Exception exc) {

            //If there was an error, print the info.
            exc.printStackTrace();

        }

    }

}
