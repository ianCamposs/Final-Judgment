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
    
    public ItemHeal(String name, int weight, int capacity, int intensity){
        super(name, weight, capacity, intensity);
    }
   /*   
    public int Heal(Survivor personagem){
        int x = personagem.getInfection();
        int y = personagem.getLife();
        if(y == 100){
            System.out.print("Your life is already full!");
        }else{
            int curar;
            curar = y + intensity + x;
            if ((curar-100) == 0){
                y = curar - x;
            } else {
                intensity = curar - 100;
                curar = curar - intensity;
                y = curar-x;
                }
            }  
        personagem.setLife(y);
        return y;
    }     */      

    @Override
    public int usar(Item item, Survivor personagem) {
        //int x = personagem.getInfection();
        int y = personagem.getLife();
        int z = item.getIntensity();
        if(y == 100){
            System.out.print("Your life is already full!");
        }else{
            y += z;
            if(y>100)
                y = 100;
        }
        personagem.setLife(y);
        
        return y;
    }

}
