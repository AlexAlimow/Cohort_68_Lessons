package app.model;

public class Account {
   private String iban;
   private Person owner;
   private double balance;

    public Account(String iban, Person owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", owner=" + owner +
                ", balance=" + balance +
                '}';
    }
}
