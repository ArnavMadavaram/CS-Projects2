//04-14-2024
// Arnav Madavaram Lab-11
// Goal of this lab: being able to code Arrays.
import java.util.Scanner;
import java.util.Arrays;

public class AverageDriver {
    private double[] data; // the array which will contain the scores
    private double mean;   // the arithmetic average of the scores

    // Constructor
    public AverageDriver() {
        // Initialize the array to hold 5 scores
        data = new double[5];
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Loop to prompt the user to enter 5 scores
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter score number " + (i + 1) + ": ");
            // Read the score from the user and store it in the array
            data[i] = input.nextDouble();
        }
        // Close the Scanner object to release system resources
        input.close();
        // Sort the scores in descending order
        selectionSort();
        // Calculate the mean of the scores
        calculateMean();
    }

    // Method to calculate the mean of the scores
    private void calculateMean() {
        // Initialize a variable to hold the sum of scores
        double total = 0;
        // Loop through the scores and calculate the sum
        for (double score : data) {
            total += score;
        }
        // Calculate the mean by dividing the sum by the number of scores
        mean = total / data.length;
    }

    // Method to perform selection sort on the scores
    private void selectionSort() {
        // Sort the scores using the built-in Arrays.sort() method
        Arrays.sort(data);
        // Reverse the order of the sorted array to arrange scores in descending order
        for (int i = 0; i < data.length / 2; i++) {
            double temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
    }

    // Method to represent the object as a String
    public String toString() {
        // Create a StringBuilder to construct the output string
        StringBuilder result = new StringBuilder("Scores in descending order:\n");
        // Append each score to the StringBuilder
        for (double score : data) {
            result.append(score).append("\n");
        }
        // Append the mean to the StringBuilder
        result.append("Mean: ").append(mean);
        // Convert the StringBuilder to a String and return it
        return result.toString();
    }
}


