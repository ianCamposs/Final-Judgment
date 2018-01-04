/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

/**
 *
 * @author 201604940043
 */
public class RegistroItems {
    
    private static RegistroItems uniqueInstance;
    
    private RegistroItems(){};
    
    public static RegistroItems getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new RegistroItems();
        }
        return uniqueInstance;
    }
    
    public String[] listItems(){
        String[] itens = new String[actualyCapacity];
        for (int i=0; i<actualyCapacity(); i++) {
            itens[i] = this.items.get(i).getItemName();
        }
        return itens;
    }
}
