package N2Ex1;

import N2Ex1.Fabrics.AddressInterface;
import N2Ex1.Fabrics.AgendaFabricsFabric;
import N2Ex1.Fabrics.TelephoneInterface;

public class App {

    public static void main(String[] args) {

        AgendaFabricsFabric agendaFactory = new AgendaFabricsFabric();

        AddressInterface addressSpain = agendaFactory.getAddress("Spain");
        AddressInterface addressUK = agendaFactory.getAddress("UK");
        TelephoneInterface phoneSpain = agendaFactory.getPhoneNumber("Spain");
        TelephoneInterface phoneUK = agendaFactory.getPhoneNumber("UK");

        addressSpain.setAddress("Fabra i Puig", "Barcelona", 18001, 123);
        addressUK.setAddress("YIYIY STREET", "London", 12345, 456);
        phoneSpain.setTelephoneNumber("123456789");
        phoneUK.setTelephoneNumber("987654321");

        Contact contactSpain = new Contact("Pepito", addressSpain, phoneSpain);
        Contact contactUK = new Contact("Didi", addressUK, phoneUK);

        ContactBook contactBook = new ContactBook();
        contactBook.addContact(contactSpain);
        contactBook.addContact(contactUK);
        contactBook.showContacts();
    }


}
