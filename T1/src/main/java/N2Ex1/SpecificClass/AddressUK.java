package N2Ex1.SpecificClass;

import N2Ex1.Fabrics.AddressInterface;

public class AddressUK implements AddressInterface {

    private String street;
    private String city;
    private int zipCode;
    private int number;
    private final String COUNTRY = "UK";

    public AddressUK() {
    }

    @Override
    public void setAddress(String street, String city, int zipCode, int number) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.number = number;
    }

    @Override
    public String getAddress() {
        return COUNTRY + ", " + city + ", " + number + ", " + street + ", " + zipCode;
    }
}
