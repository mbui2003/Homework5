public class FoodItemWithCheese implements FoodItem {
    private static final double CHEESE_PRICE = 0.4;
    private FoodItem decoratedFoodItem;

    public FoodItemWithCheese(FoodItem foodItem) {
        decoratedFoodItem = foodItem;
    }

    @Override
    public double getPrice() {
        return decoratedFoodItem.getPrice() + CHEESE_PRICE;
    }
}