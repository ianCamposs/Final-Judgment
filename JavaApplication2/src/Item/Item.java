
package Item;

public abstract class Item {
    
    private String itemName;
    private int weight;
    private int capacity;
    
    public Item(String name,int weight,int capacity){
        if(weight < 0)
            throw new IllegalArgumentException("You can not create a item with weight less than 0");
        if(capacity < 0)
            throw new IllegalArgumentException("You can not create a item with capacity less than 0");
        this.itemName = name;
        this.weight = weight;
        this.capacity = capacity;
    }
    //fusão de itens, pra fazer um mais da hora! FALTA MUDAR PESO E CAPACIDADE TAMBÉM, VAMO VER ISSO HJ NA AULA.
    public ItemHeal FusionItemsHeal(ItemHeal cura1, ItemHeal cura2){
        ItemHeal cura3 = null;
        cura3.heal = cura1.heal + cura2.heal;
        return cura3; 
    }
    
    public ItemAntidote FusionItemsAntidote(ItemAntidote antidote1, ItemAntidote antidote2){
        ItemAntidote antidote3 = null;
        antidote3.antidote = antidote1.antidote + antidote2.antidote;
        return antidote3;
    }
    
    public ItemAdrenaline FusionItemsAdrenaline(ItemAdrenaline adrenaline1, ItemAdrenaline adrenaline2){
        ItemAdrenaline adrenaline3 = null;
        adrenaline3.adrenaline = adrenaline1.adrenaline + adrenaline2.adrenaline;
        return adrenaline3;
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
    
}
