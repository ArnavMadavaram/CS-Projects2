package lab08_methods;

import java.util.Scanner;

public class Geometry {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice;

		// Step 1: Create a Scanner object to read input from the keyboard
		// Step 2: Declare variables

		do {
			printMenu(); // Step 3: Call the printMenu() method to display the menu
			choice = keyboard.nextInt(); // Step 4: Read the user's choice

			switch (choice) {
				case 1:
					System.out.print("Enter the radius of the circle: ");
					double radius = keyboard.nextDouble();
					// Step 5: Read the radius input from the user
					System.out.println("The area of the circle is " + circleArea(radius));
					// Step 6: Call the circleArea() method and print the result
					break;
				case 2:
					System.out.print("Enter the length of the rectangle: ");
					double length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle: ");
					double width = keyboard.nextDouble();
					// Step 7: Read the length and width inputs from the user
					System.out.println("The area of the rectangle is " + rectangleArea(length, width));
					// Step 8: Call the rectangleArea() method and print the result
					break;
				case 3:
					System.out.print("Enter the height of the triangle: ");
					double height = keyboard.nextDouble();
					System.out.print("Enter the base of the triangle: ");
					double base = keyboard.nextDouble();
					// Step 9: Read the height and base inputs from the user
					System.out.println("The area of the triangle is " + triangleArea(base, height));
					// Step 10: Call the triangleArea() method and print the result
					break;
				case 4:
					System.out.print("Enter the radius of the circle: ");
					radius = keyboard.nextDouble();
					// Step 11: Read the radius input from the user (for circumference)
					System.out.println("The circumference of the circle is " + circleCircumference(radius));
					// Step 12: Call the circleCircumference() method and print the result
					break;
				case 5:
					System.out.print("Enter the length of the rectangle: ");
					length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle: ");
					width = keyboard.nextDouble();
					// Step 13: Read the length and width inputs from the user (for perimeter)
					System.out.println("The perimeter of the rectangle is " + rectanglePerimeter(length, width));
					// Step 14: Call the rectanglePerimeter() method and print the result
					break;
				case 6:
					System.out.print("Enter the length of side 1 of the triangle: ");
					double side1 = keyboard.nextDouble();
					System.out.print("Enter the length of side 2 of the triangle: ");
					double side2 = keyboard.nextDouble();
					System.out.print("Enter the length of side 3 of the triangle: ");
					double side3 = keyboard.nextDouble();
					// Step 15: Read the lengths of the sides of the triangle from the user
					System.out.println("The perimeter of the triangle is " + trianglePerimeter(side1, side2, side3));
					// Step 16: Call the trianglePerimeter() method and print the result
					break;
				default:
					System.out.println("You did not enter a valid choice.");
			}

			System.out.println("Do you want to exit the program (Y/N)?: ");
		} while (!keyboard.next().equalsIgnoreCase("Y"));

		keyboard.close();
	}

	// Step 17: Define the printMenu() method to display the menu options
	public static void printMenu() {
		System.out.println("This is a geometry calculator");
		System.out.println("Choose what you would like to calculate");
		System.out.println("1. Find the area of a circle");
		System.out.println("2. Find the area of a rectangle");
		System.out.println("3. Find the area of a triangle");
		System.out.println("4. Find the circumference of a circle");
		System.out.println("5. Find the perimeter of a rectangle");
		System.out.println("6. Find the perimeter of a triangle");
		System.out.print("Enter the number of your choice: ");
	}

	// Step 18: Define methods to calculate the area and perimeter of geometric shapes
	public static double circleArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static double rectangleArea(double length, double width) {
		return length * width;
	}

	public static double triangleArea(double base, double height) {
		return 0.5 * base * height;
	}

	public static double circleCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	public static double rectanglePerimeter(double length, double width) {
		return 2 * (length + width);
	}

	public static double trianglePerimeter(double side1, double side2, double side3) {
		return side1 + side2 + side3;
	}
}