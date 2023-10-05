public class ShoppingCartDemo {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Item 1", 20.0, 2);
        Product product2 = new Product("Item 2", 15.0, 3);


        ShoppingCart cart = new ShoppingCart();


        cart.addProduct(product1);
        cart.addProduct(product2);


        PaymentsStrategy paymentStrategy = new CreditCardPaymentStrategy("1234-5678-9012-3456", "John Doe", "12/25", "123");


        cart.checkout(paymentStrategy);
        QiwiPayment qiwiPayment = new QiwiPayment(878687677);
        cart.checkout(qiwiPayment);
    }
}
