package kiss.good;

import kiss.good.checkout.Cart;
import kiss.good.checkout.Delivery;
import kiss.good.checkout.Payment;

public class Checkout {
    Cart cart;
    Delivery delivery;
    Payment payment;

    public Checkout() {
        cart = new Cart();
        delivery = new Delivery();
        payment = new Payment();
    }

    public boolean validateCart() throws Exception {
        isCartValid();
        canDeliveryOrder();
        validatePayment();

        return true;
    }

    public boolean isCartValid() throws Exception {
        if (cart.getNumProducts() <= 0) {
            throw new Exception("The cart is empty");
        }

        if (cart.getTotal() < cart.MIN_PURCHASE_AMOUNT) {
            throw new Exception("Does not reach the minimum required for the cart");
        }

        if (cart.getTotal() > cart.MAX_PURCHASE_AMOUNT) {
            throw new Exception("You have exceeded the maximum total allowed for a purchase");
        }

        if (!cart.checkStock()) {
            throw new Exception("No hay stock");
        }

        return true;
    }

    public boolean canDeliveryOrder() throws Exception {
        if (!delivery.checkAddress()) {
            throw new Exception("Invalid address");
        }

        if (!delivery.hasCarrier()) {
            throw new Exception("No carrier");
        }

        return true;
    }

    public boolean validatePayment() throws Exception {
        if (!payment.hasPaymentMethods()) {
            throw new Exception("No payment methods");
        }

        if (!payment.isCompulsiveBuyer()) {
            throw new Exception("Are you a compulsive buyer signed");
        }

        return true;
    }
}