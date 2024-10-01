public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        paymentMethod.Proess();
    }
}