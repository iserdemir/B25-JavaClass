package day31_Constructors;

public class BankAccount {
    public String accountHolder, accountNumber;
    public double balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
       // this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder = '" + accountHolder + '\'' +
                ", accountNumber = '" + accountNumber + '\'' ;

    }
    public void checkBalance(){

        System.out.println("$" + balance);
    }
    public void deposit(double money){
        if (money<=0){
            System.err.println("Depositing amount can not be zero or negative ");
        }else{
            balance += money;
            System.out.println("Your new balance is: $" + balance);
        }

    }
    public void withdraw(double out){
        if (out>balance){
            System.out.println("Your balance isn't enough for th is money! Your balance: $" + balance);
        }else{
            balance -= out;
            System.out.println("Your new balance: $" + balance);
        }
    }

}
