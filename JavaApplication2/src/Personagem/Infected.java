
package Personagem;

import Item.Item;

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
   
   public void FearGenerator(Infected monster,Survivor personagem){ 
           boolean x = true;
           int y = monster.Scare();
           int z = personagem.getFear();
           int w = z+y;
           personagem.setFear(w);
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
   
   public abstract int Scare();
   
   public void atacar(Survivor personagem){
        int survivorlife = personagem.getLife();                                            //VIDA PERSONAGEM
        double survivorinfection = personagem.getInfection();                               //INFECÇÃO DO PERSONAGEM
        int calculodedano = (int) (this.attack + this.attack * (this.infection/100));       //EQUAÇAO PRA CALCULAR O DANO QUE SERÁ RETIRADO DA VIDA DO PERSONAGEM
        int damage = survivorlife - calculodedano;                                          //RETIRANDO VIDA DO PERSONAGEM
        personagem.setLife(damage);                                                         //SETANDO NOVA VIDA
        double x = (survivorinfection*(this.infection/100));                                //CALCULO DO VALOR QUE SERÁ USADO PARA ACRESCENTAR NA INFECÇÃO DO PERSONAGEM
        if((x > 0.7)&&(x < 1)){
            x = 1;
        }else if((x > 0)&&(x < 0.5)){                                                                  //ARREDONDAMENTOS
            x = 0.5;
        }   
        double infectando = survivorinfection + x;                                          //INCREMENTANDO O NOVO VALOR DE INFECÇÃO DO PERSONAGEM
        personagem.setInfection(infectando);                                                //SETANDO O MESMO
    }
}
