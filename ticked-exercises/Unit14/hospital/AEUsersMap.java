import java.util.*;

public class AEUsersMap {
    private Map<Integer, Patient> users = new HashMap<>();

    public void addPatient(Patient p) {
        users.put(1, p);
    }

    public void addPatient(int pNo, String nme, String gp, int d, int m, int y) {
        Patient patient = new Patient(pNo, nme, gp, d, m, y);
        users.put(pNo,patient);
    }

    public void addPatient(int index, Patient patient) {
        users.put(index, patient);
    }

    public void removePatient(int pNo) {
        users.remove(pNo);
    }

    public int findPatientByPNo(int pNo) {
        if (users.containsKey(pNo)) {
            return pNo;
        } else
            return -1;
    }

    public Patient getPatient(int pNo) {
        return users.get(pNo);
    }

    public Patient getPatientByPNo(int pNo) {
        return users.get(pNo);
    }

    public void updateAll() {
        for (Patient patient : users.values()) {
            patient.updateWaitingTime(1);
        }
    }

    @Override
    public String toString() {
        return "AEUsersMap []";
    }
}
