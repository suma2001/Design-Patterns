package StrategyPattern.strategies;

public class PayByCreditCard implements PayStrategy {
    
    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using Credit Card.");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collect user's payment details for Credit Card.");
    }
}
