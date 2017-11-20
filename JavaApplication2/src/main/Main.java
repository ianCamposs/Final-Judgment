package main;

//import Personagem.Athlete;
//import Personagem.Doctor;
import Item.Backpack;
import Item.Guns;
import Item.Item;
import Item.ItemAntidote;
import Item.ItemHeal;
import Item.Knife;
import Item.Rifle;
import Item.Weapons;
import Personagem.Infected;
import Personagem.Screamer;
import Personagem.Soldier;
import Personagem.Survivor;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        String a =  entrada.nextLine();
        
        Survivor personagem = new Soldier(a,30,1,40,50,10); // CRIANDO OBJETO PERSONAGEM SURVIVOR
        Infected screamer = new Screamer("screamer",50,10,10,10,10); //CRIANDO OBJETO SCREAMER INFECTED
        
        System.out.println("Equipando itens na mochila: \n");
        
        personagem.setBackpack(new Backpack(15,40));
        
        Item m4a1 = new Rifle("m4a1",5,5);
        Item potion = new ItemHeal("HP",1,1);
        Item knife = new Knife("knife",3,3);
        Item antidote = new ItemAntidote("A-INF",1,1);
        
        personagem.getBackpack().insertItem(m4a1);
        personagem.getBackpack().insertItem(potion);
        personagem.getBackpack().insertItem(knife);
        personagem.getBackpack().insertItem(antidote);
        
        System.out.println("Os seguintes itens foram guardados na mochila: ");
        
        String[] items = personagem.getBackpack().listItems();
        System.out.println(Arrays.toString(items));
        
        Item i = personagem.getBackpack().removeItem(0);
        if(i instanceof Guns){
            Guns guns = (Guns) i;
            guns.EquipGun(personagem);
        } else
                System.out.println("Este item não é equipavel.");
        
        Item j = personagem.getBackpack().removeItem(1);
        if(j instanceof Weapons){
            Weapons weapon = (Weapons) j;
            weapon.EquipWeapon(personagem);
        }else
            System.out.println("Este item não é equipavel.");
        
        System.out.println("O personagem equipou 2 itens: \n");
        System.out.println("Arma primaria: "+ personagem.getPrimaria().getItemName());
        System.out.println("Arma secundaria: "+ personagem.getSecundaria().getItemName());
        
    }
    
    
}
 /*System.out.println("Digite o nome do seu personagem: ");
        String a =  entrada.nextLine();
        System.out.println("Digite qual classe do seu personagem: ");
        String b = entrada.nextLine();
        
        if(b.equals("Soldier")){
        Survivor personagem = new Soldier(a,30,1,40,50,10); //nome,vida,infeccao,precisao,agilidade,medo.
        }else if(b.equals("Doctor")){
            Survivor personagem = new Doctor(a,30,1,40,50,10);
        }else if(b.equals("Athlete")){
            Survivor personagem = new Athlete(a,30,1,40,50,10);
        }
        NÃO DEU CERTO ISSO ACIMA, MAS QUANDO FOR IMPLEMENTAR NO PROGRAMA, VAI SER ALGO ASSIM MAS COM UMA CLASSE MENU PARA FAZER ISSO.*/ 