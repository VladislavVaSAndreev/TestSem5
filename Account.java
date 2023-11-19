package org.example;

public class Account {

    public int amount=0;




    public void put(int amount) {
        this.amount += amount;
    }

    public void take(int amount) {this.amount -= amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Account = {" + amount + "}";
    }
}


