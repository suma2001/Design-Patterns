package StrategyPattern.order;

import StrategyPattern.strategies.PayStrategy;

public class Order {
    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }
}
