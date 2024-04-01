package N2Ex1;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

    private List<Contact> contacts;

    public ContactBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void showContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
}
