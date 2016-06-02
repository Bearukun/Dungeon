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

                System.out.println("What's your name?");
                gc = new GameControl(sca.next());

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
