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
public class Panzer extends Infected{
    
    public Panzer(String nome, int life, int attack, int defense, int infection, int agility){
        super(nome, life+infection, attack+infection, defense+infection, infection, agility);
    }
    
}
