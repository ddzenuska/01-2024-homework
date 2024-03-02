package io.codelex.collections.practice.phonebook;

import java.util.Arrays;

public class PhoneDirectory {
    private PhoneEntry[] data;
    private int dataCount;

    public PhoneDirectory() {
        data = new PhoneEntry[1];
        dataCount = 0;
    }

    private int find(String name) {
        for (int i = 0; i < dataCount; i++) {
            if (data[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return data[position].number;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int i = find(name);
        if (i >= 0) {
            data[i].number = number;
        } else {
            if (dataCount == data.length) {
                data = Arrays.copyOf(data, 2 * data.length);
            }
            PhoneEntry newEntry = new PhoneEntry();  // Create a new pair.
            newEntry.name = name;
            newEntry.number = number;
            data[dataCount] = newEntry;   // Add the new pair to the array.
            dataCount++;
        }
    }

}
