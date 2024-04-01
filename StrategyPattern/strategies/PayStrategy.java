package StrategyPattern.strategies;

/**
 * Common interface for all strategies
 */

public interface PayStrategy {
    boolean pay(int pamentAmount);
    void collectPaymentDetails();
}