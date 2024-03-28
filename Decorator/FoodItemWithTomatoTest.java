import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemWithTomatoTest {

    @Test
    public void testGetPrice() {
        FoodItem burger = new Burger(5.0);
        FoodItem foodItemWithTomato = new FoodItemWithTomato(burger);
        double expectedPrice = 5.3;
        double actualPrice = foodItemWithTomato.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}