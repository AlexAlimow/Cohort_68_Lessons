package app;

public class BankAccount {
    String iban;
    double balance;
    Person owner;
    MyDate open;

    /// "DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
public BankAccount(String ibanN, Person personN, MyDate dateN, double balanceN ){
    iban = ibanN;
    owner = personN;
    open = dateN;
    balance = balanceN;
}
}
