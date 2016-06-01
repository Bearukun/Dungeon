package view;

import control.GameControl;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Game class
 */
public class Game {

    //Declaring, initializing and instanciating variables. 
    GameControl gc;
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

        System.out.println("What's your name?");
        gc = new GameControl(sca.next());
        
        System.out.println("Type 'help' to show a list of available commands.");

        while (gc.isGameActive() == true) {
            
            gc.inputAnalyzer(sca.nextLine());
            
        }
        
    }

    

}
