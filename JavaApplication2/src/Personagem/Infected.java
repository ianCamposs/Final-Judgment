
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
   
   public int FearGenerator(Infected monster,Survivor personagem){ 
       int func = personagem.getFear();
       if(monster.nome.equals("screamer")){ 
           boolean x = true;
           int y = 10;
           func = personagem.plusFear(x,y);
       } else if(monster.nome.equals("kacthoro")){
                    boolean x = true;
                    int y = 3;
                    func = personagem.plusFear(x,y);
              } else if(monster.nome.equals("panzer")){
                        boolean x = true;
                        int y = 6;
                        func = personagem.plusFear(x,y); 
                       }
       return func;
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
}
