public class Person {
    private String taxpayer_fullname;
    private String gender;
    private String civil_status;
    private String date_of_birth;
    private String place_of_birth;

    //Make the constructor to initialize the class variables
    public Person (String taxpayer_fullname, String gender, String civil_status, String date_of_birth, String place_of_birth) {
        this.taxpayer_fullname = taxpayer_fullname;
        this.gender = gender;
        this.civil_status = civil_status;
        this.date_of_birth = date_of_birth;
        this.place_of_birth = place_of_birth;
    }

    //Make the getters to get the values of the class variables
    String get_taxpayer_fullname() { 
        return this.taxpayer_fullname;
    }
    String get_gender() { 
        return this.gender;
    }
    String get_civil_status() { 
        return this.civil_status;
    }
    String get_date_of_birth() { 
        return this.date_of_birth;
    }
    String get_place_of_birth() { 
        return this.place_of_birth;
    }
}