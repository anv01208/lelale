public class CreditCardPaymentStrategy implements PaymentsStrategy{
    private String cardNumber;
    private String name;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String name, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        // Implement credit card payment processing logic
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}


