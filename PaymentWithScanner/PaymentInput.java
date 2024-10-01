import java.util.Scanner;

public class PaymentInput {
    public PaymentMethod getPaymentMethod() {
        Scanner scanner = new Scanner(System.in);
        PaymentMethod selectedMethod = null;
        boolean valid = false;
        
        while (!valid) {
            System.out.print("Enter payment method (CreditCard, PayPal, Bitcoin): ");
            String paymentMethod = scanner.nextLine().toLowerCase();

            switch (paymentMethod) {
                case "creditcard":
                    selectedMethod = new CreditCardPayment();
                    scanner.close();
                    valid = true;  
                    break;
                case "paypal":
                    selectedMethod = new PaypalPayment();
                    scanner.close();
                    valid = true;  
                    break;
                case "bitcoin":
                    selectedMethod = new Bitcoinpayment();
                    scanner.close();
                    valid = true;  
                    break;
                default:
                    System.out.println("------------------------------------------");
                    System.out.println("Invalid payment method. Please try again.");
                    System.out.println("------------------------------------------");
                    
                    
            }
        }

        return selectedMethod;
        
    }
}