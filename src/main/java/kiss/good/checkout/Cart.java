package kiss.good.checkout;

public class Cart {
    public static final int MIN_PURCHASE_AMOUNT = 30;
    public static final int MAX_PURCHASE_AMOUNT = 10000;

    public int getNumProducts() {
        return 1;
    }

    public float getTotal() {
        return 100;
    }

    public boolean checkStock() {
        return true;
    }

    public boolean isCartValid() throws Exception {
        if (getNumProducts() <= 0) {
            throw new Exception("The cart is empty");
        }

        if (getTotal() < MIN_PURCHASE_AMOUNT) {
            throw new Exception("Does not reach the minimum required for the cart");
        }

        if (getTotal() > MAX_PURCHASE_AMOUNT) {
            throw new Exception("You have exceeded the maximum total allowed for a purchase");
        }

        if (!checkStock()) {
            throw new Exception("No hay stock");
        }

        return true;
    }
}
