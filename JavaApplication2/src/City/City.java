/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package City;

import Personagem.Infected;

/**
 *
 * @author 201604940043
 */
public abstract class City {
    
    String name;
    Infected monster; // falta ver se é isso mesmo que tem que fazer, se vai ser public/private/protected...
    int items;
    
    public String setName(){
        return this.name;
        
    }
    
    public int setItems(){
        return this.items;
    }
    
    
    
    
    
    
    
    
    
}
