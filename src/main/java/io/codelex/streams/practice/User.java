package io.codelex.streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String name;
    private Integer age;
    private boolean male;

    public User(Integer age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, boolean male) {
        this.name = name;
        this.male = male;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, Integer age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }


    /*
     * Creates a stream of ages
     * A map, creating a new user for each age
     * Transforms to a list and returns
     */
    public static List<User> getUsersWithAge(Integer... ages) {
        return Arrays.stream(ages).map(User::new).toList();
    }
}
