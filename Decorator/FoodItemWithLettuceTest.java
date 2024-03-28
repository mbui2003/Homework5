import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemWithLettuceTest {

    @Test
    public void testGetPrice() {
        FoodItem burger = new Burger(5.0);
        FoodItem foodItemWithLettuce = new FoodItemWithLettuce(burger);
        double expectedPrice = 5.2;
        double actualPrice = foodItemWithLettuce.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}
