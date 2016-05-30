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
            String move = sca.next();
            movement(move);
        }
    }

    /**
     * Method used to "move" the player around the dungeon.
     *
     * @param move Takes a string, move, that is used to control which way the
     * player move.
     */
    private void movement(String move) {

        gc.setPrevRoom(gc.getCurrentRoom());
        System.out.println("PrevRoom: " + gc.getPrevRoom().getRoomName());

        System.out.println(move);
        if (move.equalsIgnoreCase("North") || move.equalsIgnoreCase("n")) {

            gc.move(move);
            if (gc.getCurrentRoom().equals(gc.getPrevRoom())) {
                System.out.println("***You hit a wall***");
            }

        } else if (move.equalsIgnoreCase("South") || move.equalsIgnoreCase("s")) {

            gc.move(move);
            if (gc.getCurrentRoom().equals(gc.getPrevRoom())) {
                System.out.println("***You hit a wall***");
            }
        } else if (move.equalsIgnoreCase("East") || move.equalsIgnoreCase("e")) {

            gc.move(move);
            if (gc.getCurrentRoom().equals(gc.getPrevRoom())) {
                System.out.println("***You hit a wall***");
            }
        } else if (move.equalsIgnoreCase("West") || move.equalsIgnoreCase("w")) {

            gc.move(move);
            if (gc.getCurrentRoom().equals(gc.getPrevRoom())) {
                System.out.println("***You hit a wall***");
            }

        } else {
            System.out.println("Please enter a direction");
        }

        System.out.println("----" + gc.getCurrentRoom().getRoomName() + "--------");
        System.out.println("------------------------------------------");
        System.out.println(gc.getCurrentRoom().getDescription());
        System.out.println("PrevRoom: " + gc.getPrevRoom().getRoomName());
    }

}
