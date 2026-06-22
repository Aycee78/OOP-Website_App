package view;

import javax.swing.*;


public class TaxpayerPanel extends JPanel {

    public TaxpayerPanel() {

        setLayout(null);


        //Set the components of Taxpayer

        //Make JLabel for Taxpayer Title
        JLabel taxptitlelabel = new JLabel("Part I - Taxpayer Information");
        taxptitlelabel.setBounds(40,20,400,30);
        add(taxptitlelabel);


        //Set taxpayer Label
        JLabel taxpayerLabel = new JLabel("Taxpayer Type");
        taxpayerLabel.setBounds(40,70,220,30);
        add(taxpayerLabel);

        //Make the JComboBox for Taxpayer Type since it has specific values
        String[] taxtype = {"Local Emloyee", "Resident Alien Employee"};
        JComboBox taxpayerComboBox = new JComboBox<>(taxtype);
        taxpayerComboBox.setBounds(270,70,220,30);
        add(taxpayerComboBox);





        //Make BIR Reg Date Label
        JLabel BIRregdateLabel = new JLabel("BIR Registration Date (MM/DD/YYYY)");
        BIRregdateLabel.setBounds(40,120,220,30);
        add(BIRregdateLabel);

        //Make JSpinner for BIR Reg Date
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day = new JLabel("Day");
        day.setBounds(270,120,30,30);
        JSpinner dayJSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        dayJSpinner.setBounds(305,120,40,30);
        add(day);
        add(dayJSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month = new JLabel("Month");
        month.setBounds(352,120,45,30);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner monthJSpinner = new JSpinner(new SpinnerListModel(months));
        monthJSpinner.setBounds(400,120,90,30);
        add(month);
        add(monthJSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year = new JLabel("Year");
        year.setBounds(497,120,35,30);
        JSpinner yearJSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        yearJSpinner.setBounds(532,120,60,30);
        add(year);
        add(yearJSpinner);







        //Make JLabel for TIN
        JLabel taxpayertinlabel = new JLabel("Taxpayer TIN");
        taxpayertinlabel.setBounds(40,170,220,30);
        add(taxpayertinlabel);

        //Make JTextField for Taxpayer TIN
        JTextField taxtin = new JTextField();
        taxtin.setBounds(270,170,220,30);
        add(taxtin);

        //Make JLabel for RDO Code
        JLabel rdocodelabel = new JLabel("RDO Code");
        rdocodelabel.setBounds(40,220,220,30);
        add(rdocodelabel);

        //Make JTextField for RDO Code
        JTextField rdocode = new JTextField();
        rdocode.setBounds(270,220,220,30);
        add(rdocode);

        //Make JLabel for Taxpayer FullName
        JLabel taxpayernamelabel = new JLabel("Taxpayer FullName");
        taxpayernamelabel.setBounds(40,270,220,30);
        add(taxpayernamelabel);

        //Make JTextField for Taxpayer FullName
        JTextField taxpayername = new JTextField();
        taxpayername.setBounds(270,270,220,30);
        add(taxpayername);

        //Make JLabel for Civil Status
        JLabel civilstatuslabel = new JLabel("Civil Status");
        civilstatuslabel.setBounds(40,320,220,30);
        add(civilstatuslabel);

        //Make JTextField for Civil Status
        JTextField civilstatusJtextfield = new JTextField();
        civilstatusJtextfield.setBounds(270,320,220,30);
        add(civilstatusJtextfield);

        //Make JLabel for Gender
        JLabel genderlabel = new JLabel("Gender");
        genderlabel.setBounds(40,370,220,30);
        add(genderlabel);

        //Make the JComboBox for Gender since it has specific values
        String[] gender = {"Male", "Female"};
        JComboBox genderComboBox = new JComboBox<>(gender);
        genderComboBox.setBounds(270,370,220,30);
        add(genderComboBox);







        //Make Date of Birth Label
        JLabel dobLabel = new JLabel("Date of Birth (MM/DD/YYYY)");
        dobLabel.setBounds(40,420,220,30);
        add(dobLabel);

        //Make JSpinner for Date of Birth
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day1 = new JLabel("Day");
        day1.setBounds(270,420,30,30);
        JSpinner day1JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day1JSpinner.setBounds(305,420,40,30);
        add(day1);
        add(day1JSpinner);

        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month1 = new JLabel("Month");
        month1.setBounds(352,420,45,30);
        String[] months1 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month1JSpinner = new JSpinner(new SpinnerListModel(months1));
        month1JSpinner.setBounds(400,420,90,30);
        add(month1);
        add(month1JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year1 = new JLabel("Year");
        year1.setBounds(497,420,35,30);
        JSpinner year1JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year1JSpinner.setBounds(532,420,60,30);
        add(year1);
        add(year1JSpinner);

        //Make JLabel for Place of Birth
        JLabel placeoblabel = new JLabel("Place of Birth");
        placeoblabel.setBounds(40,470,220,30);
        add(placeoblabel);

        //Make JTextField for Place of Birth
        JTextField placeobJtextfield = new JTextField();
        placeobJtextfield.setBounds(270,470,220,30);
        add(placeobJtextfield);

        //Make JLabel for Mother's Maiden Name
        JLabel mothernamelabel = new JLabel("Mother's Maiden Name");
        mothernamelabel.setBounds(40,520,220,30);
        add(mothernamelabel);

        //Make JTextField for Mother's Maiden Name
        JTextField mothernameJtextfield = new JTextField();
        mothernameJtextfield.setBounds(270,520,220,30);
        add(mothernameJtextfield);

        //Make JLabel for Father's Name
        JLabel  fathernamelabel = new JLabel("Father's Name");
        fathernamelabel.setBounds(40,570,220,30);
        add(fathernamelabel);

        //Make JTextField for Father's Name
        JTextField fathernameJtextfield = new JTextField();
        fathernameJtextfield.setBounds(270,570,220,30);
        add(fathernameJtextfield);

        //Make JLabel for Citizenship
        JLabel  citizenshiplabel = new JLabel("Citizenship");
        citizenshiplabel.setBounds(40,620,220,30);
        add(citizenshiplabel);

        //Make JTextField for Citizenship
        JTextField citizenshipJtextfield = new JTextField();
        citizenshipJtextfield.setBounds(270,620,220,30);
        add(citizenshipJtextfield);

        //Make JLabel for Other Citizenship
        JLabel  othercitizenlabel = new JLabel("Other Citizenship");
        othercitizenlabel.setBounds(40,670,220,30);
        add(othercitizenlabel);

        //Make JTextField for Other Citizenship
        JTextField othercitizenJtextfield = new JTextField();
        othercitizenJtextfield.setBounds(270,670,220,30);
        add(othercitizenJtextfield);








        
        
        
        //Make JLabel for Identification Details
        JLabel  iddetailslabel = new JLabel("Identification Details");
        iddetailslabel.setBounds(650,20,220,30);
        add(iddetailslabel);

        //Make JLabel for ID Type
        JLabel  idtypelabel = new JLabel("Identification Type");
        idtypelabel.setBounds(650,70,220,30);
        add(idtypelabel);

        //Make JTextField for ID Type
        JTextField idtypeJtextfield = new JTextField();
        idtypeJtextfield.setBounds(880,70,220,30);
        add(idtypeJtextfield);

        //Make JLabel for ID Number
        JLabel  idnumlabel = new JLabel("Identification Number");
        idnumlabel.setBounds(650,120,220,30);
        add(idnumlabel);

        //Make JTextField for ID Number
        JTextField idnumJtextfield = new JTextField();
        idnumJtextfield.setBounds(880,120,220,30);
        add(idnumJtextfield);






        //Make JLabel for Effective Date
        JLabel  effectdatelabel = new JLabel("Effective Date (MM/DD/YYYY)");
        effectdatelabel.setBounds(650,270,220,30);
        add(effectdatelabel);
        
        //Make JSpinner for Effective Date
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day2 = new JLabel("Day");
        day2.setBounds(880,270,30,30);
        JSpinner day2JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day2JSpinner.setBounds(915,270,40,30);
        add(day2);
        add(day2JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month2 = new JLabel("Month");
        month2.setBounds(962,270,45,30);
        String[] months2 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month2JSpinner = new JSpinner(new SpinnerListModel(months2));
        month2JSpinner.setBounds(1010,270,90,30);
        add(month2);
        add(month2JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year2 = new JLabel("Year");
        year2.setBounds(1107,270,35,30);
        JSpinner year2JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year2JSpinner.setBounds(1142,270,60,30);
        add(year2);
        add(year2JSpinner);






        //Make JLabel for Expiry Date
        JLabel  expirydatelabel = new JLabel("Expiry Date (MM/DD/YYYY)");
        expirydatelabel.setBounds(650,320,220,30);
        add(expirydatelabel);
        
        //Make JSpinner for Expiry Date
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day3 = new JLabel("Day");
        day3.setBounds(880,320,270,30);
        JSpinner day3JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day3JSpinner.setBounds(915,320,40,30);
        add(day3);
        add(day3JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month3 = new JLabel("Month");
        month3.setBounds(962,320,45,30);
        String[] months3 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month3JSpinner = new JSpinner(new SpinnerListModel(months3));
        month3JSpinner.setBounds(1010,320,90,30);
        add(month3);
        add(month3JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year3 = new JLabel("Year");
        year3.setBounds(1107,320,35,30);
        JSpinner year3JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year3JSpinner.setBounds(1142,320,60,30);
        add(year3);
        add(year3JSpinner);





        

         //Make JLabel for ID Issuer
        JLabel  idissuerlabel = new JLabel("Identification Issuer");
        idissuerlabel.setBounds(650,170,220,30);
        add(idissuerlabel);

        //Make JTextField for ID Issuer
        JTextField idissuerJtextfield = new JTextField();
        idissuerJtextfield.setBounds(880,170,220,30);
        add(idissuerJtextfield);

        //Make JLabel for Place/Country of Issue
        JLabel  idplacelabel = new JLabel("Identification Place/Country of Issue");
        idplacelabel.setBounds(650,220,220,30);
        add(idplacelabel);

        //Make JTextField for Place/Country of Issue
        JTextField idplaceJtextfield = new JTextField();
        idplaceJtextfield.setBounds(880,220,220,30);
        add(idplaceJtextfield);







        //Make JLabel for Preferred Contact Type
        JLabel  prefercontacttypelabel = new JLabel("Preferred Contact Type");
        prefercontacttypelabel.setBounds(650,370,220,30);
        add(prefercontacttypelabel);

        //Make JLabel for Landline
        JLabel landlinelabel = new JLabel("Landline");
        landlinelabel.setBounds(650,420,220,30);
        add(landlinelabel);

        //Make JTextField for Landline
        JTextField landlineJtextfield = new JTextField();
        landlineJtextfield.setBounds(880,420,220,30);
        add(landlineJtextfield);

        //Make JLabel for Mobile Number
        JLabel mobilenumlabel = new JLabel("Mobile Number");
        mobilenumlabel.setBounds(650,470,220,30);
        add(mobilenumlabel);

        //Make JTextField for Mobile Number
        JTextField mobilenumJtextfield = new JTextField();
        mobilenumJtextfield.setBounds(880,470,220,30);
        add(mobilenumJtextfield);

        //Make JLabel for Fax Number
        JLabel faxnumlabel = new JLabel("Fax Number");
        faxnumlabel.setBounds(650,520,220,30);
        add(faxnumlabel);

        //Make JTextField for Fax Number
        JTextField faxnumJtextfield = new JTextField();
        faxnumJtextfield.setBounds(880,520,220,30);
        add(faxnumJtextfield);

        //Make JLabel for Email Address
        JLabel emailaddlabel = new JLabel("Email Address (required)");
        emailaddlabel.setBounds(650,570,220,30);
        add(emailaddlabel);

        //Make JTextField for Email Address
        JTextField emailaddJtextfield = new JTextField();
        emailaddJtextfield.setBounds(880,570,220,30);
        add(emailaddJtextfield);

        //Make JLabel for Local Address
        JLabel localaddresslabel = new JLabel("Local Residence Address");
        localaddresslabel.setBounds(650,620,220,30);
        add(localaddresslabel);

        //Make JTextField for Local Address
        JTextField localaddressJtextfield = new JTextField();
        localaddressJtextfield.setBounds(880,620,220,30);
        add(localaddressJtextfield);

        //Make JLabel for Foreign Address
        JLabel foreignaddresslabel = new JLabel("Foreign Address");
        foreignaddresslabel.setBounds(650,670,220,30);
        add(foreignaddresslabel);

        //Make JTextField for Foreign Address
        JTextField foreignaddressJtextfield = new JTextField();
        foreignaddressJtextfield.setBounds(880,670,220,30);
        add(foreignaddressJtextfield);







        //Make JLabel for Municipality
        JLabel municipalitylabel = new JLabel("Municipality");
        municipalitylabel.setBounds(1160,70,180,30);
        add(municipalitylabel);

        //Make JTextField for Municipality
        JTextField municipalityJtextfield = new JTextField();
        municipalityJtextfield.setBounds(1280,70,220,30);
        add(municipalityJtextfield);

        //Make JLabel for Tax Type
        JLabel taxtypelabel = new JLabel("Tax Type");
        taxtypelabel.setBounds(1160,120,180,30);
        add(taxtypelabel);

        //Make JTextField for Tax Type
        JTextField taxtypeJtextfield = new JTextField();
        taxtypeJtextfield.setBounds(1280,120,220,30);
        add(taxtypeJtextfield);

        //Make JLabel for Form Type
        JLabel formtypelabel = new JLabel("Form Type");
        formtypelabel.setBounds(1160,170,180,30);
        add(formtypelabel);

        //Make JTextField for Form Type
        JTextField formtypeJtextfield = new JTextField();
        formtypeJtextfield.setBounds(1280,170,220,30);
        add(formtypeJtextfield);

        //Make JLabel for ATC
        JLabel atclabel = new JLabel("ATC");
        atclabel.setBounds(1160,220,180,30);
        add(atclabel);

        //Make JTextField for ATC
        JTextField atcJtextfield = new JTextField();
        atcJtextfield.setBounds(1280,220,220,30);
        add(atcJtextfield);
    }
    
}
