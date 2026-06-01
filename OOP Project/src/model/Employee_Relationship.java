package model;
public class Employee_Relationship {
    private int applicant_id;
    private String emp_tin;
    private String emp_type; // Strictly 'Primary', 'Concurrent', or 'Successive'
    private String hire_date;

    // Blank constructor: Let's us make an empty employment link first, before filling it up with user inputs from our UI screens.
    public Employee_Relationship() {}

    // Pre-filled constructor: Let's us make an employment link directly using a taxpayer ID and an employer TIN.
    public Employee_Relationship(int applicant_id, String emp_tin, String emp_type, String hire_date) {
        this.applicant_id = applicant_id;
        this.emp_tin = emp_tin;
        this.emp_type = emp_type;
        this.hire_date = hire_date;
    }

    // Getters and Setters (Data Protection): Keeps variables private and controls how we safely read and change them.
    public int getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(int applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getEmp_tin() {
        return emp_tin;
    }

    public void setEmp_tin(String emp_tin) {
        this.emp_tin = emp_tin;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }
}
