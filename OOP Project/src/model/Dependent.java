package model;
public class Dependent {
    private int DependentId;
    private int applicant_id;
    private String dependent_fullname;
    private String dependent_dob;
    private String is_incapacitated; // "Yes" or "No"

    // Default constructor
    public Dependent() {}

    // Parameterized constructor including dependent_id
    public Dependent(int DependentId, int applicant_id, String dependent_fullname, String dependent_dob, String is_incapacitated) {
        this.DependentId = DependentId;
        this.applicant_id = applicant_id;
        this.dependent_fullname = dependent_fullname;
        this.dependent_dob = dependent_dob;
        this.is_incapacitated = is_incapacitated;
    }

    // Parameterized constructor excluding dependent_id (useful for new records before saving)
    public Dependent(int applicant_id, String dependent_fullname, String dependent_dob, String is_incapacitated) {
        this.applicant_id = applicant_id;
        this.dependent_fullname = dependent_fullname;
        this.dependent_dob = dependent_dob;
        this.is_incapacitated = is_incapacitated;
    }

    // Getters and Setters
    public int getDependent_id() {
        return DependentId;
    }

    public void setDependent_id(int DependentId) {
        this.DependentId = DependentId;
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
        if (is_incapacitated != null && is_incapacitated.equalsIgnoreCase("Yes")){
        this.is_incapacitated = "Yes";
        }else{
        this.is_incapacitated = "No";
        }

}
}

