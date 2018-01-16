package Personagem;

import java.util.Random;
import Item.Backpack;
import Item.Guns;
import Item.Item;
import Item.ItemAdrenaline;
import Item.ItemAntidote;
import Item.ItemHeal;
import Item.Pistol;
import Item.Weapons;
        
public abstract class Survivor {
    
   private String nome;
   private Backpack backpack;
   private int life;
   private double infection;
   private int precision;
   private int agility;
   private int fear;
   private Guns primaria;
   private Weapons secundaria;
 
   public Survivor(String nome, int life,double infection,int precision,int agility,int fear){
       this.nome = nome;
       this.life = life;
       this.infection = infection;
       this.precision = precision;
       this.agility = agility;
       this.fear = fear;
   } 

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

    public void setInfection(double infection) {
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
     
   public double getInfection(){
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

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public void interactItem(Item item, Survivor personagem){
        item.usar(item, personagem);
    }
    
    public void atacar(Infected monstro, Item arma){
        int monsterlife = monstro.getLife();                    // Pego a vida do mosntro
        double monsterdefense = monstro.getDefense()/100;       // Acrescento o porcento da defesa,
        monsterlife += (int) (monsterlife*monsterdefense);      // Faço um calculo para que a defesa influencie na quantidade de vida do monstro
        int survivorattack = arma.getIntensity();               // Declaro também o ataque do personagem
        int damage = monsterlife - survivorattack;              // E entao, é feito o dano à vida auxiliada pela defesa do monstro por meio do ataque do personagem.
        monstro.setLife(damage);                                // Então é declarada a nova vida do monstro, dependendo do calculo feito na equaçao
    }
    
    public void buscar(Survivor personagem, Backpack mochila, Item items){
        Random gerador = new Random();
        Random gerador4 = new Random();
        int it;
        if(personagem.agility >= gerador.nextInt(100)){
            System.out.println("foi encontrado um item");
            it = gerador4.nextInt(4);
            if(it == 0){
                Item antidote = new ItemAntidote("A-INF",1,1,5);
                 personagem.getBackpack().insertItem(antidote);
            }
            if(it == 1){
                Item heal = new ItemHeal("Kit-médico",1,1,5);
                 personagem.getBackpack().insertItem(heal);
            }
            if(it == 2){
                Item adrenalina = new ItemAdrenaline("adrenalina",1,1,5);
                 personagem.getBackpack().insertItem(adrenalina);
            }
            if(it == 3){
                Item arma = new Pistol("DesertEagle",1,1,5);
                personagem.getBackpack().insertItem(arma);
            }
        }else{
            System.out.println("não foi encontrado nenhum item");
        }
    }
    
}

