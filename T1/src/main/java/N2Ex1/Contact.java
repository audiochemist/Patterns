package N2Ex1;

import N2Ex1.Fabrics.AddressInterface;
import N2Ex1.Fabrics.TelephoneInterface;

public class Contact {

    private String name;
    private AddressInterface address;
    private TelephoneInterface phone;

    public Contact(String name, AddressInterface address, TelephoneInterface phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Contact(AddressInterface address, TelephoneInterface phone) {
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressInterface getAddress() {
        return address;
    }

    public void setAddress(AddressInterface address) {
        this.address = address;
    }

    public TelephoneInterface getPhone() {
        return phone;
    }

    public void setPhone(TelephoneInterface phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + "{" +
                "address=" + address.getAddress() +
                ", phone=" + phone.getTelephoneNumber() +
                '}';
    }
}

