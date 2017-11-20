package Personagem;

import Item.Guns;
import Item.Weapons;
        
public abstract class Survivor {
    
   private String nome;
   private int life;
   private int infection;
   private int precision;
   private int agility;
   private int fear;
   private Guns primaria;
   private Weapons secundaria;
 
   public Survivor(String nome, int life,int infection,int precision,int agility,int fear){
       this.nome = nome;
       this.life = life;
       this.infection = infection;
       this.precision = precision;
       this.agility = agility;
       this.fear = fear;
   }

   public int plusFear(boolean a, int x){
       if (a == true){
           this.fear = this.fear+x;
       }else if (a == false){
           if( this.fear < x){
               this.fear = 0;
           }else
               this.fear = this.fear-x;
       }
       return this.fear;
   };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrimaria(Guns primaria) {
        this.primaria = primaria;
    }

    public void setSecundaria(Weapons secundaria) {
        this.secundaria = secundaria;
    }
   
    public void setLife(int life) {
        this.life = life;
    }

    public void setInfection(int infection) {
        this.infection = infection;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setFear(int fear) {
        this.fear = fear;
    }

    public String getNome() {
        return nome;
    }

    public Guns getPrimaria() {
        return primaria;
    }

    public Weapons getSecundaria() {
        return secundaria;
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

    public int getFear() {
        return fear;
    }

}

