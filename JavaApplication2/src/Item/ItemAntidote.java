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
public class ItemAntidote extends Item {
    
    
    
    public ItemAntidote(String name, int weight, int capacity, int intensity) {
        super(name, weight, capacity, intensity);
    }
    
    /*public int InfectionCure(int antidote, int infection){
        if(infection < super.intensity){
            infection = 0;
        }else{
            infection = infection - super.intensity;
        }
        return infection;
    }
    */

    @Override
    public int usar(Item item, Survivor personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
