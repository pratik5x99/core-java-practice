package oop.practice.level1_auditable;

public class Trade implements Auditable {
    private AssetClass asset;
    private int amount;

    // Add this constructor!
    public Trade(AssetClass asset, int amount) {
        this.asset = asset;
        this.amount = amount;
    }

    public AssetClass getAsset() {
        return asset;
    }

    public int getAmount() {
        return amount;
    }
}