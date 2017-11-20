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
    //this kind of item to do damage, will not consume ammunition
    public Weapons(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }

    public abstract void EquipWeapon(Survivor personagem, String maos);
    
}
