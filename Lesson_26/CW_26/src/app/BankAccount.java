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
        System.out.println(iban + " " + owner.personToString() +
                " Счет открыт:" + open.dateToString() + " Баланс:" + balance );

    }
}