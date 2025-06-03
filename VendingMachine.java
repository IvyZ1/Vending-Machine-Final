import java.util.*;
public class VendingMachine {
    
    private ArrayList<Items> layout;
    
     /**
     * Constructor for the VendingMachine class.
     */
    public VendingMachine()
    {
        layout = new ArrayList<Items>();
        Items hersheys = new Food("Hershey's", 1.00, 10, true);
        Items mms = new Food("M & M's", 1.00, 10, true);
        Items snickers = new Food("Snickers", 1.00, 10, true);
        Items skittles = new Food("Skittles", 1.00, 10, true);
        Items reeses = new Food("Reeses Cup", 0.75);
        Items gum = new Food("Gum", 0.5);
        Items gummyBear = new Food("Gummy Bears", 1.00);
        Items popTarts = new Food("Pop-Tarts", 1.00);
        Items oreos = new Food("Oreos", 1.50);
        Items lays = new Food("Lay's Classic", 2.00);
        Items cheetos = new Food("Cheetos", 2.00);
        Items water = new Drink("Water", 1.00);
        Items chexMix = new Food("Chex Mix", 1.00);
        Items trailMix = new Food("Trail Mix", 1.00);
        Items clif = new Food("Clif Bar", 1.00);
        Items pretzels = new Food("Pretzels", 1.00);
        Items redBull = new Drink("Red Bull", 2.00);
        Items coffee = new Drink("Coffee", 4.00);
        Items gatorade = new Drink("Gatorade", 1.50);
        Items dietCoke = new Drink("Diet Coke", 1.50);
        Items coke = new Drink("Coke", 1.50);
        Items sprite = new Drink("Sprite", 1.50);
        Items pepsi = new Drink("Pepsi", 1.50);
        Items lemonade = new Drink("Lemonade", 1.00);
     
        
       

        layout.add(hersheys);
        layout.add(mms);
        layout.add(snickers);
        layout.add(skittles);
        layout.add(reeses);
        layout.add(gum);
        layout.add(gummyBear);
        layout.add(popTarts);
        layout.add(oreos);
        layout.add(lays);
        layout.add(cheetos);
        layout.add(water);
        layout.add(chexMix);
        layout.add(trailMix);
        layout.add(clif);
        layout.add(pretzels);
        layout.add(redBull);
        layout.add(coffee);
        layout.add(gatorade);
        layout.add(dietCoke);
        layout.add(coke);
        layout.add(sprite);
        layout.add(pepsi);
        layout.add(lemonade);
                            
     
        int[] quantities = new int[layout.size()];
        for (int i = 0; i < layout.size(); i++) {
            quantities[i] = layout.get(i).getQuantity();
        }
    }
    
    /**
    * displays the name, cost of a specific item chosen
    *
    * @param i The number corresponding to a item in the vending machine.
    * @return the name and cost of the item. 
    * @return null if invalid number.
    */
    public Items getItem(int i){
        if (i < 0 || i >= layout.size()) {
            return null;
        }
        return layout.get(i);
    }

    /**
    * displays the items in the Vending Machine.
    */
    public void showItems(){
        
        System.out.println(" ____________________________________________________________________________________________________________");
        System.out.println("|  ________________________________________________________________________________________________________  |");
        System.out.println("| |                                                                                                        | |");
        System.out.println("| |                                                 VENDING                                                | |");
        System.out.println("| |                                                 MACHINE                                                | |");
        System.out.println("| |________________________________________________________________________________________________________| |");
        
        
        for(int i = 0; i < layout.size(); i++)
        {
            System.out.print(i + ". " + layout.get(i) + "     ");
            if((i + 1) % 4 == 0)
            {
                System.out.println();
            }
        }
        
        System.out.println("|____________________________________________________________________________________________________________|");
        System.out.println("| ___________________________________________________________________________________________________________|");
        System.out.println("|                           |                                                      |                         |");
        System.out.println("|                           |                       PUSH                           |                         |");
        System.out.println("|___________________________|______________________________________________________|_________________________|");
        System.out.println("|____________________________________________________________________________________________________________|");
    }
    
                         
                     
        
                            
                            
                            
                            
        
                        
    

}
