import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriesTest {

    @Test
    public void testGetPrice() {
        FoodItem fries = new Fries(10.0);
        double expectedPrice = 10.0;
        double actualPrice = fries.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}