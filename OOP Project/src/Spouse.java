public class Spouse { // Making of class based on the Spouse table 
    private int applicant_id; // Used private to encepsulate the variables
    private String spouse_fullname;
    private String spouse_employment_status;
    private String exemption_claimant;
    private String spouse_emp_tin;
    private String spouse_tin;

    // Make constructor for the Class variables
    public Spouse (int applicant_id, String spouse_fullname, String spouse_employment_status, String exemption_claimant, String spouse_emp_tin, String spouse_tin){
        this.applicant_id = applicant_id;
        this.spouse_fullname = spouse_fullname;
        this.spouse_employment_status = spouse_employment_status;
        this.exemption_claimant = exemption_claimant;
        this.spouse_emp_tin = spouse_emp_tin;
        this.spouse_tin = spouse_tin;
    }


}