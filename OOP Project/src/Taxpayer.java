public class Taxpayer extends Person {
    private int applicant_id;
    private String taxpayer_tin;
    private String bir_reg_date;
    private String pcn;
    private String taxpayer_type;
    private String citizenship;
    private String other_citizenship;
    private String mother_fullname;
    private String father_fullname;
    private String full_address;
    private String foreign_address;
    private String mun_code;
    private String zip_code;
    private String landline;
    private String fax;
    private String mobile;
    private String email;
    private String tax_type;
    private String form_type;
    private String atc;
    private String id_type;
    private String id_number;
    private String id_effectivity;
    private String id_expiry; 
    private String id_issuer;
    private String id_place;

    // Default constructor
    public Taxpayer() {
        super();
    }

    // Parameterized constructor including applicant ID
    public Taxpayer(int applicant_id, String taxpayer_tin, String bir_reg_date, String pcn, String taxpayer_type, String taxpayer_fullname, String gender, String civil_status, String date_of_birth, String place_of_birth, String citizenship, String other_citizenship, String mother_fullname, String father_fullname, String full_address, String foreign_address, String mun_code, String zip_code, String landline, String fax, String mobile, String email, String tax_type, String form_type, String atc, String id_type, String id_number, String id_effectivity, String id_expiry, String id_issuer, String id_place) {
        // Call parent constructor to set personal details
        super(taxpayer_fullname, gender, civil_status, date_of_birth, place_of_birth);
        this.applicant_id = applicant_id;
        this.taxpayer_tin = taxpayer_tin;
        this.bir_reg_date = bir_reg_date;
        this.pcn = pcn;
        this.taxpayer_type = taxpayer_type;
        this.citizenship = citizenship;
        this.other_citizenship = other_citizenship;
        this.mother_fullname = mother_fullname;
        this.father_fullname = father_fullname;
        this.full_address = full_address;
        this.foreign_address = foreign_address;
        this.mun_code = mun_code;
        this.zip_code = zip_code;
        this.landline = landline;
        this.fax = fax;
        this.mobile = mobile;
        this.email = email;
        this.tax_type = tax_type;
        this.form_type = form_type;
        this.atc = atc;
        this.id_type = id_type;
        this.id_number = id_number;
        this.id_effectivity = id_effectivity;
        this.id_expiry = id_expiry;
        this.id_issuer = id_issuer;
        this.id_place = id_place;
    }

    // Parameterized constructor excluding applicant ID
    public Taxpayer(String taxpayer_tin, String bir_reg_date, String pcn, String taxpayer_type, String taxpayer_fullname, String gender, String civil_status, String date_of_birth, String place_of_birth, String citizenship, String other_citizenship, String mother_fullname, String father_fullname, String full_address, String foreign_address, String mun_code, String zip_code, String landline, String fax, String mobile, String email, String tax_type, String form_type, String atc, String id_type, String id_number, String id_effectivity, String id_expiry, String id_issuer, String id_place) {
        // Call parent constructor to set personal details
        super(taxpayer_fullname, gender, civil_status, date_of_birth, place_of_birth);
        this.taxpayer_tin = taxpayer_tin;
        this.bir_reg_date = bir_reg_date;
        this.pcn = pcn;
        this.taxpayer_type = taxpayer_type;
        this.citizenship = citizenship;
        this.other_citizenship = other_citizenship;
        this.mother_fullname = mother_fullname;
        this.father_fullname = father_fullname;
        this.full_address = full_address;
        this.foreign_address = foreign_address;
        this.mun_code = mun_code;
        this.zip_code = zip_code;
        this.landline = landline;
        this.fax = fax;
        this.mobile = mobile;
        this.email = email;
        this.tax_type = tax_type;
        this.form_type = form_type;
        this.atc = atc;
        this.id_type = id_type;
        this.id_number = id_number;
        this.id_effectivity = id_effectivity;
        this.id_expiry = id_expiry;
        this.id_issuer = id_issuer;
        this.id_place = id_place;
    }

    // Getters and Setters
    public int getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(int applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getTaxpayer_tin() {
        return taxpayer_tin;
    }

    public void setTaxpayer_tin(String taxpayer_tin) {
        this.taxpayer_tin = taxpayer_tin;
    }

    public String getBir_reg_date() {
        return bir_reg_date;
    }

    public void setBir_reg_date(String bir_reg_date) {
        this.bir_reg_date = bir_reg_date;
    }

    public String getPcn() {
        return pcn;
    }

    public void setPcn(String pcn) {
        this.pcn = pcn;
    }

    public String getTaxpayer_type() {
        return taxpayer_type;
    }

    public void setTaxpayer_type(String taxpayer_type) {
        this.taxpayer_type = taxpayer_type;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getOther_citizenship() {
        return other_citizenship;
    }

    public void setOther_citizenship(String other_citizenship) {
        this.other_citizenship = other_citizenship;
    }

    public String getMother_fullname() {
        return mother_fullname;
    }

    public void setMother_fullname(String mother_fullname) {
        this.mother_fullname = mother_fullname;
    }

    public String getFather_fullname() {
        return father_fullname;
    }

    public void setFather_fullname(String father_fullname) {
        this.father_fullname = father_fullname;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public String getForeign_address() {
        return foreign_address;
    }

    public void setForeign_address(String foreign_address) {
        this.foreign_address = foreign_address;
    }

    public String getMun_code() {
        return mun_code;
    }

    public void setMun_code(String mun_code) {
        this.mun_code = mun_code;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTax_type() {
        return tax_type;
    }

    public void setTax_type(String tax_type) {
        this.tax_type = tax_type;
    }

    public String getForm_type() {
        return form_type;
    }

    public void setForm_type(String form_type) {
        this.form_type = form_type;
    }

    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getId_effectivity() {
        return id_effectivity;
    }

    public void setId_effectivity(String id_effectivity) {
        this.id_effectivity = id_effectivity;
    }

    public String getId_expiry() {
        return id_expiry;
    }

    public void setId_expiry(String id_expiry) {
        this.id_expiry = id_expiry;
    }

    public String getId_issuer() {
        return id_issuer;
    }

    public void setId_issuer(String id_issuer) {
        this.id_issuer = id_issuer;
    }

    public String getId_place() {
        return id_place;
    }

    public void setId_place(String id_place) {
        this.id_place = id_place;
    }
}