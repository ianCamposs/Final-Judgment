package Personagem;

public abstract class Survivor {
    
   private String name;
   private int life;
   private int attack;
   private int defense;
   private int inffection;
   private int precision;
   private int hunger;
   private int agility;

   
   private int setLife(int life){
       return this.life;
   }
   
   public int getLife(){
        return life = 100 ;
    }
   
   private int setAttack(int attack){
       return this.attack;
   }
   
   public int getAttack(){
        return attack = 0;
    }
   
   private int setDefense(int defense){
       return this.defense;
   }
   
   public int getDefense(){
       return defense = 0;
   }
   
   private int setInffection(int inffection){
       return this.inffection;
   }
   
   public int getInffection(){
       return inffection = 1;
   }
   
   private int setPrecision(int precision){
       return this.precision;
   }
   
   public int getPrecision(){
       return precision = 25;
   }
   
   private int setHunger(int hunger){
       return this.hunger;
   }
   
   public int getHunger(){
       return hunger = 0;
   }
  
   private int setAgility(int agility){
       return this.agility;
   }
   
   public int getAgility(){
       return agility = 25;
   } 
}
