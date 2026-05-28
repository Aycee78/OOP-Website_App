import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Sql {
    private static final String DATABASE_URL = "jdbc:sqlite:OOPgroup2finaldb.db";

    // 1. Connect to SQLite database
    public Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(DATABASE_URL);
        } catch (Exception error) {
            System.out.println("Database connection error: " + error.getMessage());
            return null;
        }
    }

    // 2. Validate user login credentials
    public boolean validateLogin(String username, String password) {
        String sqlQuery = "SELECT * FROM users WHERE username = ? AND password = ?;";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException error) {
            System.out.println("Login error: " + error.getMessage());
            return false;
        }
    }

    // 3. Get all locations ordered by name
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
        } catch (SQLException error) {
            System.out.println("Failed to fetch locations: " + error.getMessage());
        }
        return locationList;
    }

    // 4. Save a Taxpayer profile
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
        } catch (SQLException error) {
            System.out.println("Error saving Taxpayer: " + error.getMessage());
        }
        return generatedId;
    }

    // 5. Save Employer
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
        } catch (SQLException error) {
            System.out.println("Error saving Employer: " + error.getMessage());
        }
    }

    // 6. Save Spouse
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
        } catch (SQLException error) {
            System.out.println("Error saving Spouse: " + error.getMessage());
        }
    }

    // 7. Save Dependent
    public void saveDependent(Dependent dependent) {
        String sqlQuery = "INSERT INTO dependents (applicant_id, dependent_fullname, dependent_dob, is_incapacitated) VALUES (?, ?, ?, ?);";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setInt(1, dependent.getApplicant_id());
            preparedStatement.setString(2, dependent.getDependent_fullname());
            preparedStatement.setString(3, dependent.getDependent_dob());
            preparedStatement.setString(4, dependent.getIs_incapacitated());
            
            preparedStatement.executeUpdate();
        } catch (SQLException error) {
            System.out.println("Error saving Dependent: " + error.getMessage());
        }
    }

    // 8. Save Employee Relationship
    public void saveEmployeeRelationship(Employee_Relationship relationship) {
        String sqlQuery = "INSERT INTO employee_relationship (applicant_id, emp_tin, emp_type, hire_date) VALUES (?, ?, ?, ?);";
        try (Connection connection = this.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            
            preparedStatement.setInt(1, relationship.getApplicant_id());
            preparedStatement.setString(2, relationship.getEmp_tin());
            preparedStatement.setString(3, relationship.getEmp_type());
            preparedStatement.setString(4, relationship.getHire_date());
            
            preparedStatement.executeUpdate();
        } catch (SQLException error) {
            System.out.println("Error saving Employee Relationship: " + error.getMessage());
        }
    }

    // 9. Fetch summary of registered taxpayers
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
        } catch (SQLException error) {
            System.out.println("Failed to fetch taxpayers: " + error.getMessage());
        }
        return taxpayerList;
    }
}
