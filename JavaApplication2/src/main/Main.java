package main;

//import Personagem.Athlete;
//import Personagem.Doctor;
import Ambient.City;
import Item.Backpack;
import Item.Guns;
import Item.Item;
//import Item.ItemAdrenaline;
import Item.ItemAntidote;
import Item.ItemHeal;
import Item.Knife;
import Item.Rifle;
import Item.Weapons;
import Personagem.Infected;
import Personagem.Kacthoro;
import Personagem.Panzer;
import Personagem.Screamer;
//import Personagem.Screamer;
import Personagem.Soldier;
import Personagem.Survivor;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        /*
    }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        String a =  entrada.nextLine();
        Survivor personagem = new Soldier(a,30,5,40,50,10);
        Infected dog = new Kacthoro("dog",50,10,10,10,10);
        System.out.println("Equipando itens na mochila: \n");
        personagem.setBackpack(new Backpack(15,40));
        Item m4a1 = new Rifle("m4a1",5,5,5);
        Item potion = new ItemHeal("HP",1,1,5);
        Item knife = new Knife("knife",3,3,5);
        Item antidote = new ItemAntidote("A-INF",1,1,5);
        
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
        System.out.println("\nO personagem encontrou um monstro infectado e se assutou. Seu medo era de: "+ personagem.getFear());
        dog.FearGenerator(dog, personagem);
        System.out.println("O monstro era um katchoro que aumentou o medo do personagem para: "+ personagem.getFear());
        
        System.out.println("Usou pote de hp, alterando seu antigo hp: "+ personagem.getLife());
        personagem.interactItem(potion, personagem);
        System.out.println("Para esse novo hp: "+ personagem.getLife());
        
        System.out.println("Usou pote de anti-infecção, alterando sua antiga infecçao: "+ personagem.getInfection());
        personagem.interactItem(antidote, personagem);
        System.out.println("Para essa nova qntde de infecção: "+ personagem.getInfection());
        */
        
        Survivor personagem = new Soldier("a",100,5,40,50,10);
        Item arma = new Rifle("ar",10,7,8);
        arma.usar(arma, personagem);
        int x;
        int contM = 0;
        int monst1;
        int monst2;
        int itemdesejado;
        personagem.setBackpack(new Backpack(15,40));
        City cidade = new City(5);
        Item m4a1 = new Rifle("m4a1",5,5,5);
        Item potion = new ItemHeal("HP",1,1,5);
        Item knife = new Knife("knife",3,3,5);
        Item antidote = new ItemAntidote("A-INF",1,1,5);
        personagem.getBackpack().insertItem(m4a1);
        personagem.getBackpack().insertItem(potion);
        personagem.getBackpack().insertItem(knife);
        personagem.getBackpack().insertItem(antidote);
        do
        {
            System.out.println("Informe a ação que desejas executar:");
            System.out.println("0 para fechar o jogo");
            System.out.println("1 para procurar itens");
            System.out.println("2 para acessar a mochila");
            System.out.println("3 para procurar um inimigo");
            Scanner scanner = new Scanner(System.in);  
            x = scanner.nextInt();
            if(x==1){
                System.out.println("Procurando item");
                personagem.buscar(personagem);
                Random gerador1 = new Random();
                Random gerador2 = new Random();
                if(gerador1.nextInt(100) <= 50 && contM <= cidade.monstros()){
                    monst1 = gerador2.nextInt(3);
                    if(monst1 == 0){
                        Infected grito = new Screamer("AAAAAAAAAAA",50,10,10,10,10);
                        grito.FearGenerator(grito, personagem);
                        comb(personagem, grito, arma);
                    }
                    if(monst1 == 1){
                        Infected cachorro = new Kacthoro("AUUUUUUUUU",50,10,10,10,10);
                        cachorro.FearGenerator(cachorro, personagem);
                        comb(personagem, cachorro, arma);
                    }
                    if(monst1 == 2){
                        Infected tank = new Panzer("BIIIRRRLLL",50,10,10,10,10);
                        tank.FearGenerator(tank, personagem);
                        comb(personagem, tank, arma);
                    }
                    contM++;
                    if(personagem.getLife() <= 0){
                        x = 0;
                    }
                }
            }
            
            if(x==2){
                System.out.println("Acessando a mochila");
                String[] items = personagem.getBackpack().listItems();
                System.out.println(Arrays.toString(items));
                int b;
                System.out.println("Para remover um item, digite 1");
                System.out.println("Para usar um item, digite 2");
                b = scanner.nextInt();
                if(b==1){
                    System.out.println("informe o índice do item que desejas remover:");
                    int aux = scanner.nextInt();
                    personagem.getBackpack().removeItem(aux);
                }
                if(b==2){
                    System.out.println("informe o item que desejas usar:");
                    itemdesejado = scanner.nextInt();
                    Item i = personagem.getBackpack().removeItem(itemdesejado);
                    if(i instanceof Item){
                        Item item = (Item) i;
                        item.usar(item,personagem);
                    }
                }
            }
            
            if(x==3){
                System.out.println("Procurando um infectado");
                Random gerador3 = new Random();  
                if(contM <= cidade.monstros()){
                    System.out.println("Um inimigo foi encontrado\n");
                    System.out.println("=========================");
                    monst2 = gerador3.nextInt(3);
                    if(monst2 == 0){
                        Infected grito = new Screamer("gritador",50,10,10,10,10);
                        System.out.println("É um Screamer\n");
                        grito.FearGenerator(grito, personagem);
                        comb(personagem, grito, arma);
                    }
                    if(monst2 == 1){
                        Infected cachorro = new Kacthoro("cachoro",50,10,10,10,10);
                        System.out.println("É um katchoro\n");
                        cachorro.FearGenerator(cachorro, personagem);
                        comb(personagem, cachorro, arma);
                    }
                    if(monst2 == 2){
                        Infected tank = new Panzer("panzer",50,10,10,10,10);
                        System.out.println("É um Panzer\n");
                        tank.FearGenerator(tank, personagem);
                        comb(personagem, tank, arma);
                    }
                    contM++; 
                    if(personagem.getLife() <= 0){
                        x=0;
                    }
                }else{
                    System.out.println("todos os monstros da área já foram mortos");
                }
            }
        }while (x!=0);
        
       
        
    }
    public static void comb(Survivor personagem, Infected monster, Item arma){
           int c = 1;
           while(c != 0){
           Random value = new Random();
           int num = value.nextInt(50);
           if((num%2 == 0)||(num <= 20) ){
               personagem.atacar(monster, arma);
               System.out.println("==============ATAQUE==============\n");
               System.out.println("o personagem atacou o monstro.\n");
           }else{
               monster.atacar(personagem);
               System.out.println("==============DEFESA==============\n\n");
               System.out.println("o monstro atacou o personagem.\n");
           }
           int x = personagem.getLife();
           int y = monster.getLife();
           System.out.println("=> a vida do personagem é:"+x+"\n");
           System.out.println("=> a vida do infectado é:"+y+"\n");
           if(x <= 0 || y <= 0){
               c = 0;
           }
           }        
    }
}
//fala um a pra vc ver
   
 /*
        System.out.println("Digite o nome do seu personagem: ");
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
        NÃO DEU CERTO ISSO ACIMA, MAS QUANDO FOR IMPLEMENTAR NO PROGRAMA, VAI SER ALGO ASSIM MAS COM UMA CLASSE MENU PARA FAZER ISSO.
================================================================================================================================================    
BASICO DO COMBATE
        System.out.println("Combate, vida do dog: "+ dog.getLife());
        int x = personagem.getPrimaria().getIntensity();
        int y = dog.getLife();
        int z = y-x;                                            TODO: FALTA COLOCAR A PRECISAO, INTERFACE NO COMBATE ENTRE PERSONAGEM E MONSTRO.
        dog.setLife(z);
        System.out.println("Vida final: "+ dog.getLife());
        */