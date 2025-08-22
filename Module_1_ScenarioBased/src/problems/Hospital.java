package problems;

class Patient {
    private int patientId;
    private String name;
    private String[] visits; // stores visit details
    private static int totalPatients = 0;

    // Constructor
    public Patient(int patientId, String name, String[] visits) {
        this.patientId = patientId;
        this.name = name;
        this.visits = visits;
        totalPatients++;
    }

    // Getters
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public String[] getVisits() { return visits; }

    // Display visits using enhanced for-loop
    public void displayVisits() {
        System.out.println("Visits for patient " + name + ":");
        for (String visit : visits) {
            System.out.println(" - " + visit);
        }
    }

    public static int getTotalPatients() {
        return totalPatients;
    }
}

class Hospital {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Alice", new String[]{"Checkup - Jan", "X-Ray - Feb"});
        Patient p2 = new Patient(102, "Bob", new String[]{"Surgery - Mar", "Follow-up - Apr"});

        p1.displayVisits();
        p2.displayVisits();

        System.out.println("Total patients registered: " + Patient.getTotalPatients());

        // String comparison demo
        String name1 = "Alice";
        String name2 = new String("Alice"); // new object

        System.out.println("equals() check: " + name1.equals(name2)); // true
        System.out.println("== check: " + (name1 == name2)); // false
    }
}
