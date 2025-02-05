package fr.epita.bank.datamodel;

public class SavingsAccount extends Account {
    public double interestRate;


    public SavingsAccount(Double balance, Customer customer) {
        super(balance, customer);
        this.interestRate = interestRate;

    }
    // Getter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter for interestRate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        double interest = getBalance();

    }

}