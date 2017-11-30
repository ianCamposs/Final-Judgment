
package Item;

import Personagem.Survivor;

public abstract class Item {
    /**
     * intensity serve para tanto o ataque das armas quanto a restauração dos atributos do personagem
     * Ex:
     *      Se itemheal tiver intensidade 10, vai curar em 10 a vida do personagem.
     *      Ja se a arma tiver intensidade 10, vai tirar 10 de dano do monstro atacado.
     */
    private String itemName;
    private int weight;
    private int capacity;
    private int intensity;
    
    public Item(String name,int weight,int capacity,int intensity){
        if(weight < 0)
            throw new IllegalArgumentException("You can not create a item with weight less than 0");
        if(capacity < 0)
            throw new IllegalArgumentException("You can not create a item with capacity less than 0");
        if(intensity < 0)
            throw new IllegalArgumentException("You can not create a item with intensity less than 0");
        this.itemName = name;
        this.weight = weight;
        this.capacity = capacity;
        this.intensity = intensity;
    }
   
    public String getItemName(){
        return itemName;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getIntensity(){
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
   
    public abstract int usar(Item item, Survivor personagem);
}
