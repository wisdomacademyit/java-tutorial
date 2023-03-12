package com.wisdomacademyit.tutorial;

public record OnlinePayment(String name, double amount) {
    public OnlinePayment(double amt) { // One param constructor
        this(null, amt);
    }

    public void setAmount(int i) {
        // This is call instance methods
    }

    public static  void test(int i) {
        // it is possible to add static methods
    }
}
