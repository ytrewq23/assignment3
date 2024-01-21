import java.util.ArrayList;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persona = new ArrayList();
        persona.add(new Employee( "John",  "Lennon",  "Manager",  27045.78));
        persona.add(new Employee( "Aizada",  "Yezhibayeva",  "Developer",  50000.00));
        persona.add(new Student( "mm",  "Llll", 2.5));
        persona.add(new Student( "Oooo",  "Ppp", 3.0));

        Collections.sort(persona);

        printData(persona);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
    }
