//Arnav Madavaram
//Project 3
//Goal of this lab: To create a Pizza ordering software with guis.
import java.io.FileWriter;
import java.io.IOException;

public class PizzaOrder {
    private String userName;
    private UserInterface gui;
    private Pizza[] order;
    private double cost;

    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.startOrder();
    }

    public PizzaOrder() {
        gui = new UserInterface();
    }

    public void startOrder() {
        // Get user's name
        userName = gui.getUserName();

        // Get the number of pizzas to order
        int numberOfPizzas = gui.getNumberOfPizzas();
        if (numberOfPizzas <= 0) {
            gui.userPrompt("Invalid number of pizzas. Exiting order.");
            return;
        }

        // Initialize order array
        order = new Pizza[numberOfPizzas];

        // Loop to get pizzas for the order
        for (int i = 0; i < numberOfPizzas; i++) {
            Pizza pizza = gui.getUserOrder(i + 1); // Pass pizza number
            if (pizza == null) {
                gui.userPrompt("Order canceled. Exiting order.");
                return; // User canceled order
            }
            order[i] = pizza;
        }

        // Compute cost
        computeCost();

        // Print receipt
        printReceipt();
    }

    public void computeCost() {
        double totalCost = 0.0;
        for (Pizza pizza : order) {
            if (pizza != null) {
                totalCost += pizza.calculateCost();
            }
        }
        cost = totalCost;
    }

    public void printReceipt() {
        try {
            FileWriter writer = new FileWriter("receipt.txt");
            writer.write("Customer Name: " + userName + "\n");
            writer.write("Order Details:\n");
            for (int i = 0; i < order.length; i++) {
                if (order[i] != null) {
                    writer.write("Pizza " + (i + 1) + ": " + order[i].toString() + "\n");
                }
            }
            writer.write("Total Cost: $" + String.format("%.2f", cost) + "\n");
            writer.close();
            System.out.println("Receipt printed to receipt.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}