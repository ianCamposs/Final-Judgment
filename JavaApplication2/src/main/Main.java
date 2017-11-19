package main;

import Personagem.Infected;
import Personagem.Screamer;
import Personagem.Soldier;
import Personagem.Survivor;

public class Main {

    public static void main(String[] args) {
        Survivor personagem = new Soldier(30,1,40,50,10);
        Infected screamer = new Screamer(50,10,10,10,10);
        System.out.println("Fear1: "+ personagem.getFear());
        screamer.FearGenerator(screamer, personagem);
        System.out.println("Fear2: "+ personagem.getFear());
    }
    
    
}
