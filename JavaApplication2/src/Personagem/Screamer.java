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
public class Screamer extends Infected{
    
    public Screamer(int life, int attack, int defense, int infection, int agility) {
        super(life+(infection/4), attack+(infection/4), defense+(infection/4), infection, agility);
    }
    
    public void TerribleScream(Infected Screamer,Survivor personagem){
        personagem.getFear(){
        return fear*2;
        }
    }
    
    
    
}
