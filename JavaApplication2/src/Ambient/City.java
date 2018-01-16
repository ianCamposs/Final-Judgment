/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ambient;

/**
 *
 * @author ian
 */
public class City extends Ambient {
    
    public City(String name, int monsters, int items) {
        super(name, monsters, items);
    }
    
    public int monstros() {
        return monsters;
    }
}
