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
    
    int balas;
    public Ammunition(String name, int weight, int capacity, int intensity, int balas) {
        super(name, weight, capacity, intensity);
        this.balas = balas;
    }

    public int getBalas() {
        return balas;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }
    
    
}
