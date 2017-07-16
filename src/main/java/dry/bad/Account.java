package dry.bad;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Account {

    private double balance;
    private Date lastTransactionDate;
    private ArrayList<Transaction> transactionList;

    public Account() {
        this.balance = 0;
        this.lastTransactionDate = null;
        this.transactionList = new ArrayList<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void credit(double amount) {
        balance -= amount;
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        transactionList.add(new Transaction(date, -amount));
        lastTransactionDate = date;
    }

    public void debit(double amount) {
        balance += amount;
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        transactionList.add(new Transaction(date, amount));
        lastTransactionDate = date;
    }

}
