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
        this.dependent_fullname = dependent_fullname;
        this.dependent_dob = dependent_dob;
        this.is_incapacitated = is_incapacitated;
    }

    // Pre-filled constructor WITHOUT ID: Used when creating a new dependent (the database will auto-increment the ID for them).
    public Dependent(int applicant_id, String dependent_fullname, String dependent_dob, String is_incapacitated) {
        this.applicant_id = applicant_id;
        this.dependent_fullname = dependent_fullname;
        this.dependent_dob = dependent_dob;
        this.is_incapacitated = is_incapacitated;
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

    public void setDependent_fullname(String dependent_fullname) {
        this.dependent_fullname = dependent_fullname;
    }

    public String getDependent_dob() {
        return dependent_dob;
    }

    public void setDependent_dob(String dependent_dob) {
        this.dependent_dob = dependent_dob;
    }

    public String getIs_incapacitated() {
        return is_incapacitated;
    }

    public void setIs_incapacitated(String is_incapacitated) {
        this.is_incapacitated = is_incapacitated;
    }
}
