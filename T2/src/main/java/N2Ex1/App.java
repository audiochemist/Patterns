package N2Ex1;

import N2Ex1.PaymentMethod.Account;
import N2Ex1.PaymentMethod.Card;
import N2Ex1.PaymentMethod.Paypal;

public class App {

    public static void main(String[] args) {


        IssuePayment issuePayment = new IssuePayment();

        issuePayment.issuePayment(new Paypal("userPaypal"), 3456);
        issuePayment.issuePayment(new Card(76563453), 654);
        issuePayment.issuePayment(new Account(234556456), 456);
    }


}
