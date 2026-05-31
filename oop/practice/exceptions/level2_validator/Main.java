package oop.practice.exceptions.level2_validator;

public class Main {
    static void main(String[] args) {
        TradeEngine tradeEngine = new TradeEngine();
        try{
            tradeEngine.executeTrade("BUY",200,300);
        }
        catch(InsufficientBalanceException e){
            System.err.println(e);
        }
    }

}
