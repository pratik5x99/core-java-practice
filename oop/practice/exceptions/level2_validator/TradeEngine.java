package oop.practice.exceptions.level2_validator;

public class TradeEngine {
    public void executeTrade(String ticker, double accountBalance, double tradeCost) throws InsufficientBalanceException{
        if(tradeCost>accountBalance) throw new InsufficientBalanceException("Insufficient Balance");

    }
}
