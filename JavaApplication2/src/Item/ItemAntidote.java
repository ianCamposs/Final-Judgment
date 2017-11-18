/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import Personagem.Soldier;



/**
 *
 * @author ian
 */
public abstract class ItemAntidote extends Item {
    
    int antidote;
    public Soldier personagem = new Soldier();
    
    public int getAntidote(){
        return antidote;
    }
    
    public ItemAntidote(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }
    
    public int infectioncure(int antidote, int infection){
        return (infection - this.antidote);  
    };
    
}
