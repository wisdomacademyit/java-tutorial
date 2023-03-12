package com.wisdomacademyit.tutorial;

public class Payment {
    private String name;
    private double amount;

    public Payment(double amount) { // One param constructor
        this.amount = amount;
    }

    public Payment(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Payment p = (Payment) obj;
        if(p.name.equals(this.name) && p.amount == this.amount)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
