package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import StrategyPattern.strategies.PayByCreditCard;
import StrategyPattern.strategies.PayByPaypal;
import StrategyPattern.strategies.PayStrategy;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        PayStrategy strategy;
        String paymentMethod = reader.readLine();

        if(paymentMethod.equalsIgnoreCase("PAYPAL")) {
            strategy = new PayByPaypal();
        } else {
            strategy = new PayByCreditCard();
        }

        strategy.collectPaymentDetails();
        strategy.pay(100);
    }
    
}
