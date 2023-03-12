package com.wisdomacademyit.tutorial;

public class Test {
    public static void main(String[] args) {
        Payment p1 = new Payment("Test-1", 100);
        Payment p2 = new Payment("Test-1", 100);
        p1.setAmount(200);
//        p2.setAmount(300);

        Payment p3 = new Payment(400);


        OnlinePayment op1 = new OnlinePayment("Test-2", 200);
        OnlinePayment op2 = new OnlinePayment("Test-2", 200);

        op1.setAmount(500);

        OnlinePayment op3 = new OnlinePayment(400);
        System.out.println(op3);

    }
}
