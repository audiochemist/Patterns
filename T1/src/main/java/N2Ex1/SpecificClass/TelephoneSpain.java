package N2Ex1.SpecificClass;

import N2Ex1.Fabrics.TelephoneInterface;

public class TelephoneSpain implements TelephoneInterface {

    private final String PREFIX = "+34 ";
    private String number;

    public TelephoneSpain(){

    }
    @Override
    public void setTelephoneNumber(String phoneNumber) {
    this.number = phoneNumber;
    }
    @Override
    public String getTelephoneNumber() {
    return PREFIX + " " + this.number;
    }

}
