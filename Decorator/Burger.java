public class Burger implements FoodItem {
    private double basePrice;

    public Burger(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}