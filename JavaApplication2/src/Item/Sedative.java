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
public class Sedative extends Item{
    
    int sedative;
    
    public Sedative(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }
    
    public int getSedative(){
        if(sedative < 0)
            throw new IllegalArgumentException("You can not create a item with sedative less than 0");
        return sedative;
    }
    
    public int UseSedative(int sedative, int fear){
        if(fear < this.sedative){
            fear = 0;
        }else{
            fear = fear - this.sedative;
        }
        return fear;
    }
    
}
