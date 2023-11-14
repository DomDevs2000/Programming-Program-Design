import java.util.ArrayList;

/**
 * AEArrayList
 */
public class AEUsersList {

    private ArrayList<Patient> users = new ArrayList<Patient>();

    private AEUsersList() {

    }

    public void addPatient(Patient p) {
        users.add(p);
    }

    public void removePatient(Patient p) {
        users.remove(p);
    }

    public void findPatientByNumber(Patient p) {

        for (int i = 0; i < users.size(); i++) {
            Patient patientByNumber = users.get(i);

        }
        ;

        // users.get(p);
    }

    public void getPatientByPNumber(Patient patientNo) {

    }
}
