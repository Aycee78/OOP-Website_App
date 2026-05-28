BIR FORM 1902 - GUI Format

1. YUNG FIELDS

These fields are automatically set in the background DAPAT AND DONT NEED TO BE INPUTTED MANUALLY

Tax Type: Defaults to "Income" -> taxpayer.setTax_type("Income")
Form Type: Defaults to "1902" -> taxpayer.setForm_type("1902")
ATC (Alphanumeric Tax Code): Defaults to "II011" -> taxpayer.setAtc("II011")
Taxpayer Type: Defaults to "Individual" -> taxpayer.setTaxpayer_type("Individual")

Location Data:

Users must not type the Municipality Code.
Dapat they write their town sa municipality field (mun)

Important System Warnings & Constraints

- Don't allow users to apply for a second TIN (possession of multiple TINs is a criminal offense).
- Don't accept dependents who are over 21, married, or employed, unless they are physically or mentally incapacitated.
- Don't allow both husband and wife to claim the additional tax exemption at the same time.
- Please don't allow the wife to claim the exemption without requiring a "Waiver of Husband" if he is currently employed.
- Don't build separate input boxes for first/last names or street/city addresses; force the user to type them as one long string to fit this specific project's architecture.

2. GUI LAYOUT AND FIELD MAPPING

The GUI is split into 4 Wizard Tabs matching BIR Form 1902:

Tab 1: Taxpayer Profile (BIR Part I)
Taxpayer TIN
Field Type: Text input (Format: 000-000-000-000)
Setter: setTaxpayer_tin(...)
Rule: Optional (For applicants who already have a TIN; otherwise can be left empty)

Full Name
Field Type: Text input
Setter: setTaxpayer_fullname(...)
Rule: Required

Gender
Field Type: Dropdown list
Setter: setGender(...)
Rule: Choices are "Male" or "Female"

Civil Status
Field Type: Dropdown list
Setter: setCivil_status(...)
Rule: Choices are "Single", "Married", "Widow/er", "Legally Separated", "With Qualified Dependent Child/ren"

Date of Birth
Field Type: Date input (Format: YYYY-MM-DD)
Setter: setDate_of_birth(...)
Rule: Required

Place of Birth
Field Type: Text input
Setter: setPlace_of_birth(...)
Rule: Required

Citizenship
Field Type: Text input
Setter: setCitizenship(...)
Rule: Defaults to "Filipino"

Other Citizenship
Field Type: Text input
Setter: setOther_citizenship(...)
Rule: Optional (Used if they have dual or other citizenships)

PCN (PhilSys Card Number)
Field Type: Text input
Setter: setPcn(...)
Rule: Optional (Philippine National ID Number)

Full Address
Field Type: Text input
Setter: setFull_address(...)
Rule: Required (e.g., 123 Rizal Street)

Foreign Address
Field Type: Text input
Setter: setForeign_address(...)
Rule: Only required if Citizenship is NOT "Filipino"

Mother's Full Name
Field Type: Text input
Setter: setMother_fullname(...)
Rule: Required

Father's Full Name
Field Type: Text input
Setter: setFather_fullname(...)
Rule: Required

Landline Number
Field Type: Text input
Setter: setLandline(...)
Rule: Optional

Fax Number
Field Type: Text input
Setter: setFax(...)
Rule: Optional

Mobile Number
Field Type: Text input (Format: 09123456789)
Setter: setMobile(...)
Rule: Required (11 digits)

Email Address
Field Type: Text input
Setter: setEmail(...)
Rule: Required (Must match email format)

