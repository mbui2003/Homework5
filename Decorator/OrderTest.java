import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testAddItemAndCalculateTotalCost() {
        Order order = new Order();
        order.addItem(new Fries(5.0));
        order.addItem(new FoodItemWithBacon(new Burger(8.0)));
        double expectedTotalCost = 15.0;
        double actualTotalCost = order.calculateTotalCost();
        assertEquals(expectedTotalCost, actualTotalCost);
    }
}