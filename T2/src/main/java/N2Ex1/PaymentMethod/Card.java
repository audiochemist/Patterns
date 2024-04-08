package N2Ex1.PaymentMethod;

import javax.security.auth.callback.Callback;

public class Card implements PaymentMethod{


    private int cardNumber;

    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void issuePayment(int price) {
        System.out.println("Estoy pagando " + price + " euros via tarjeta");
    }

}
