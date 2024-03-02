package io.codelex.comparing.practice;

import io.codelex.NoCodeWrittenException;

public class BooksExercise {
    public static void main(String[] args) {
        final Book theBelgariad = BookBuilder.create()
                .title("The Belgariad")
                .author("Eddings, David")
                .pages(1823)
                .isbn(144056789000L)
                .price(99.99)
                .build();
        final Book masterCPlusPlus = BookBuilder.create()
                .title("Master C++")
                .author("Woollard, Rex")
                .build();
        final Book webstersDictionary = BookBuilder.create()
                .title("Webster's Dictionary")
                .build();
        final Book theBible = BookBuilder.create()
                .title("The Bible")
                .isbn(1)
                .build();

        final BookBuilder rowlingsBookBuilder = BookBuilder.create()
                .author("Rowlings, J.K.")
                .publisher("Bloomsbury")
                .price(34.95);

        final Book philosophersStone = rowlingsBookBuilder
                .title("The Philosopher's Stone")
                .build();
        final Book chamberOfSecrets = rowlingsBookBuilder
                .title("The Chamber of Secrets")
                .pages(345)
                .build();
        final Book prisonerOfAzkaban = rowlingsBookBuilder
                .title("The Prisoner of Azkaban")
                .build();
        final BookBuilder tolkeinBookBuilder = BookBuilder.create()
                .author("Tolkein, J.R.R.")
                .publisher("Penguin");
        final Book lordOfTheRings = tolkeinBookBuilder
                .title("Lord of the Rings")
                .pages(1178)
                .isbn(123456789012L)
                .price(123.45)
                .build();
        final Book theHobbit = tolkeinBookBuilder
                .title("The Hobbit")
                .isbn(100056789000L)
                .price(98.76)
                .build();

        final Book theMallorean = new Book("The Mallorean", "Eddings, David", "New Line", 1940, 146758906640L, 88.88);
        final Book gobletOfFire = new Book("The Goblet of Fire", "Rowlings, J.K.", "Bloomsbury", 0, 0L, 34.95);
        final Book orderOfThePhoenix = new Book("Order of the Phoenix", "Rowlings, J.K.", "Bloomsbury", 0, 0L, 39.95);
        final Book halfBloodPrince = new Book("Half Blood Prince", "Rowlings, J.K.", "Bloomsbury", 823, 0L, 37.95);
        final Book deathlyHallows = new Book("Deathly Hallows", "Rowlings, J.K.", "Bloomsbury", 798, 0L, 42.95);

        /**
         * Store all the books in a list.
         *
         * Sort them by:
         *  - Title (it should be default sorting method)
         *  - Author
         *  - ISBN
         *  - Price
         *  - Pages
         *  
         * Sort by Author in 4 different ways:
         *  - comparator as a class
         *  - comparator as an anonymous class
         *  - using java.util.Comparators
         *  - comparator as lambda expression
         */

        throw new NoCodeWrittenException();
    }
}
    
