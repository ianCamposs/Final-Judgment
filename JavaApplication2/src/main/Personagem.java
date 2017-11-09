package main;

public abstract class Personagem {
    
   String name;
   int life;
   int attack;
   int defense;
   int inffection;
   int precision;
   int hunger;
   int agility;

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
   
   public int setHunger(int hunger){
       return this.hunger;
   }
   
   public int setAgility(int agility){
       return this.agility;
   }
}
