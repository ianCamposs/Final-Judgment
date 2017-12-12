/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import Personagem.Survivor;

/**
 *
 * @author Usuario
 */
public class PistolAmmo extends Ammunition {

    public PistolAmmo(String name, int weight, int capacity, int intensity, int balas) {
        super(name, weight, capacity, intensity, balas);
    }

    @Override
    public int usar(Item item, Survivor personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
