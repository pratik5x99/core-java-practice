package oop.practice.level1_auditable;

public class Main {
    public static void main(String[] args) {
        // Pass in the specific enum constant and an amount
        Trade trade = new Trade(AssetClass.EQUITY, 1000);

        if (trade instanceof Auditable) {
            AssetClass asset = trade.getAsset();
            // Now 'asset' is EQUITY, not null!
            System.out.println(asset + " High Risk: " + asset.isHighRisk());
        }
    }
}