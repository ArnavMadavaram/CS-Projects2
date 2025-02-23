import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class MiniATM {
    public static void main(String[] args) throws FileNotFoundException {
        int AccountNumber = 1234567;
        int PIN = 1234;
        double AccountBalance = 100.00;
        String EnteredAccountNumber = JOptionPane.showInputDialog(null, "Please Enter your Account Number: ", "Acount Number", JOptionPane.OK_CANCEL_OPTION);
        int AccountNumberInput = Integer.parseInt(EnteredAccountNumber);
        if (AccountNumberInput != AccountNumber) {
            JOptionPane.showMessageDialog(null, "Invalid Account Number, Please try again", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String PINEntered = JOptionPane.showInputDialog(null, "PLease Enter your PIN: ", "PIN", JOptionPane.OK_CANCEL_OPTION);
        int PINInput = Integer.parseInt(PINEntered);
        if (PINInput != PIN) {
            JOptionPane.showMessageDialog(null, "Incorrect PIN", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int choice = JOptionPane.showConfirmDialog(null, "Would you like to use the ATM", "ATM option", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            try (PrintWriter Writer = new PrintWriter("Balance.txt")) {
                Writer.println("Account Number: 1234567");
                Writer.println("Account Balance: " + AccountBalance + "$");
            }
        }
        boolean UserDone = false;
        while (!UserDone) {
            String transactionType = JOptionPane.showInputDialog(null, "Which type of transaction would you like to do? Withdraw (W) or Deposit (D)", "Transaction Type", JOptionPane.OK_CANCEL_OPTION);
            switch (transactionType) {
                case "W":
                    double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdrawal amount:"));
                    if (withdrawAmount <= AccountBalance) {
                        AccountBalance -= withdrawAmount;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient funds!");
                        String done = JOptionPane.showInputDialog("Are you done? (Y/N)").toUpperCase();
                        if (done.equals("Y")) {
                            UserDone = true;
                        }
                    }
                    break;
                case "D":
                    double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount:"));
                    if (depositAmount >= 0) {
                        AccountBalance += depositAmount;
                    }
                    String done = JOptionPane.showInputDialog("Are you done? (Y/N)").toUpperCase();
                    if (done.equals("Y")) {
                        UserDone = true;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid transaction type!");
                    break;
            }
        }

        // Write receipt to file
        try (PrintWriter writer = new PrintWriter(new PrintWriter("TransactionReciept.txt"))) {
            writer.println("Account Number: ****" + AccountNumber % 10000);
            writer.printf("Starting Balance: $%.2f%n", 100.00);
            writer.printf("Amount %s: $%.2f%n", (AccountBalance < 100.00) ? "Withdrawn" : "Deposited", Math.abs(AccountBalance - 100.00));
            writer.println("Thank you for using the ATM! Have a good day.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}


