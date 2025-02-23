//Arnav Madavaram
//lab12
//Goal of the lab: to build a basic credit card software.


public class CreditCard {
    private Money balance;
    private Person owner;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.balance = new Money(0); // Initialize balance to zero
        this.owner = owner;
        this.creditLimit = new Money(creditLimit); // Use copy constructor for creditLimit
    }

    // Accessor method for owner information
    public String getPersonals() {
        return owner.toString();
    }

    // Accessor method for balance
    public Money getBalance() {
        return new Money(balance); // Use copy constructor to return a new Money object
    }

    // Accessor method for creditLimit
    public Money getCreditLimit() {
        return new Money(creditLimit); // Use copy constructor to return a new Money object
    }

    // Charge method
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
        } else {
            System.out.println("Credit limit exceeded. Charge denied.");
        }
    }

    // Payment method
    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}