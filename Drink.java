public class Drink extends Items {
    
    /** instance variables if drink is cold */
    private Boolean cold;
    
    /**
     * Constructor for the Drink class.
     *
     * @param name The items name.
     * @param cost The items cost.
     * @param quantity The # of a certain item available.
     * @param cold If the drink is cold.
     */
    public Drink(String name, double cost, int quantity, Boolean cold)
    {
        super(name, cost, quantity);
        this.cold = cold;
    }
    public Drink(String name, double cost)
    {
        super(name, cost, 10);
        this.cold = true;
    }
}
