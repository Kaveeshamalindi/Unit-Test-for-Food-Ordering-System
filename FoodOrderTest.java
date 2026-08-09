import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class FoodOrderTest {

    private FoodOrder order;

    @BeforeEach
    public void setUp() {
        order = new FoodOrder();
    }

    @Test
    public void testCalculateTotalAmount() {

        order.addtoCart(new FoodItem("Pizza", 1500));
        order.addtoCart(new FoodItem("Burger", 800));

        assertEquals(2300, order.calculateTotalAmount());
    }
}