package io.codelex.syntax.variables;

public class StaticVariableUpdate {
    public static void main(String[] args) {
        /*
        todo - find a way how to get this output by using Student class defined below:
         > Student ate one pizza
         > pizzasEaten=1, totalCountOfPizzasEaten=1
         > Student ate one pizza
         > pizzasEaten=1, totalCountOfPizzasEaten=2
         > Student ate one pizza
         > pizzasEaten=1, totalCountOfPizzasEaten=3
         > Student ate one pizza
         > pizzasEaten=1, totalCountOfPizzasEaten=4
         > Student ate one pizza
         > pizzasEaten=1, totalCountOfPizzasEaten=5
         */
    }
}

class Student {
    int pizzasEaten = 0;
    static int totalCountOfPizzasEaten = 0;

    public Student() {
        pizzasEaten++;
        totalCountOfPizzasEaten++;
        System.out.println("Student ate one pizza");
    }
}
