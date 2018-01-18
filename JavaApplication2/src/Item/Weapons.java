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
public abstract class Weapons extends Item{
    
    protected Survivor personagem;
    //this kind of item will need ammunition to use
    public Weapons(String name, int weight, int capacity, int intensity) {
        super(name, weight, capacity, intensity);
    } 
    
    public abstract void EquipWeapon(Survivor personagem);
    
    
}
