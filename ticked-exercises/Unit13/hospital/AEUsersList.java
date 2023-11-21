import java.util.ArrayList;

/**
 * AEArrayList
 */
public class AEUsersList {

    private ArrayList<Patient> users = new ArrayList<Patient>();

    public void addPatient(Patient p) {
        users.add(p);
    }

    public void addPatient(int pN, String nme, String gp, int d, int m, int y) {
        Patient patient = new Patient(pN, nme, gp, d, m, y);
        users.add(patient);
    }

    public void addPatient(int index, Patient p) {
        users.add(index, p);
    }

    public void removePatient(int pNo) {
        users.remove(pNo);
    }

    public int findPatientByPNo(int pNo) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPatientNo() == pNo) {
                return i;
            }
        }
        return -1;
    }

    public Patient getPatient(int pos) {
        return users.get(pos);
    }

    public Patient getPatientByPNo(int pNo) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPatientNo() == pNo) {
                Patient patientByNo = users.get(i);
                return patientByNo;
            }
        }
        return null;
    }

    public void updatedAll() {
        for (Patient patient : users) {
            patient.updateWaitingTime(1);
        }

    }

    @Override
    public String toString() {
        return "AEUsersList [users=" + users + "]";
    }

}
