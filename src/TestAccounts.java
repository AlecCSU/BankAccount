public class TestAccounts {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        CheckingAccount myAccount = new CheckingAccount(1.5);
        myAccount.setFirstName("John");
        myAccount.setLastName("Doe");
        myAccount.setAccountID(12345);

        // Test deposit and withdrawal
        myAccount.deposit(100);
        myAccount.withdrawal(50);
        myAccount.withdrawal(60); // This should trigger an overdraft fee

        // Display account summary
        myAccount.displayAccount();
    }
}
