/**
 * Tester
 */
public class Tester {

    public static void main(String[] args) {
        Person person = new Person(1, "Todd");
        Lecturer lecturer = new Lecturer(1, "John", "CompSci", 50_000);
        Student student = new Student(1, "Jim", "Msc Comp Sci");
        person.getName();
        lecturer.getName();
        student.getName();
        person.toString();
        student.toString();
        lecturer.toString();
    }
}
