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
        cart.isCartValid();
        delivery.canDeliveryOrder();
        payment.validatePayment();

        return true;
    }
}