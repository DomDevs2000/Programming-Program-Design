
/**
 * PROCESSING MARKS
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        int days = 22;
        int weeksAsDays = days % 7;
        int daysIntoWeeks = days / 7;

        System.out.println(daysIntoWeeks + " Weeks" + " And " + weeksAsDays + " Days");

    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
