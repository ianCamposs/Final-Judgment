package Personagem;

public abstract class Survivor {
    
   private int life;
   private int infection;
   private int precision;
   private int agility;
   private int fear;
 
   public Survivor(int life,int infection,int precision,int agility,int fear){
       this.life = life;
       this.infection = infection;
       this.precision = precision;
       this.agility = agility;
       this.fear = fear;
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
   
   public int getFear(boolean a, int x){
       if(a == true){
        return fear+x;
       }else    
           if(fear < x){
                    fear = 0;
       }else{
             fear = fear - x;  
           }   
       return fear;
   }
}

