public class BankSystem3 {
    public static void main(String[] args) {
        BankAccount3[] accounts = new BankAccount3[3];
        accounts[0] = new SavingsAccount3("S101", 1000.0);
        accounts[1] = new CheckingAccount3("C202", 800.0);
        accounts[2] = new FixedDepositAccount3("FD303", 5000.0);

        for (BankAccount3 acc : accounts) {
            acc.showBalance();
            acc.calculateInterest();
            acc.withdraw(600.0);
            acc.showBalance();
            System.out.println("------------");
        }
    }
}
