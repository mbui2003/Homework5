public class RestaurantDriver {
    public static void main(String[] args) {
        FoodItem burger = new FoodItemWithTomato(new FoodItemWithLettuce(new FoodItemWithBacon(new Burger(6.99))));;
        FoodItem fries = new Fries(3.49);
        FoodItem hotDog = new FoodItemWithBacon(new HotDog(4.99));

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        double totalCost = order.calculateTotalCost();

        LoyaltyStatus bronze = new LoyaltyStatus(0.0);
        LoyaltyStatus silver = new LoyaltyStatus(0.05);
        LoyaltyStatus gold = new LoyaltyStatus(0.1);

        totalCost = gold.applyDiscount(totalCost);

        System.out.printf("Total cost after discount: $%.2f\n", totalCost);
    }
}
