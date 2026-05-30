public class Dependent {
    private int dependent_id;
    private int applicant_id;
    private String dependent_fullname;
    private String dependent_dob;
    private String is_incapacitated; // Strictly "Yes" or "No"

    // Blank constructor: Let's us make an empty dependent object first, before filling it up with user inputs from our UI screens.
    public Dependent() {}

    // Pre-filled constructor WITH ID: Used when loading a dependent that is already saved in the database.
    public Dependent(int dependent_id, int applicant_id, String dependent_fullname, String dependent_dob, String is_incapacitated) {
        this.dependent_id = dependent_id;
        this.applicant_id = applicant_id;
        setDependent_fullname(dependent_fullname);
        setIs_incapacitated(is_incapacitated);
        setDependent_dob(dependent_dob);
    }

    // Pre-filled constructor WITHOUT ID: Used when creating a new dependent (the database will auto-increment the ID for them).
    public Dependent(int applicant_id, String dependent_fullname, String dependent_dob, String is_incapacitated) {
        this.applicant_id = applicant_id;
        setDependent_fullname(dependent_fullname);
        setIs_incapacitated(is_incapacitated);
        setDependent_dob(dependent_dob);
    }

    // Getters and Setters (Data Protection): Keeps variables private and controls how we safely read and change them.
    public int getDependent_id() {
        return dependent_id;
    }

    public void setDependent_id(int dependent_id) {
        this.dependent_id = dependent_id;
    }

    public int getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(int applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getDependent_fullname() {
        return dependent_fullname;
    }

    public final void setDependent_fullname(String dependent_fullname) {
        if (dependent_fullname == null || dependent_fullname.isEmpty()) {
            throw new IllegalArgumentException("Dependent full name is required.");
        }
        this.dependent_fullname = dependent_fullname;
    }

    public String getDependent_dob() {
        return dependent_dob;
    }

    public final void setDependent_dob(String dependent_dob) {
        if (dependent_dob == null || !dependent_dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Dependent Date of Birth must be in YYYY-MM-DD format.");
        }
        int birthYear = Integer.parseInt(dependent_dob.substring(0, 4));
        int age = 2026 - birthYear;
        if (age > 21 && "No".equals(this.is_incapacitated)) {
            throw new IllegalArgumentException("Dependent cannot be over 21 unless they are incapacitated.");
        }
        this.dependent_dob = dependent_dob;
    }

    public String getIs_incapacitated() {
        return is_incapacitated;
    }

    public final void setIs_incapacitated(String is_incapacitated) {
        if (is_incapacitated == null || (!is_incapacitated.equals("Yes") && !is_incapacitated.equals("No"))) {
            throw new IllegalArgumentException("is_incapacitated must be 'Yes' or 'No'.");
        }
        if (is_incapacitated.equals("No") && this.dependent_dob != null && this.dependent_dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            int birthYear = Integer.parseInt(this.dependent_dob.substring(0, 4));
            int age = 2026 - birthYear;
            if (age > 21) {
                throw new IllegalArgumentException("Dependent cannot be over 21 unless they are incapacitated.");
            }
        }
        this.is_incapacitated = is_incapacitated;
    }
}
