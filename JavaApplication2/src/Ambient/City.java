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
    
    public City(int monsters) {
        super(monsters);
    }
    
    public int monstros() {
        return monsters;
    }

    public void setMonsters(int monsters) {
        this.monsters = monsters;
    }
    
}
