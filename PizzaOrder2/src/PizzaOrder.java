import java.util.Scanner;

/************
 * Arnav Madavaram
 * Project - 1
 * 02-18-2024
 * Making a simple program to get a pizza order.
 **/
public class PizzaOrder {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        String firstname;
        boolean Discount = false;
        int inches;
        String crustType;
        String Crust = "Hand-tossed";
        double cost = 12.99;
        final double TAX_RATE = 0.8;
        double tax;
        char choice = 0;
        String input;
        String toppings = "Cheese";
        int numberoftoppings = 0;

        System.out.println("Welcome to Pizza PLanet!");
        System.out.print("Enter Your First Name:");

        firstname = keyboardInput.nextLine();

        if (firstname.equals("Andy")) {
                    Discount = true;
        }
        if (firstname.equals("Sid")) {
                    Discount = false;
        }
        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("10 inches             $10.99");
        System.out.println("12 inches             $12.99");
        System.out.println("14 inches             $14.99");
        System.out.println("16 inches             $16.99");

        System.out.print("Size (in inches):");
        inches = keyboardInput.nextInt();
        if (inches != 10 && inches != 12 && inches != 14 && inches != 16) {
            System.out.println("Invalid Size");
            return;
        }
        if (inches == 10) {
            cost = 10.99;
        }
        else if (inches == 12) {
            cost = 12.99;
        }
        else if (inches == 14) {
            cost = 14.99;
        }
        else if (inches == 16) {
            cost = 16.99;
        }

        System.out.print("Name: ");
        System.out.println(firstname);
        System.out.println(cost);
        System.out.println("What type of crust do you want?: " );
        System.out.println("(H)Hand-tossed, (T)Thin-crust, (D)Deep-dish");
        choice = keyboardInput.next().charAt(0);
        switch (choice) {
            case 'H':
            case 'h':
                Crust = "Hand-tossed";
                break;
            case 'T':
            case 't':
                Crust = "Thin-Crust";
                break;
            case 'D':
            case 'd':
                Crust = "Deep-dish";
                break;
            default:
                System.out.println("Invalid Crust Type. Defaulting to Hand-tossed.");
                Crust = "Hand-tossed";
                break;


        }
        System.out.println("All Pizza's come with Cheese");
        System.out.println("Additional toppings are $1.25 each");
        System.out.println("Choose from Pepperoni, Sausage, Onion, Mushroom");
        System.out.println("Do you want Pepperoni? (Y/N)");
        input = keyboardInput.next();
        if (input.equalsIgnoreCase("Y")) {
            numberoftoppings ++;
            toppings = "pepperoni";
        }
        System.out.println("Do you want Sausage? (Y/N)");
        input = keyboardInput.next();
        if (input.equalsIgnoreCase("Y")) {
            numberoftoppings++;
            toppings = "Sausage";
        }
        System.out.println("Do you want Onion? (Y/N)");
        input = keyboardInput.next();
        if (input.equalsIgnoreCase("Y")) {
            numberoftoppings++;
            toppings = "Onion";
        }
        System.out.println("Do you want Mushroom? (Y/N)");
        input = keyboardInput.next();
        if (input.equalsIgnoreCase("Y")) {
            numberoftoppings++;
            toppings = "Mushroom";
        }


        cost = numberoftoppings * 1.25;

        boolean deliveryChoice = false;
        double deliveryFee = 0.0;
        System.out.println("Do you want the food to be delivered: (D/C)");
        choice = keyboardInput.next().charAt(0);
        deliveryFee = Math.floor(Math.random()*(25-1+1)+1) * 0.5;
        cost += deliveryFee;
        if (Discount == true) {
            cost *= 0.90;
        }
        tax = cost * TAX_RATE;
        double finalcost = cost + (cost * TAX_RATE);
        if (deliveryChoice = true) {
            finalcost += deliveryFee;
        }
        System.out.println("Your order details:");
        System.out.println(inches + " inch pizza");
        System.out.println(Crust + " crust");

        if (deliveryFee > 0) {
            System.out.printf("Delivery Fee: $%.2f%n" , deliveryFee);
        }
        System.out.printf("Tax: $%.2f%n" , tax);
        System.out.println("Total cost: " + finalcost + " $");




    }
}

