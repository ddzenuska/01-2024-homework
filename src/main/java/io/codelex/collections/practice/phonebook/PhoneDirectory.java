package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private Map<String, String> phoneEntry;
    // Removed dataCount variable because it is not needed to keep track of data as compared to the array.

    public PhoneDirectory() {
        this.phoneEntry = new TreeMap<>();
    }

    public String getNumber(String name) {
        return phoneEntry.getOrDefault(name, null); /* Retrieves a number by name.
        If it doesn't exist, returns a null as default value.*/

    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        phoneEntry.put(name, number); //if the name/number isn't present, it is added automatically, otherwise - changed.
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "phoneEntry=" + phoneEntry +
                '}';
    }
}
