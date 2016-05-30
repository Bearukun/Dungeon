/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Ceo
 */
public class Game {

    GameControl gc = new GameControl();

    private Scanner sca = new Scanner(System.in);

    public Game() {
        NewGame();
    }

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
