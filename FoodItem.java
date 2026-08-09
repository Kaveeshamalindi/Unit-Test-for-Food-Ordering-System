public class FoodItem {

    private String foodItem;
    private double price;

    public FoodItem(String name, double price) {
        this.foodItem = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}