/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ambient;

/**
 *
 * @author 201604940043
 */
public abstract class Ambient {
    
    String name;
    int monsters; // falta ver se é isso mesmo que tem que fazer, se vai ser public/private/protected...
    int items;
    //Pensei assim, deixa um int monsters, ai esse valor que for passado no parametro 
    //vai ser uma string de monstros que vai ser criado na main :D
    public Ambient(String name, int monsters , int items){
        this.name = name;
        this.monsters = monsters;
        this.items = items;
    }
    
    public String setName(){
        return this.name;
        
    }
    
    public int setMonsters(){
        return this.monsters;
    }
    
    public int setItems(){
        return this.items;
    }
    
    
    
    
    
    
    
    
    
}
