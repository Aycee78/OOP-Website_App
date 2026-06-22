package view;

import javax.swing.*;

public class SpousePanel extends JPanel {

    public SpousePanel() {

        setLayout(null);

        //Set the components of Spouse

        //Make JLabel for Spouse Title
        JLabel spoutitlelabel = new JLabel("Part II - Spouse Information");
        spoutitlelabel.setBounds(40,20,400,30);
        add(spoutitlelabel);
        
        //Make JLabel for Spouse Employment Status
        JLabel spouseempstatlabel = new JLabel("Employment Status of Spouse");
        spouseempstatlabel.setBounds(40,70,220,30);
        add(spouseempstatlabel);

        //Make the JComboBox for Spouse Employment Status with specific values
        String[] spouseempstat = {"Unemployed", "Employed Locally", "Employed Abroad", "Engaged in Business/Practice of Profession"};
        JComboBox spouseempstatComboBox = new JComboBox<>(spouseempstat);
        spouseempstatComboBox.setBounds(270,70,350,30);
        add(spouseempstatComboBox);
        
        //Make JLabel for Exemption Claimant
        JLabel exemptclaimlabel = new JLabel("Exemption Claimant");
        exemptclaimlabel.setBounds(40,120,220,30);
        add(exemptclaimlabel);

        //Make the JComboBox for Exemption Claimant with specific values
        String[] exemptclaim = {"Husband Claims", "Wife Claims"};
        JComboBox exemptclaimComboBox = new JComboBox<>(exemptclaim);
        exemptclaimComboBox.setBounds(270,120,350,30);
        add(exemptclaimComboBox);

        //Make JLabel for Spouse Full Name
        JLabel spousenamelabel = new JLabel("Spouse Full Name");
        spousenamelabel.setBounds(40,170,220,30);
        add(spousenamelabel);

        //Make JTextField for Spouse Full Name
        JTextField spousenameJtextfield = new JTextField();
        spousenameJtextfield.setBounds(270,170,350,30);
        add(spousenameJtextfield);
        
        //Make JLabel for Spouse TIN
        JLabel spousetinlabel = new JLabel("Spouse TIN");
        spousetinlabel.setBounds(40,220,220,30);
        add(spousetinlabel);

        //Make JTextField for Spouse TIN
        JTextField spousetinJtextfield = new JTextField();
        spousetinJtextfield.setBounds(270,220,200,30);
        add(spousetinJtextfield);

        //Make JLabel for Spouse Employer Full Name
        JLabel spouseempnamelabel = new JLabel("Employer's Name of Spouse");
        spouseempnamelabel.setBounds(40,270,220,30);
        add(spouseempnamelabel);

        //Make JTextField for Spouse Employer Full Name
        JTextField spouseempnameJtextfield = new JTextField();
        spouseempnameJtextfield.setBounds(270,270,350,30);
        add(spouseempnameJtextfield);

        //Make JLabel for Spouse Employer TIN
        JLabel spouseemptinlabel = new JLabel("Employer's TIN of Spouse");
        spouseemptinlabel.setBounds(40,320,220,30);
        add(spouseemptinlabel);

        //Make JTextField for Spouse Employer TIN
        JTextField spouseemptinJtextfield = new JTextField();
        spouseemptinJtextfield.setBounds(270,320,200,30);
        add(spouseemptinJtextfield);


        
    }
    
}
