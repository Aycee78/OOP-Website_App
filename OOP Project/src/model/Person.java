package model;
public class Person {
    private String taxpayer_fullname;
    private String gender;
    private String civil_status;
    private String date_of_birth;
    private String place_of_birth;

    // Blank constructor: Let's us make an empty Person object first, without having to type their details right away.
    public Person() {}

    // Pre-filled constructor: Let's us make a Person with their details set immediately in one step.
    public Person(String taxpayer_fullname, String gender, String civil_status, String date_of_birth, String place_of_birth) {

        this.taxpayer_fullname = taxpayer_fullname;
        this.gender = gender;
        this.civil_status = civil_status;
        this.date_of_birth = date_of_birth;
        this.place_of_birth = place_of_birth;
    }

    // Getters and Setters (Data Protection): Keeps variables private and controls how we safely read and change them.
    public String getTaxpayer_fullname() {
        return taxpayer_fullname;
    }

    public void setTaxpayer_fullname(String taxpayer_fullname) {
        this.taxpayer_fullname = taxpayer_fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCivil_status() {
        return civil_status;
    }

    public void setCivil_status(String civil_status) {
        this.civil_status = civil_status;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;

    }
}