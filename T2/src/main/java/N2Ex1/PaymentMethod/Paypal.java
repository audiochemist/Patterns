package N2Ex1.PaymentMethod;

import javax.security.auth.callback.Callback;

public class Paypal implements PaymentMethod{

    private String userPaypal;

    public Paypal(String userPaypal) {
        this.userPaypal = userPaypal;
    }
    @Override
    public void issuePayment(int price) {
        System.out.println("Estoy pagando " + price + " euros via Paypal");

    }


}
