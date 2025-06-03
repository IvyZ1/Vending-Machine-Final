import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MyProgram
{
    /**
    * main method Vending Machine program.
    * 
    * Shows available items from the vending machine, prompts the user to select
    * an item by its number, handles invalid inputs, and processes the order.
    * The user can order multiple items until they choose to exit by entering -1
    * or indicate they are done ordering.
    * 
    * After ordering, the total cost is displayed along with a thank-you message.
    *
 */
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Vending Machine!");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        VendingMachine machine = new VendingMachine();
        
        double totalCost = 0;
        
        while(true){
            
            machine.showItems();
            int num = -1;
        
            try{
                System.out.println();
                System.out.println("Enter the number of the item you want or -1 to exit:");
                num = input.nextInt();
            
            }catch(InputMismatchException e){
                System.out.println("Invalid answer. ");
                input.nextLine();
            }catch(Exception e){
                System.out.println("Unexceptexted error occured.");
            }
            
            if(num == -1){
                System.out.println("Thank You for visiting!");
                break;
            }
            
            Items item = machine.getItem(num);
            if (item == null) {
                System.out.println("Invalid index. Please try again.");
                continue;
            }
        
            if(item.getQuantity() == 0){
                System.out.println("Out of Stock. Please try different item.");
                continue;
            }
            
            item.decrease();
            
        
            System.out.println("You ordered a " + item);
            totalCost += item.getCost();
            
            String empty = input.nextLine();
            
            System.out.println("Is that all (yes/no)?");
            String answer = input.nextLine();
            if(answer.equals("yes")){
                break;
            }
            
        }
        
        System.out.println("Your order costs $" + totalCost);
        System.out.println("Thank You for taking the time to order! Make sure to come again!");
    }
}
