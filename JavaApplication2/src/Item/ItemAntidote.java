/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;



/**
 *
 * @author ian
 */
public class ItemAntidote extends Item {
    
    int antidote;
    
    public int getAntidote(){
        if(antidote < 0)
            throw new IllegalArgumentException("You can not create a item with antidote less than 0");
        return antidote;
    }
    
    public ItemAntidote(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }
    
    public int InfectionCure(int antidote, int infection){
        if(infection < this.antidote){
            infection = 0;
        }else{
            infection = infection - this.antidote;
        }
        return infection;
    }

}
