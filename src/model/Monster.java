/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ceo
 */
public class Monster {
    private String name, description;    
    private int hp, damage, level, id;
    private ArrayList<Item> inventory = new ArrayList();
}
