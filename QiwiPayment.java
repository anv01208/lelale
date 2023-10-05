public class QiwiPayment implements PaymentsStrategy {
    private Integer number;

    public QiwiPayment(Integer number) {
        this.number= number;
    }

    @Override
    public void processPayment(double amount) {
        // Implement PayPal payment processing logic
        amount = amount-10;
        System.out.println("Paid $" + amount + " using Qiwi.");
    }
}
