
package Personagem;

public abstract class Infected {
    
   private String nome; 
   private int life; 
   private int attack;
   private int defense;
   private int infection;
   private int agility;
   
   public Infected(String nome,int life,int attack,int defense,int inffection, int agility){
       this.nome = nome;
       this.life = life;
       this.attack = attack;
       this.defense = defense;
       this.infection = inffection;
       this.agility = agility;
   }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setInfection(int infection) {
        this.infection = infection;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
    
    public String getNome() {
        return nome;
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

   public int FearGenerator(Infected monster,Survivor personagem){ 
       int func = 0;
       if(monster.nome.equals("screamer")){ //TODO: Precisa colocar os outros monstros no gerador de medo com seus respectivos nomes.
           boolean x = true;
           int y = 10;
           func = personagem.plusFear(x,y);
       } else {
       }
       return func;
    }
}
