
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
