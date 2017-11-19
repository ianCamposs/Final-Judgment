/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import java.util.ArrayList;

/**
 *
 * @author ian
 */
public class Backpack {
    
    private int limitWeight;
    private int limitCapacity;
    private int actualyWeight;
    private int actualyCapacity;
    private ArrayList<Item> items;
    
    
    public Backpack(int limitWeight, int limitCapacity){
        this.limitWeight = limitWeight;
        this.limitCapacity = limitCapacity;
        items = new ArrayList<>(limitCapacity);
        actualyWeight = 0;
        actualyCapacity = 0;
    }
    
    
}
