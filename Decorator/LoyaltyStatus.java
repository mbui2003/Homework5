public class LoyaltyStatus {
    private double discount;

    public LoyaltyStatus(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double totalCost) {
        return totalCost * (1-discount);
    }
}