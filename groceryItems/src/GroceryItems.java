
import java.util.Scanner;

public class GroceryItems {

    public static void main(String[] args) {
        // Requests the user to enter 6 grocery items one by one.
        // For item get the name, discount yes/no and price.
        // Apply discount and also give final total at the end.
        
        double final_price = 0;
        
        for (int i = 1; i <= 6; i++) {
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter item " + i + " name: ");
            String item_name = scn.next();

            System.out.println("Is there any discount on this item? (yes/no)");
            String item_discount = scn.next();

            System.out.println("Enter item " + i + " price: ");
            double item_price = scn.nextDouble();
            
            if("yes".equals(item_discount)){
                double discount_cal = item_price * 10 / 100;
                double discounted_price = item_price - discount_cal;
                System.out.println("Discount applied: New price = " + discounted_price);
                final_price += discounted_price;
            } else{
                final_price += item_price;
            }    
            
        }
        
        System.out.println("Total amount to pay: R" + final_price);

    }

}
