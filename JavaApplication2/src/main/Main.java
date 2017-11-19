package main;

//import Personagem.Athlete;
//import Personagem.Doctor;
import Personagem.Infected;
import Personagem.Screamer;
import Personagem.Soldier;
import Personagem.Survivor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
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
        
        System.out.println("Digite o nome do seu personagem: ");
        String a =  entrada.nextLine();
        
        Survivor personagem = new Soldier(a,30,1,40,50,10); // CRIANDO OBJETO PERSONAGEM SURVIVOR
        Infected screamer = new Screamer("screamer",50,10,10,10,10); //CRIANDO OBJETO SCREAMER INFECTED
        
        System.out.println("Fear1: "+ personagem.getFear());             // INICIALMENTE O MEDO DO PERSONAGEM ERA 10.
        screamer.FearGenerator(screamer, personagem);                   //MEDO CAUSADO PELO INFECTED SCREAMER PARA O SURVIVOR PERSONAGEM
        System.out.println("Fear2: "+ personagem.getFear());            // APÓS O MEDO CAUSADO PASSOU A SER 20.
    }
    
    
}
