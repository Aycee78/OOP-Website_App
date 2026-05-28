public class Employer {
    private String emp_tin;
    private String emp_fullname;
    private String emp_full_address;
    private String emp_landline;
    private String emp_mun_code;
    private String registering_office_type;

    public Employer (String emp_tin, String emp_fullname, String emp_full_address, String emp_landline, String emp_mun_code, String registering_office_type) {
        this.emp_tin = emp_tin;
        this.emp_fullname = emp_fullname;
        this.emp_full_address = emp_full_address;
        this.emp_landline = emp_landline;
        this.emp_mun_code = emp_mun_code;
        this.registering_office_type = registering_office_type;
    }
}