package fr.epita.bank.datamodel;
import java.math.BigDecimal;

public class StockOrder {
     BigDecimal unitPrice;
     int quantity;
     double commission;
     Stock stock;
     InvestmentAccount account;


}