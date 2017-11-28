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
public abstract class Ammunition extends Item {
    
    public Ammunition(String name, int weight, int capacity, int intensity) {
        super(name, weight, capacity, intensity);
    }
    
}
