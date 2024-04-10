public class CheckingAccount extends BankAccount {
    private double interestRate;

    /**
     * Constructs a CheckingAccount with a specified interest rate.
     * @param interestRate The interest rate for the account.
     */
    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    /**
     * Withdraws a specified amount from the account. Applies an overdraft fee if the amount exceeds the balance.
     * @param amount The amount to withdraw. Must be positive.
     */
    @Override
    public void withdrawal(double amount) {
        if(amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > getBalance()) {
            super.withdrawal(amount + 30); // Overdraft fee
            System.out.println("Overdraft! A $30 fee has been charged.");
        } else {
            super.withdrawal(amount);
        }
    }

    /**
     * Displays account information, including the interest rate.
     */
    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    /**
     * Getters and setters for interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
