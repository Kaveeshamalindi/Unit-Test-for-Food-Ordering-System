import java.util.ArrayList;

public class FoodOrder {

    private ArrayList<FoodItem> items = new ArrayList<>();

    public void addtoCart(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalAmount() {

        double total = 0;

        for (FoodItem item : items) {
            total += item.getPrice();
        }

        return total;
    }
}