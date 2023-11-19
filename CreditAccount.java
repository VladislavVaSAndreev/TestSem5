package org.example;

public class CreditAccount {

    public double amount=0.0;
    public void put(double amount) {
        this.amount += amount;
    }

    public void take(double amount) {this.amount -= amount+amount*1.01;}

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Account = {" + amount + "}";
    }


    }

