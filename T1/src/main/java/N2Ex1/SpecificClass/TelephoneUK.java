package N2Ex1.SpecificClass;

import N2Ex1.Fabrics.TelephoneInterface;

public class TelephoneUK implements TelephoneInterface {

    private final String PREFIX = "+44 ";
    private String number;

    public TelephoneUK(){

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
