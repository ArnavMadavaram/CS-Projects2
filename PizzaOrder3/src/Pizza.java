public class Pizza {
    private int pizzaSize;
    private String pizzaCrust;
    private String[] pizzaToppings;

    public Pizza() {
        pizzaSize = 12;
        pizzaCrust = "Hand Tossed";
        pizzaToppings = new String[]{"Cheese"};
    }

    public Pizza(int size, String[] toppings, String crust) {
        pizzaSize = size;
        pizzaCrust = crust;
        pizzaToppings = toppings;
    }

    // Getters and setters
    public int getPizzaSize() {
        return pizzaSize;
    }

    public String getPizzaCrust() {
        return pizzaCrust;
    }

    public String[] getPizzaToppings() {
        return pizzaToppings;
    }

    public void setPizzaSize(int size) {
        pizzaSize = size;
    }

    public void setPizzaCrust(String crust) {
        pizzaCrust = crust;
    }

    public void setPizzaToppings(String[] toppings) {
        pizzaToppings = toppings;
    }

    public double calculateCost() {
        // Calculate cost based on pizza size, crust, toppings, etc.
        // You can implement this method based on your pricing logic
        // For simplicity, let's assume a fixed cost for now
        return 10.0; // $10 for each pizza
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pizzaSize).append("\" ").append(pizzaCrust).append("\n");
        for (String topping : pizzaToppings) {
            sb.append(topping).append(", ");
        }
        return sb.toString();
    }
}