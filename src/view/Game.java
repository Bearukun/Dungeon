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

    private Scanner sca = new Scanner(System.in);
    
    public Game() {
        NewGame();
    }
    
    
    private void NewGame(){
        System.out.println("What's your name?");
        String name = sca.next();
        GameControl gc = new GameControl(name);
        
    }
    
    
}
