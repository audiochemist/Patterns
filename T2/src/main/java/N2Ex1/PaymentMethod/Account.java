package N2Ex1.PaymentMethod;

import javax.security.auth.callback.Callback;

public class Account implements PaymentMethod{

    private int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public void issuePayment(int price) {
        System.out.println("Estoy pagando " + price + " euros via cuenta");

    }


}
