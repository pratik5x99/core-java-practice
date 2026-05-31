package oop.practice.level3_polymorphism;

public class Main {
    static void main(String[] args) {
        UserTier[] userTiers = UserTier.values();
        for(UserTier u:userTiers){
            System.out.println(u+" : "+u.applyDiscount(100));
        }
    }
}
