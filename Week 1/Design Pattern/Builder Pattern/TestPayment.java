public class TestPayment {
    public static void main(String[] args) {
        PaypalPaymentGateway paypalGateway = new PaypalPaymentGateway();
        PaymentProcessor paypalAdapter = new PaypalAdapter(paypalGateway);
        paypalAdapter.processPayment(100.0);
    }
}