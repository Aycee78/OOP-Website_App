package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Dependent;
import model.Employee_Relationship;
import model.Employer;
import model.Location;
import model.Spouse;
import model.Taxpayer;

public class Sql {
    // Database connection URL
    private static final String DATABASE_URL = "jdbc:sqlite:C:/Users/Aycee/Documents/OOP Website_App/OOP Project/OOPgroup2finaldb.db";

    // Connect to the SQLite database
    public Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        return DriverManager.getConnection(DATABASE_URL);
    }

    // Check if the login username and password are correct
    public boolean validateLogin(String username, String password) {
        String sqlQuery = "SELECT * FROM users WHERE username = ? AND password = ?;";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (Exception error) {
            System.out.println("Login error: " + error.getMessage());
            return false;
        }
    }

    // Check if a taxpayer is already registered in the database by their full name or TIN
    public boolean checkTaxpayerExists(String fullName, String tin) {
        String sqlQuery;
        if (tin != null && !tin.trim().isEmpty()) {
            sqlQuery = "SELECT * FROM taxpayer WHERE taxpayer_fullname = ? OR taxpayer_tin = ?;";
        } else {
            sqlQuery = "SELECT * FROM taxpayer WHERE taxpayer_fullname = ?;";
        }

        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setString(1, fullName);
            if (tin != null && !tin.trim().isEmpty()) {
                preparedStatement.setString(2, tin);
            }
            
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (Exception error) {
            System.out.println("Error checking: " + error.getMessage());
            return false;
        }
    }

    // Find all towns/municipalities from the database
    public List<Location> getLocations() {
        List<Location> locationList = new ArrayList<>();
        String sqlQuery = "SELECT mun_code, mun, rdo_code FROM location ORDER BY mun ASC;";
        try (Connection connection = this.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            
            while (resultSet.next()) {
                Location location = new Location(
                    resultSet.getString("mun_code"),
                    resultSet.getString("mun"),
                    resultSet.getString("rdo_code")
                );
                locationList.add(location);
            }
        } catch (Exception error) {
            System.out.println("Failed to find locations: " + error.getMessage());
        }
        return locationList;
    }

    // Save a new taxpayer profile and return their generated ID number
    public int saveTaxpayer(Taxpayer taxpayer) {
        String sqlQuery = "INSERT INTO taxpayer (taxpayer_tin, bir_reg_date, pcn, taxpayer_type, taxpayer_fullname, gender, civil_status, date_of_birth, place_of_birth, citizenship, other_citizenship, mother_fullname, father_fullname, full_address, foreign_address, mun_code, zip_code, landline, fax, mobile, email, tax_type, form_type, atc, id_type, id_number, id_effectivity, id_expiry, id_issuer, id_place) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        int generatedId = -1;

        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS)) {
            
            preparedStatement.setString(1, taxpayer.getTaxpayer_tin());
            preparedStatement.setString(2, taxpayer.getBir_reg_date());
            preparedStatement.setString(3, taxpayer.getPcn());
            preparedStatement.setString(4, taxpayer.getTaxpayer_type());
            preparedStatement.setString(5, taxpayer.getTaxpayer_fullname());
            preparedStatement.setString(6, taxpayer.getGender());
            preparedStatement.setString(7, taxpayer.getCivil_status());
            preparedStatement.setString(8, taxpayer.getDate_of_birth());
            preparedStatement.setString(9, taxpayer.getPlace_of_birth());
            preparedStatement.setString(10, taxpayer.getCitizenship());
            preparedStatement.setString(11, taxpayer.getOther_citizenship());
            preparedStatement.setString(12, taxpayer.getMother_fullname());
            preparedStatement.setString(13, taxpayer.getFather_fullname());
            preparedStatement.setString(14, taxpayer.getFull_address());
            preparedStatement.setString(15, taxpayer.getForeign_address());
            preparedStatement.setString(16, taxpayer.getMun_code());
            preparedStatement.setString(17, taxpayer.getZip_code());
            preparedStatement.setString(18, taxpayer.getLandline());
            preparedStatement.setString(19, taxpayer.getFax());
            preparedStatement.setString(20, taxpayer.getMobile());
            preparedStatement.setString(21, taxpayer.getEmail());
            preparedStatement.setString(22, taxpayer.getTax_type());
            preparedStatement.setString(23, taxpayer.getForm_type());
            preparedStatement.setString(24, taxpayer.getAtc());
            preparedStatement.setString(25, taxpayer.getId_type());
            preparedStatement.setString(26, taxpayer.getId_number());
            preparedStatement.setString(27, taxpayer.getId_effectivity());
            preparedStatement.setString(28, taxpayer.getId_expiry());
            preparedStatement.setString(29, taxpayer.getId_issuer());
            preparedStatement.setString(30, taxpayer.getId_place());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                generatedId = resultSet.getInt(1);
            }
        } catch (Exception error) {
            System.out.println("Error saving Taxpayer: " + error.getMessage());
        }
        return generatedId;
    }

    // Save employer details (skips if they are already in the database)
    public void saveEmployerIfNotExists(Employer employer) {
        String sqlQuery = "INSERT OR IGNORE INTO employer (emp_tin, emp_fullname, emp_full_address, zip_code, emp_landline, emp_mun_code, registering_office_type) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setString(1, employer.getEmp_tin());
            preparedStatement.setString(2, employer.getEmp_fullname());
            preparedStatement.setString(3, employer.getEmp_full_address());
            preparedStatement.setString(4, employer.getZip_code());
            preparedStatement.setString(5, employer.getEmp_landline());
            preparedStatement.setString(6, employer.getEmp_mun_code());
            preparedStatement.setString(7, employer.getRegistering_office_type());
            
            preparedStatement.executeUpdate();
        } catch (Exception error) {
            System.out.println("Error saving Employer: " + error.getMessage());
        }
    }

    // Save spouse details linked to the taxpayer ID
    public void saveSpouse(Spouse spouse) {
        String sqlQuery = "INSERT INTO spouse (applicant_id, spouse_fullname, spouse_employment_status, exemption_claimant, spouse_emp_tin, spouse_tin) VALUES (?, ?, ?, ?, ?, ?);";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setInt(1, spouse.getApplicant_id());
            preparedStatement.setString(2, spouse.getSpouse_fullname());
            preparedStatement.setString(3, spouse.getSpouse_employment_status());
            preparedStatement.setString(4, spouse.getExemption_claimant());
            
            if (spouse.getSpouse_emp_tin() != null) {
                preparedStatement.setString(5, spouse.getSpouse_emp_tin());
            } else {
                preparedStatement.setNull(5, java.sql.Types.VARCHAR);
            }
            
            preparedStatement.setString(6, spouse.getSpouse_tin());
            preparedStatement.executeUpdate();
        } catch (Exception error) {
            System.out.println("Error saving Spouse: " + error.getMessage());
        }
    }

    // Save a dependent linked to the taxpayer ID
    public void saveDependent(Dependent dependent) {
        String sqlQuery = "INSERT INTO dependents (applicant_id, dependent_fullname, dependent_dob, is_incapacitated) VALUES (?, ?, ?, ?);";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setInt(1, dependent.getApplicant_id());
            preparedStatement.setString(2, dependent.getDependent_fullname());
            preparedStatement.setString(3, dependent.getDependent_dob());
            preparedStatement.setString(4, dependent.getIs_incapacitated());
            
            preparedStatement.executeUpdate();
        } catch (Exception error) {
            System.out.println("Error saving Dependent: " + error.getMessage());
        }
    }

    // Link a taxpayer to an employer (job record)
    public void saveEmployeeRelationship(Employee_Relationship relationship) {
        String checkSql = "SELECT bir_reg_date FROM taxpayer WHERE applicant_id = ?;";
        String taxpayerRegDate = null;
        try (Connection connection = this.connect();
             PreparedStatement checkStmt = connection.prepareStatement(checkSql)) {
            checkStmt.setInt(1, relationship.getApplicant_id());
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    taxpayerRegDate = rs.getString("bir_reg_date");
                }
            }
        } catch (Exception error) {
            System.out.println("Failed to fetch taxpayer registration date: " + error.getMessage());
        }

        if (taxpayerRegDate != null && relationship.getHire_date() != null) {
            try {
                java.time.LocalDate regDate = java.time.LocalDate.parse(taxpayerRegDate);
                java.time.LocalDate hireDate = java.time.LocalDate.parse(relationship.getHire_date());
                long days = java.time.temporal.ChronoUnit.DAYS.between(hireDate, regDate);
                if (days > 10) {
                    throw new IllegalArgumentException("Filing deadline violated: Must be registered within 10 days from the hire date. Elapsed: " + days + " days.");
                }
            } catch (java.time.format.DateTimeParseException e) {
                // Ignore parsing errors, or handle
            }
        }

        String sqlQuery = "INSERT INTO employee_relationship (applicant_id, emp_tin, emp_type, hire_date) VALUES (?, ?, ?, ?);";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setInt(1, relationship.getApplicant_id());
            preparedStatement.setString(2, relationship.getEmp_tin());
            preparedStatement.setString(3, relationship.getEmp_type());
            preparedStatement.setString(4, relationship.getHire_date());
            
            preparedStatement.executeUpdate();
        } catch (Exception error) {
            System.out.println("Error saving Employee Relationship: " + error.getMessage());
        }
    }

    // Get a list of all registered taxpayers
    public List<Taxpayer> getAllTaxpayers() {
        List<Taxpayer> taxpayerList = new ArrayList<>();
        String sqlQuery = "SELECT applicant_id, taxpayer_fullname, taxpayer_tin, email, mobile, civil_status FROM taxpayer ORDER BY applicant_id DESC;";
        try (Connection connection = this.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            
            while (resultSet.next()) {
                Taxpayer taxpayer = new Taxpayer();
                taxpayer.setApplicant_id(resultSet.getInt("applicant_id"));
                taxpayer.setTaxpayer_fullname(resultSet.getString("taxpayer_fullname"));
                taxpayer.setTaxpayer_tin(resultSet.getString("taxpayer_tin"));
                taxpayer.setEmail(resultSet.getString("email"));
                taxpayer.setMobile(resultSet.getString("mobile"));
                taxpayer.setCivil_status(resultSet.getString("civil_status"));
                taxpayerList.add(taxpayer);
            }
        } catch (Exception error) {
            System.out.println("Failed to find taxpayers: " + error.getMessage());
        }
        return taxpayerList;
    }
}
