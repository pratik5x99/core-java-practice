package oop.practice.financial_engine;

public enum OrderAction {
    BUY{
        @Override
        public double calculateSettlement(double price,int quantity){
            return (price*quantity)+15;
        }
    },
    SELL{
        @Override
        public double calculateSettlement(double price,int quantity){
            return (price*quantity)*0.98;
        }
    };
    public abstract double calculateSettlement(double price,int quantity);

}
