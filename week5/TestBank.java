package week5;

public class TestBank {
    public static void main(String[] args) {
        SavingAccount sa1 = new SavingAccount("SA123", 1000, 2);
        sa1.deposit(200);
        sa1.withdraw(150);
        sa1.applyInterest();

        System.out.println();

        CurrentAccount ca1 = new CurrentAccount("CA456", 500, 300);
        ca1.deposit(100);
        ca1.withdraw(700);
        ca1.withdraw(300);

        System.out.println();
        SavingAccount sa2 = new SavingAccount("SA123", 1000, 2);
        sa2.withdraw(2000);
    }
}
