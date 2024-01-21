import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



class Person implements Payable, Comparable<Person> {
    private static int id_count = 1;

    private int id;
    private String name;
    private String surname;


    public Person() {
        this.id = id_count++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ' ' + name + ' ' + surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}