package view;

import control.GameControl;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Game class
 */
public class Game {

    //Initializing and instanciating variables. 
    GameControl gc = new GameControl();
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

        boolean gameActive = true;

        System.out.println("What's your name?");
        String name = sca.next();
        gc.createPlayer(name);
        System.out.println("");

        while (gameActive) {
            System.out.println("Where would you like to move to?");
            String input = sca.next();
            gc.inputAnalyzer(input);
        }
    }

    

}
