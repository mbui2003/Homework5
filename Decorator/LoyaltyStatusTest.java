import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyStatusTest {

    @Test
    public void testApplyDiscount() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1);
        double totalCostWithoutDiscount = 100.0;
        double expectedCostWithDiscount = 90.0;
        double actualCostWithDiscount = loyaltyStatus.applyDiscount(totalCostWithoutDiscount);
        assertEquals(expectedCostWithDiscount, actualCostWithDiscount);
    }
}