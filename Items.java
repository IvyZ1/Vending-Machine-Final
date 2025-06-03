public class Items {
    
    /** instance variables for items class. */
    private String name;
    private double cost;
    private int quantity;
    
    
     /**
     * Constructor for the Items class.
     *
     * @param name The items name.
     * @param cost The items cost.
     * @param quantity The # of a certain item available.
     */
    public Items(String name, double cost, int quantity)
    {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }
    
    /**
    * @return the name of the item.
    */
    public String getName(){
        return name;
    }
    
    /**
    * @return the cost of the item.
    */
    public double getCost(){
        return cost;
    }
    
    /**
    * @return the # of a certain item available.
    */
    public int getQuantity(){
        return quantity;
    }
    
    /**
    * The string includes the values of the name and cost 
    *
    * @return a string representation of the item
    */
    public String toString(){
        return name + " costs $" + cost;
    }
    
    /**
    * decreases quanitity of items after one is bought 
    */
    public void decrease(){
        if(quantity > 0){
            quantity--;
        }
    }
}
