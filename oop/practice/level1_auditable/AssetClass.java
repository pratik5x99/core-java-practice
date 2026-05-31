package oop.practice.level1_auditable;

public enum AssetClass {
    EQUITY(true),MUTUAL_FUND(false),GOVERNMENT_BOND(false);
    private boolean isHighRisk;
    private AssetClass(boolean isHighRisk){
        this.isHighRisk = isHighRisk;
    }

    public boolean isHighRisk() {
        return isHighRisk;
    }
}
