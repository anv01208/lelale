import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems = new ArrayList<>();

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product item : cartItems) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void checkout(PaymentsStrategy paymentStrategy) {
        double totalPrice = calculateTotalPrice();
        paymentStrategy.processPayment(totalPrice);
    }

}

