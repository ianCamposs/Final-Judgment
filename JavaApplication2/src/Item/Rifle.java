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
public class Rifle extends Guns{

    
    public Rifle(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }

    @Override
    public void EquipGun(Survivor personagem) {
        personagem.setPrimaria(this);
        this.personagem = personagem;
    }
    
}
