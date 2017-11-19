/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

/**
 *
 * @author ian
 */
public class Kacthoro extends Infected{
    
    public Kacthoro(int life, int attack, int defense, int infection, int agility){
        super(life +(infection/2) , attack+(infection/2), defense+(infection/2), infection, agility+(infection/2));
    }
    
}
