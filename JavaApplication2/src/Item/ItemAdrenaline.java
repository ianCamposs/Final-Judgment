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
    
    int adrenaline = 10;
    
    public ItemAdrenaline(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }
    
    public int getAdrenaline(){
        if(adrenaline < 0)
            throw new IllegalArgumentException("You can not create a item with adrenaline less than 0");
        return adrenaline;
    }
    
    public int UseAdrenaline(Item adrenaline, Survivor personagem, int indice){
        int func = personagem.getFear();
        func = func - 10;
        return func;
    }
    
}
