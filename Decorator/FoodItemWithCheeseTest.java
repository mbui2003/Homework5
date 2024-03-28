import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemWithCheeseTest {

    @Test
    public void testGetPrice() {
        FoodItem burger = new Burger(5.0);
        FoodItem foodItemWithCheese = new FoodItemWithCheese(burger);
        double expectedPrice = 5.4;
        double actualPrice = foodItemWithCheese.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}