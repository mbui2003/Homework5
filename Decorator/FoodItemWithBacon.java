public class FoodItemWithBacon implements FoodItem {
    private static final double BACON_PRICE = 2.0;
    private FoodItem decoratedFoodItem;

    public FoodItemWithBacon(FoodItem foodItem) {
        decoratedFoodItem = foodItem;
    }

    @Override
    public double getPrice() {
        return decoratedFoodItem.getPrice() + BACON_PRICE;
    }
}