Verification ID Type
Field Type: Text input or Dropdown (e.g., Passport, Driver's License, UMID)
Setter: setId_type(...)
Rule: Required (Must specify what ID is presented)

Verification ID Number
Field Type: Text input
Setter: setId_number(...)
Rule: Required (Must be a unique ID number)

Verification ID Issue Date
Field Type: Date input (Format: YYYY-MM-DD)
Setter: setId_effectivity(...)
Rule: Required

Verification ID Expiry Date
Field Type: Date input (Format: YYYY-MM-DD)
Setter: setId_expiry(...)
Rule: Required

Verification ID Issuer
Field Type: Text input (e.g., DFA, LTO, SSS)
Setter: setId_issuer(...)
Rule: Required

Verification ID Place of Issuance
Field Type: Text input
Setter: setId_place(...)
Rule: Required

Tab 2: Spouse Details (BIR Part II)
This tab is greyed out by default. It is enabled only if Civil Status in Tab 1 is set to "Married".

Spouse TIN
Field Type: Text input (Format: 000-000-000-000)
Setter: setSpouse_tin(...)
Rule: Required when spouse tab is enabled

Spouse Name
Field Type: Text input
Setter: setSpouse_fullname(...)
Rule: Required when spouse tab is enabled

Employment Status
Field Type: Dropdown list
Setter: setSpouse_employment_status(...)
Rule: Choices are "Unemployed", "Employed Locally", "Employed Abroad", "Engaged in Business/Practice of Profession"

Employer TIN
Field Type: Text input (Format: 000-000-000-000)
Setter: setSpouse_emp_tin(...)
Rule: Required only if Employment Status is active. This saves as spouse_emp_tin in the spouse table, linking this spouse directly to their employer.

Employer Name
Field Type: Text input
Rule: Required only if Employment Status is active. This saves as emp_fullname in the employer table, associated using the spouse_emp_tin above. When displaying, use the spouse_emp_tin to find and display the matching employer name from the database.

Exemption Claimant
Field Type: Radio buttons or toggle selection
Setter: setExemption_claimant(...)
Rule: Mutual choice between "Husband Claims" or "Wife Claims"

Tab 3: Dependent Details (BIR Part IV)
A taxpayer can have multiple dependents (one-to-many relationship). Use a dynamic list or table with Add/Remove buttons.

Dependent ID
Field Type: None
Setter: Automatic (SQLite Auto-Increments)
Rule: Do not set in the GUI.

Full Name
Field Type: Text input
Setter: setDependent_fullname(...)
Rule: Required

Date of Birth
Field Type: Date input (Format: YYYY-MM-DD)
Setter: setDependent_dob(...)
Rule: Required

Incapacitated?
Field Type: Checkbox or Toggle
Setter: setIs_incapacitated(...)
Rule: Checked sends "Yes", Unchecked sends "No"

Tab 4: Primary Employer and History (BIR Part V)
Employer TIN
Field Type: Text input (Format: 000-000-000-000)
Setter: employer.setEmp_tin(...)
Rule: Required if linking employer

Company Name
Field Type: Text input
Setter: employer.setEmp_fullname(...)
Rule: Required if linking employer

Company Address
Field Type: Text input
Setter: employer.setEmp_full_address(...)
Rule: Optional (Stores address of the company)

Employment Type
Field Type: Dropdown list
Setter: relationship.setEmp_type(...)
Rule: Choices are "Primary", "Concurrent", "Successive". If "Primary" is selected, only one employer can be added. If "Concurrent" or "Successive" is selected, the UI should allow the user to choose to add another employer input block to log multiple jobs.

Hire Date
Field Type: Date input (Format: YYYY-MM-DD)
Setter: relationship.setHire_date(...)
Rule: Required if linking employer

3. SUBMISSION FLOW IN THE CODE

Step 1: Check UI Fields (Validation)
Check if name is empty, email matches pattern, dates are filled.

Step 2: Put data into OOP objects
Taxpayer taxpayer = new Taxpayer();
taxpayer.setTaxpayer_fullname(txtName.getText().trim());
taxpayer.setGender((String) cmbGender.getSelectedItem());

Step 3: Save to Database in order

1.  Save taxpayer first to get the generated applicant ID:
    int applicantId = database.saveTaxpayer(taxpayer);

2.  If married, save spouse:
    Spouse spouse = new Spouse();
    spouse.setApplicant_id(applicantId);
    database.saveSpouse(spouse);

3.  Loop through table rows and save dependents:
    child.setApplicant_id(applicantId);
    database.saveDependent(child);


