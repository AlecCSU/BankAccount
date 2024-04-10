public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    /**
     * Constructs a BankAccount object with a zero balance.
     */
    public BankAccount() {
        this.balance = 0.0;
    }

    /**
     * Deposits a specified amount into the bank account.
     * @param amount The amount to deposit. Must be positive.
     */
    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
    }

    /**
     * Withdraws a specified amount from the bank account.
     * @param amount The amount to withdraw. Must be positive and less than or equal to the current balance.
     */
    public void withdrawal(double amount) {
        if(amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient funds for this withdrawal.");
            return;
        }
        this.balance -= amount;
    }

    /**
     *  Setters and getters
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Prints a summary of the bank account information.
     */
    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
    }
}
