package kiss.good.checkout;

public class Payment {

    public boolean hasPaymentMethods() {
        return true;
    }

    public boolean isCompulsiveBuyer() {
        return true;
    }

    public boolean validatePayment() throws Exception {
        if (!hasPaymentMethods()) {
            throw new Exception("No payment methods");
        }

        if (!isCompulsiveBuyer()) {
            throw new Exception("Are you a compulsive buyer signed");
        }

        return true;
    }
}
