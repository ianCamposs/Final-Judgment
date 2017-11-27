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
public class Sedative extends Item{
    
    int sedative = 10;
    
    public Sedative(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }
    
    public int getSedative(){
        if(sedative < 0)
            throw new IllegalArgumentException("You can not create a item with sedative less than 0");
        return sedative;
    }
    
    public int UseSedative(Item sedativo, Survivor personagem, int indice){
        int func = personagem.getFear();
        func = func - 10;
        return func;
    }
    
}
