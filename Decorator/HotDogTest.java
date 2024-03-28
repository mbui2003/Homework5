import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotDogTest {

    @Test
    public void testGetPrice() {
        FoodItem hotDog = new HotDog(10.0);
        double expectedPrice = 10.0;
        double actualPrice = hotDog.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}