
/**
 * The Student class stores information about a student at the University
 * Students are enrolled on only one course called a "pathway" e.g. "CS2",
 * "CSP4"
 * For simplicity, in this version the pathway is just stored as a String
 * 
 * @author A.A.Marczyk
 * @version 2 - 24/11/2013
 * 
 */

public class Student extends Person {
    // fields
    // private String name;
    private String pathway;
    private boolean international;

    /**
     * Creates a Student with a unique id number and a name initialised from
     * parameters
     * Students are treated as "home" students by default
     * 
     * @param id   it is the responsibility of the client to ensure that id is a
     *             unique number
     * @param n    is the String representation of the student's name
     * @param pway is the pathway given as a String
     */
    public Student(int id, String n, String pway) {
        super(id, n);
        name = n;
        pathway = pway;
        international = false;
    }

    /**
     * returns student id as an int
     * 
     * @return value returned is student id as an int
     */
    public int getIdNo() {
        return idNumber;
    }

    /**
     * returns student name as a String
     * 
     * @return value returned is student name as a String
     */
    // public String getName() {
    // return name;
    // }

    /**
     * @return returns true if the students is an international student, else false
     */
    public boolean isInternational() {
        return international;
    }

    /**
     * resets student from "Home" (default) to International
     */
    public void setInternational() {
        international = true;
    }

    /**
     * Returns a Styring represnetation of the student
     * 
     * @return returns a String representation of the student, including the id
     *         number and name
     */
    public String toString() {
        String s;
        if (isInternational()) {
            s = "  International student ";
        } else {
            s = "  Home  student ";
        }
        return (idNumber + "  " + name + "  " + pathway + "  " + s);
    }
}
