package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static final Map<String, List<String>> flights = new HashMap<>(); // for storing key value pairs of origin & destination

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        processFlights(lines); // firstly, calling method on origin & destination list for conversion to a hashMap

        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to do:");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit program press #");

        while (true) {
            System.out.print("> ");
            String input = in.nextLine();

            if (input.equals("1")) {
                listCities();
                System.out.println("To select a city from which you would like to start press 2: ");
            } else if (input.equals("#")) {
                System.out.println("Quiting program.");
                break;
            } else if (input.equals("2")) {
                System.out.println("Enter the city from which you would like to start: ");
                String inputCity = in.nextLine();

                if (flights.containsKey(inputCity)) {
                    selectRoute(inputCity, in);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static void listCities() { // iterates through flights HashMap key sets and prints each city.
        System.out.println("Complete list of cities: ");
        for (String city : flights.keySet()) {
            System.out.println(city);
        }
    }

    public static void processFlights(List<String> lines) {
        /* Iterates through lines, converting each one to an array by splitting at arrows. */
        for (String line : lines) {
            String[] cities = line.split(" -> ");
            if (cities.length == 2) {
                String origin = cities[0];
                String destination = cities[1];
                flights.computeIfAbsent(origin, k -> new ArrayList<>()).add(destination); // each origin gets a destination key value.
                /* Used "computeIfAbsent" because the flights have duplicates.
                This ensures that destinations or origin cities don't get override.*/
            }
        }
    }

    public static void selectRoute(String startingCity, Scanner in) { /* selects route by user input data,
    creating a list of user-wanted destinations */
        String currCity = startingCity;
        List<String> route = new ArrayList<>(); // this holds all input cities.

        while (true) {
            System.out.println("Select destination city or enter '#' to exit: ");
            System.out.print("> ");
            String input = in.nextLine();
            if (input.equals("#")) {
                break;
            } else if (flights.containsKey(currCity) && flights.get(currCity).contains(input)) {
                /* Checking if the input city is valid in flights and if currCities key pair is the input destination */
                route.add(input);
                if (input.equals(currCity)) {
                    break;
                }
                currCity = input;
            } else {
                System.out.println("Destination not possible.");
            }
        }

        System.out.println("Route chosen");
        System.out.println("Starting city: ");
        System.out.println("\t" + startingCity);
        System.out.println("Destinations: ");
        for (String city : route) {
            System.out.println("\t" + city);
        }
    }
}
