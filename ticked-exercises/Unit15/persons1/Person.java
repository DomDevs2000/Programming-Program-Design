/**
 * Person
 */
public class Person {

    int idNumber;
    String name;

    public Person(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public String toString() {
        return "Person [idNumber=" + idNumber + "]";
    }

}
