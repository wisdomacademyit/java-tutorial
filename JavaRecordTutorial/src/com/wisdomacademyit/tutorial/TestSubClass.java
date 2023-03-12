package com.wisdomacademyit.tutorial;

public class TestSubClass extends  OnlinePayment{
    public TestSubClass(String name, double amount) {
        super(name, amount);
    }

    // Can't create a subclass from records, bcz records are final 
}


class Test extends Payment{
    public void test(){
        System.out.println(" this is a test program, ");
    }
}

