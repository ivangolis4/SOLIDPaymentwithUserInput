public class Main{

    public static void main(String[]args){
        PaymentInput paymentInput = new PaymentInput();
        PaymentMethod paymentMethod = paymentInput.getPaymentMethod();
        PaymentProcessor processor = new PaymentProcessor(paymentMethod);
        processor.processPayment();
    }
}