package N2Ex1.Fabrics;

import N2Ex1.SpecificClass.AddressSpain;
import N2Ex1.SpecificClass.AddressUK;
import N2Ex1.SpecificClass.TelephoneSpain;
import N2Ex1.SpecificClass.TelephoneUK;

public class AgendaFabricsFabric implements AgendaFabric {

    @Override
    public TelephoneInterface getPhoneNumber(String country) {
        if (country.equalsIgnoreCase("Spain")) {
            return new TelephoneSpain();
        } else if (country.equalsIgnoreCase("UK")) {
            return new TelephoneUK();
        }
        return null;
    }

    @Override
    public AddressInterface getAddress(String country) {
        if (country.equalsIgnoreCase("Spain")) {
            return new AddressSpain();
        } else if (country.equalsIgnoreCase("UK")) {
            return new AddressUK();
        }
        return null;


    }
}