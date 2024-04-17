package io.codelex.multithreading.simplified;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TheaterTickets {

    static final List<String> tickets = new LinkedList<>(Arrays.asList("Ticket_1", "Ticket_2", "Ticket_3", "Ticket_4", "Ticket_5"));

    public static void main(String[] args) {

        class PersonBuyingTicket extends Thread {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                buyTicket();
            }
        }

        int personCount = 20;
        for (int i = 0; i < personCount; i++) {
            new PersonBuyingTicket().start();
        }
    }

    //Fix this method
    public static void buyTicket() {
        synchronized (tickets) { // synchronized prevents multiple threads to execute at the same time
            if (!tickets.isEmpty()) {
                String ticket = tickets.get(0);
                tickets.remove(ticket);
                System.out.println("Ticket was bought: " + ticket);
            } else {
                System.out.println("Sorry, no more tickets available!");
            }
        }
    }
}