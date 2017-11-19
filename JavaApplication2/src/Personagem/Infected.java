
package Personagem;


public abstract class Infected {
    
   private int life; 
   private int attack;
   private int defense;
   private int infection;
   private int agility;
   
   public Infected(int life,int attack,int defense,int inffection, int agility){
       this.life = life;
       this.attack = attack;
       this.defense = defense;
       this.infection = inffection;
       this.agility = agility;
   } 
   public int getLife(){
        return life;
    }
   
   public int getAttack(){
       return attack;
   }
   
   public int getDefense(){
       return defense;
   }
     
   public int getInfection(){
       return infection;
   }
    
   public int getAgility(){
       return agility;
   }
}
