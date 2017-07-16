package kiss.bad;

import kiss.bad.checkout.*;

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

        if (cart.getNumProducts() > 0) {

            if (cart.getTotal() >= cart.MIN_PURCHASE_AMOUNT) {

                if (cart.getTotal() < cart.MAX_PURCHASE_AMOUNT) {

                    if (delivery.checkAddress()) {

                        if (delivery.hasCarrier()) {

                            if (payment.hasPaymentMethods()) {

                                if (payment.isCompulsiveBuyer()) {

                                    if (cart.checkStock()) {

                                        return true;

                                    } else {
                                        throw new Exception("No hay stock");
                                    }
                                } else {
                                    throw new Exception("Are you a compulsive buyer signed");
                                }
                            } else {
                                throw new Exception("No payment methods");
                            }
                        } else {
                            throw new Exception("No carrier");
                        }
                    } else {
                        throw new Exception("Invalid address");
                    }
                } else {
                    throw new Exception("You have exceeded the maximum total allowed for a purchase");
                }
            } else {
                throw new Exception("Does not reach the minimum required for the cart");
            }
        } else {
            throw new Exception("The cart is empty");
        }

    }
}
