package kiss.bad.checkout;

public class Cart {
    public static final int MIN_PURCHASE_AMOUNT = 30;
    public static final int MAX_PURCHASE_AMOUNT = 10000;

    public int getNumProducts() {
        return 1;
    }

    public float getTotal() {
        return 30;
    }

    public boolean checkStock() {
        return true;
    }
}
