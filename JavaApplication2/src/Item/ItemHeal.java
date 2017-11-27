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
public class ItemHeal extends Item {
    
    int heal;
    public ItemHeal(String name, int weight, int capacity) {
        super(name, weight, capacity);
    }
    
    public int getHeal(){
        if(heal < 0)
            throw new IllegalArgumentException("You can not create a item with heal less than 0");
        return heal;
    }
    
    public int Heal(int heal, Survivor personagem){
        int x = personagem.getInfection();
        int y = personagem.getLife();
        if(y == 100){
            System.out.print("Your life is already full!");
        }else{
            int curar;
            curar = y + heal + x;
            if ((curar-100) == 0){
                y = curar - x;
            } else {
                heal = curar - 100;
                curar = curar - heal;
                y = curar-x;
                }
            }  
        return y;
    }           

}
