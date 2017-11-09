/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author 201604940043
 */
public class Programmer extends Personagem{
    
    public int getLife(){
        return super.life + 1000;
    }
    
    public int getAttack(){
        return super.attack + 1000;
    }
    
    public int getDefense(){
       return super.defense + 1000;
   }
      
   public int getPrecision(){
       return super.precision + 50;
   }
   
   public int getAgility(){
       return super.agility + 50;
   }  
}
