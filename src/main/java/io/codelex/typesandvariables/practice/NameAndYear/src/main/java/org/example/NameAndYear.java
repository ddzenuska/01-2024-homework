
public class NameAndYear {
        String name;
        int yearOfBirth;

    public NameAndYear(String myName, int myBirthYear) { // constructor method for creating a new object - person
        name = myName;
        yearOfBirth = myBirthYear;
    }

    public void introduce() { // method that outputs the name and year of birth of the created person
        System.out.println("My name is " + name + " and I was born in " + yearOfBirth + ".");

    }

    public static void main(String[] args) {

        NameAndYear juanValdez = new NameAndYear("Juan Valdez", 1995); // creating a new instance

        juanValdez.introduce(); // calling the introduce method to print the objects values in the terminal

        }
    }