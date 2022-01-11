package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Jaylen Brown", "1905");
        System.out.println(account1);
        account1.deposit(10000);
        account1.checkBalance();
        account1.withdraw(11000);
    }
}
