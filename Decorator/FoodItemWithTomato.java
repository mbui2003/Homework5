public class FoodItemWithTomato implements FoodItem {
    private static final double TOMATO_PRICE = 0.3;
    private FoodItem decoratedFoodItem;

    public FoodItemWithTomato(FoodItem foodItem) {
        decoratedFoodItem = foodItem;
    }

    @Override
    public double getPrice() {
        return decoratedFoodItem.getPrice() + TOMATO_PRICE;
    }
}