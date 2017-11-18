package Personagem;

public abstract class Survivor {
    
   private int life;
   private int infection;
   private int precision;
   private int agility;
 
   public Survivor(int life,int infection,int precision,int agility){
       this.life = life;
       this.infection = infection;
       this.agility = agility;
   }
   
   public int getLife(){
        return life;
    }
     
   public int getInfection(){
       return infection;
   }
    
   public int getPrecision(){
       return precision;
   }
   
   public int getAgility(){
       return agility;
   } 
}
