/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import Personagem.Survivor;

/**
 *
 * @author 201604940043
 */
public class Athlete extends Survivor{ //Rapido
    
    public int getLife(){
        return super.life + 100;
    }
    
    public int getAttack(){
        return super.attack;
    }
    
    public int getDefense(){
       return super.defense;
   }
    
   public int getInffection(){
       return super.inffection + 1;
   }
   
   public int getPrecision(){
       return super.precision + 50;
   }
   
   public int getHunger(){
       return super.hunger;
   }
   
   public int getAgility(){
       return super.agility + 50;
   } 
}
