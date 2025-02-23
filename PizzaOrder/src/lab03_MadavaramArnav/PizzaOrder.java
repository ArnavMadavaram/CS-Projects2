
/************
* Arnav Madavaram
* Lab 3
* 01-28-2024
* Making a simple program to get a pizza order.
**/
package lab03_MadavaramArnav;

import java.util.Scanner;

public class PizzaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		String firstname;
		boolean Discount = false;
		int inches;
		char crustType;
		String Crust = "Hand-tossed";
		double cost = 12.99;
		final double TAX_RATE = 0.8;
		double tax;
		char choice;
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
		if (inches == 12) {
			cost = 12.99;
		}
		if (inches == 14) {
			cost = 14.99;
		}
		if (inches == 16) {
			cost = 16.99;
		}

		System.out.print("Name: ");
		System.out.println(firstname);
		System.out.print(cost);
	}

}
