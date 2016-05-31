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

        gc = new GameControl();
        
        boolean gameActive = true;

        System.out.println("What's your name?");
        String name = sca.next();
        gc.createPlayer(name);
        System.out.println("Type 'commands' to show a list of available commands.");

        while (gameActive) {
            String input = sca.nextLine();
            gc.inputAnalyzer(input);
            
        }
        
    }

    

}
