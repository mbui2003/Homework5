import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemWithBaconTest {

    @Test
    public void testGetPrice() {
        FoodItem fries = new Fries(5.0);
        FoodItem foodItemWithBacon = new FoodItemWithBacon(fries);
        double expectedPrice = 7.0;
        double actualPrice = foodItemWithBacon.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}