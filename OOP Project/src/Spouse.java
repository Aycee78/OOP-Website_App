public class Spouse {
    private int applicant_id;
    private String spouse_fullname;
    private String spouse_employment_status;
    private String exemption_claimant;
    private String spouse_emp_tin;
    private String spouse_tin;

    // Blank constructor: Let's us make an empty spouse object first, before filling it up with user inputs from our UI screens.
    public Spouse() {}

    // Pre-filled constructor: Let's us make a spouse with their details set immediately, linking them to the main taxpayer.
    public Spouse(int applicant_id, String spouse_fullname, String spouse_employment_status, String exemption_claimant, String spouse_emp_tin, String spouse_tin) {
        this.applicant_id = applicant_id;
        this.spouse_fullname = spouse_fullname;
        this.spouse_employment_status = spouse_employment_status;
        this.exemption_claimant = exemption_claimant;
        this.spouse_emp_tin = spouse_emp_tin;
        this.spouse_tin = spouse_tin;
    }

    // Getters and Setters (Data Protection): Keeps variables private and controls how we safely read and change them.
    public int getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(int applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getSpouse_fullname() {
        return spouse_fullname;
    }

    public void setSpouse_fullname(String spouse_fullname) {
        this.spouse_fullname = spouse_fullname;
    }

    public String getSpouse_employment_status() {
        return spouse_employment_status;
    }

    public void setSpouse_employment_status(String spouse_employment_status) {
        this.spouse_employment_status = spouse_employment_status;
    }

    public String getExemption_claimant() {
        return exemption_claimant;
    }

    public void setExemption_claimant(String exemption_claimant) {
        this.exemption_claimant = exemption_claimant;
    }

    public String getSpouse_emp_tin() {
        return spouse_emp_tin;
    }

    public void setSpouse_emp_tin(String spouse_emp_tin) {
        this.spouse_emp_tin = spouse_emp_tin;
    }

    public String getSpouse_tin() {
        return spouse_tin;
    }

    public void setSpouse_tin(String spouse_tin) {
        this.spouse_tin = spouse_tin;
    }
}