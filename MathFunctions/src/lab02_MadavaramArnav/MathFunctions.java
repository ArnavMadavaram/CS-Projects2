/************
* Arnav Madavaram
* LAB 2
* 01-28-2024
* Calculating the volume of a Sphere.
**/
package lab02_MadavaramArnav;

import java.util.Scanner;

public class MathFunctions {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.out.print("Please enter the diameter of the sphere:");
		Scanner keyboardInput = new Scanner(System.in);
		double Diameter;
		Diameter = keyboardInput.nextDouble();
		double Radius = Diameter / 2;
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(Radius, 3);

		System.out.println("Diameter of the Sphere:" + Diameter);
		System.out.println("Radius:" + Radius);
		System.out.println("Volume:" + volume);

// Part-3.
		final int NUMBER = 2;
		final double SCORE1 = 100;
		final double SCORE2 = 95;
		final int BOILING_IN_F = 212;
		int fToC;
		double average;
		String output;
     // Find an arithmetic average.
		average = (SCORE1 + SCORE2) / NUMBER;
		// missing brackets before and after (SCORE1 + SCORE)
		output = SCORE1 + " and " + SCORE2 + " have an average of " + average;
		System.out.println(output);
    // Convert Fahrenheit temperature to Celsius.
		fToC = (int) ((5.0 / 9.0) * (BOILING_IN_F - 32));
		//Missing Brackets, (int) function and .0's (double notation).
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		// Extra System.out.println()

	}

}
