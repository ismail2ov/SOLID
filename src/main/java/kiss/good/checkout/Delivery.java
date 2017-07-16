package kiss.good.checkout;

public class Delivery {

    public boolean checkAddress() {
        return true;
    }

    public boolean hasCarrier() {
        return true;
    }

    public boolean canDeliveryOrder() throws Exception {
        if (!checkAddress()) {
            throw new Exception("Invalid address");
        }

        if (!hasCarrier()) {
            throw new Exception("No carrier");
        }

        return true;
    }
}
