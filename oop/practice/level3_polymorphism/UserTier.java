package oop.practice.level3_polymorphism;

public enum UserTier implements Discountable{
    BASIC{
        @Override
        public double applyDiscount(double originalPrice){
            return originalPrice;
        }
    },
    PREMIUM{
        @Override
        public double applyDiscount(double originalPrice){
            return 0.9*originalPrice;
        }
    },
    VIP{
        @Override
        public double applyDiscount(double originalPrice){
            return 0.8*originalPrice;
        }
    }
}
