public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount(double interestRate) {
        super(); // Initialize the superclass (BankAccount) part of this object
        this.interestRate = interestRate;
    }

    // Overriding the withdrawal method to include overdraft functionality
    @Override
    public void withdrawal(double amount) {
        if (amount > getBalance()) {
            super.withdrawal(amount + 30); // Apply overdraft fee
            System.out.println("Overdraft! A $30 fee has been charged.");
        } else {
            super.withdrawal(amount);
        }
    }

    // Display account information including interest rate
    public void displayAccount() {
        super.accountSummary(); // Display superclass account information
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Getters and setters for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
