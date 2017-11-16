
package Personagem;

import Personagem.Survivor;

public abstract class Infected {
    
   private int life; 
   private int attack;
   private int defense;
   private int inffection;
   private int precision;
   private int agility;
   
    
   
   public int setLife(int life){
       return this.life;
   }
   
   public int setAttack(int attack){
       return this.attack;
   }
   
   public int setDefense(int defense){
       return this.defense;
   }
   
   public int setInffection(int inffection){
       return this.inffection;
   }
   
   public int setPrecision(int precision){
       return this.precision;
   }
   
   public int setAgility(int agility){
       return this.agility;
   }
   
}
