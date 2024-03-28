import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {

    @Test
    public void testGetPrice() {
        FoodItem burger = new Burger(10.0);
        double expectedPrice = 10.0;
        double actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}