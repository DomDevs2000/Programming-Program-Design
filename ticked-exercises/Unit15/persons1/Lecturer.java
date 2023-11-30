/**
 * Lecturer
 */
public class Lecturer extends Person {
    private String department;
    private double salary;

    public int getIdNumber() {
        return idNumber;
    }

    public Lecturer(int idNumber, String name, String department, double salary) {
        super(idNumber, name);
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Lecturer [idNumber=" + idNumber + ", name=" + name + ", department=" + department + ", salary=" + salary
                + "]";
    }

}
