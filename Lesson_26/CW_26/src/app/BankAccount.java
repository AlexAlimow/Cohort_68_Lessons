package app;

public class BankAccount {
    String iban;
    double balance;
    Person owner;
    MyDate open;


    public BankAccount(String iban, Person owner, MyDate open, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.open = open;
        this.balance = balance;
    }
    public void printBankAccount(){
        System.out.println(iban + " " + owner.toString() +
                " Счет открыт:" + open.toString() + " Баланс:" + balance );

    }
    public String toString(){
        return  iban + " " + owner +
                " Счет открыт:" + open + " Баланс:" + balance ;

    }

}