public class BankAccount2Test {
    public static void main(String[] args) {
        BankAccount2 myAccount = new BankAccount2("Alice", 1000);

        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.depositMoney(500); // Balance should be 1500
        myAccount.withdrawMoney(200); // Balance should be 1300
        myAccount.withdrawMoney(1500); // Should show invalid withdrawal
    }
}
