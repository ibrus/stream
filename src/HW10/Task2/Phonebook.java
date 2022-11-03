package HW10.Task2;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    public static final ArrayList<Contact> subscribers = new ArrayList<>();

    public static void add(Contact subscriber) {
        if (getContact(subscriber.getPhoneNumber()) == null) {
            subscribers.add(subscriber);
        } else {
            System.out.println(subscriber.getName() + " with phone number " + subscriber.getPhoneNumber() + " already in phonebook!");
        }
    }

    private static Contact getContact(String phoneNumber) {
        if (subscribers.size() < 2) return null;

        for (Contact subscriber : subscribers) {
            if (subscriber.getPhoneNumber().equals(phoneNumber)) return subscriber;
        }
        return null;
    }

    public static Contact find(String name) {
        if (subscribers.size() == 0) return null;

        for (Contact subscriber : subscribers) {
            if (subscriber.getName().equals(name)) return subscriber;
        }
        return null;
    }

    public static List<Contact> findAll(String name) {
        if (subscribers.size() == 0) return null;

        List<Contact> contacts = new ArrayList<>();

        for (Contact subscriber : subscribers) {
            if (subscriber.getName().equals(name)) {
                contacts.add(subscriber);
            }
        }
        return contacts.size() ==0 ? null : contacts;
    }
}
