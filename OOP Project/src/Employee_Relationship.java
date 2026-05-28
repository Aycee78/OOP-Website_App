public class Employee_Relationship {
    private int applicant_id;
    private String emp_tin;
    private String emp_type; // 'Primary', 'Concurrent', 'Successive'
    private String hire_date;

    // Default constructor
    public Employee_Relationship() {}

    // Parameterized constructor
    public Employee_Relationship(int applicant_id, String emp_tin, String emp_type, String hire_date) {
        this.applicant_id = applicant_id;
        this.emp_tin = emp_tin;
        this.emp_type = emp_type;
        this.hire_date = hire_date;
    }

    // Getters and Setters
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
