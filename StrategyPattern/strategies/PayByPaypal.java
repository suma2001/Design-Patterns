package StrategyPattern.strategies;

/**
 * Concrete Strategy: Implements Paypal payment method
 */
public class PayByPaypal implements PayStrategy {

    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using PayPal.");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collect user's payment details for PayPal.");
    }
}