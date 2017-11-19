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
    
    public int Heal(int heal, int life , int infection){
        if(life == 100){
            System.out.print("Your life is already full!");
        }else{
            int curar;
            curar = life + heal + infection;
            if ((curar-100) == 0){
                life = curar-infection;
            } else {
                heal = curar - 100;
                curar = curar - heal;
                life = curar-infection;
                }
            }  
        return life;
    }           
}
