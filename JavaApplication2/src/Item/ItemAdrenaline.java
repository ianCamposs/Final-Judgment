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
   

    @Override
    public int usar(Item item, Survivor personagem) {
        int x = personagem.getFear();
        int y = item.getIntensity();
        int w = x-y;
        if(w < 0){
        w = 0;
        personagem.setFear(w);
        }else
            personagem.setFear(w);
        return w;
    }
    
}
