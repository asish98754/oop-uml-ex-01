package fr.epita.bank.datamodel;
import java.math.BigDecimal;

public class InvestmentAccount extends Account {
    Customer customer;

    public InvestmentAccount(Double balance, Customer customer) {
        super(balance, customer);
    }
}
