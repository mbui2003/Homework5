public class FoodItemWithLettuce implements FoodItem {
    private static final double LETTUCE_PRICE = 0.2;
    private FoodItem decoratedFoodItem;

    public FoodItemWithLettuce(FoodItem foodItem) {
        decoratedFoodItem = foodItem;
    }

    @Override
    public double getPrice() {
        return decoratedFoodItem.getPrice() + LETTUCE_PRICE;
    }
}