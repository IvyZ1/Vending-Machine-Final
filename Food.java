public class Food extends Items {
    
    /**instance variables for Food class, if food is a large size. */
    private Boolean large;
    
    /**
     * Constructor for the Food class.
     *
     * @param name The items name.
     * @param cost The items cost.
     * @param quantity The # of a certain item available.
     * @param large If its a larger size.
     */
    public Food(String name, double cost, int quantity, Boolean large)
    {
        super(name, cost, quantity);
        this.large = large;
    }
    public Food(String name, double cost)
    {
        super(name, cost, 10);
        this.large = false;
    }
    
}
