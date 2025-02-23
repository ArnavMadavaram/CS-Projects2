import javax.swing.JOptionPane;

public class UserInterface {
    public String getUserName() {
        return JOptionPane.showInputDialog(null, "Enter your name:");
    }

    public int getNumberOfPizzas() {
        String numberOfPizzasStr = JOptionPane.showInputDialog(null, "How many pizzas would you like to order?");
        if (numberOfPizzasStr == null) {
            return 0; // User canceled order
        }
        try {
            int numberOfPizzas = Integer.parseInt(numberOfPizzasStr);
            if (numberOfPizzas <= 0) {
                userPrompt("Number of pizzas must be a positive integer.");
                return getNumberOfPizzas(); // Retry getting number of pizzas
            }
            return numberOfPizzas;
        } catch (NumberFormatException e) {
            userPrompt("Invalid input. Please enter a valid number.");
            return getNumberOfPizzas(); // Retry getting number of pizzas
        }
    }

    public Pizza getUserOrder(int pizzaNumber) {
        String sizeStr = JOptionPane.showInputDialog(null, " Enter size for Pizza " + pizzaNumber + " (10,12,14,16 (inches)):");
        if (sizeStr == null) {
            return null; // User canceled order
        }
        int size = Integer.parseInt(sizeStr);

        String crust = JOptionPane.showInputDialog(null, "Enter crust for Pizza " + pizzaNumber + " (Hand-Tossed, Thin-Crust, Deep-Dish):");
        if (crust == null) {
            return null; // User canceled order
        }

        String toppingsStr = JOptionPane.showInputDialog(null, "Enter toppings for Pizza " + pizzaNumber + " (Hand-Tossed, Thin-Crust, Deep-Dish) separated by commas:");
        if (toppingsStr == null) {
            return null; // User canceled order
        }
        String[] toppings = toppingsStr.split(",");

        return new Pizza(size, toppings, crust);
    }

    public void userPrompt(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}