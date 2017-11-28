/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import Personagem.Survivor;

/**
 *
 * @author ian
 */
public class ItemAdrenaline extends Item{
    
    
    
    public ItemAdrenaline(String name, int weight, int capacity, int intensity) {
        super(name, weight, capacity, intensity);
    }
   
    
    public int UseAdrenaline(Item adrenaline, Survivor personagem, int indice){
        int func = personagem.getFear();
        func = func - 10;
        return func;
    }
    
}
