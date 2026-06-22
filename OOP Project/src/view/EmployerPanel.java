package view;

import javax.swing.*;

public class EmployerPanel extends JPanel{

    public EmployerPanel() {
        
        setLayout(null);

        //Make JLabel for Employer Title
        JLabel empltitlelabel = new JLabel("Part IV - Primary Employer Information");
        empltitlelabel.setBounds(40,20,400,30);
        add(empltitlelabel);

        //Make JLabel for Type of Employment
        JLabel typeofemplabel = new JLabel("Type of Employment");
        typeofemplabel.setBounds(40,70,220,30);
        add(typeofemplabel);

        //Make the JComboBox for Type of Registering Office with specific values
        String[] typeofemp = {"Primary"};
        JComboBox typeofempComboBox = new JComboBox<>(typeofemp);
        typeofempComboBox.setBounds(270,70,220,30);
        add(typeofempComboBox);

        //Make JLabel for Type of Registering Office
        JLabel typeofreglabel = new JLabel("Type of Registering Office");
        typeofreglabel.setBounds(40,120,220,30);
        add(typeofreglabel);

        //Make the JComboBox for Type of Registering Office with specific values
        String[] typeofreg = {"Head Office", "Branch Office"};
        JComboBox typeofregComboBox = new JComboBox<>(typeofreg);
        typeofregComboBox.setBounds(270,120,220,30);
        add(typeofregComboBox);

        //Make JLabel for Employer TIN 
        JLabel emptinlabel = new JLabel("Employer TIN");
        emptinlabel.setBounds(40,170,220,30);
        add(emptinlabel);

        //Make JTextField for Employer TIN
        JTextField emptinJtextfield = new JTextField();
        emptinJtextfield.setBounds(270,170,220,30);
        add(emptinJtextfield);

        //Make JLabel for Employer Name 
        JLabel empamelabel = new JLabel("Employer's Name");
        empamelabel.setBounds(40,220,220,30);
        add(empamelabel);

        //Make JTextField for Employer Name
        JTextField empameJtextfield = new JTextField();
        empameJtextfield.setBounds(270,220,220,30);
        add(empameJtextfield);

        //Make JLabel for Employer Address 
        JLabel empaddrlabel = new JLabel("Employer's Address");
        empaddrlabel.setBounds(40,270,220,30);
        add(empaddrlabel);

        //Make JTextField for Employer Address
        JTextField  empaddrJtextfield = new JTextField();
         empaddrJtextfield.setBounds(270,270,220,30);
        add( empaddrJtextfield);

        //Make JLabel for Relationship Start Date
        JLabel relstartlabel = new JLabel("Relationship Start Date");
        relstartlabel.setBounds(40,320,220,30);
        add(relstartlabel);

        //Make JSpinner for Relationship Start Date
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day8 = new JLabel("Day");
        day8.setBounds(270,320,30,30);
        JSpinner day8JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day8JSpinner.setBounds(305,320,40,30);
        add(day8);
        add(day8JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month8 = new JLabel("Month");
        month8.setBounds(352,320,45,30);
        String[] months8 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month8JSpinner = new JSpinner(new SpinnerListModel(months8));
        month8JSpinner.setBounds(400,320,90,30);
        add(month8);
        add(month8JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year8 = new JLabel("Year");
        year8.setBounds(497,320,35,30);
        JSpinner year8JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year8JSpinner.setBounds(532,320,60,30);
        add(year8);
        add(year8JSpinner);

        //Make JLabel for Contact Number
        JLabel contnumlabel = new JLabel("Contact Number");
        contnumlabel.setBounds(40,370,220,30);
        add(contnumlabel);

        //Make JTextField for Contact Number
        JTextField contnumJtextfield = new JTextField();
        contnumJtextfield.setBounds(270,370,220,30);
        add(contnumJtextfield);

        //Make JLabel for Municipality Code
        JLabel municicodelabel = new JLabel("Municipality Code");
        municicodelabel.setBounds(40,420,220,30);
        add(municicodelabel);

        //Make JTextField for Municipality Code
        JTextField municicodeJtextfield = new JTextField();
        municicodeJtextfield.setBounds(270,420,220,30);
        add(municicodeJtextfield);

        //Make JLabel for Effectivity Date
        JLabel effedatelabel = new JLabel("Effectivity Date of Exemption");
        effedatelabel.setBounds(40,470,220,30);
        add(effedatelabel);

        //Make JSpinner for Effectivity Date
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day9 = new JLabel("Day");
        day9.setBounds(270,470,30,30);
        JSpinner day9JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day9JSpinner.setBounds(305,470,40,30);
        add(day9);
        add(day9JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month9 = new JLabel("Month");
        month9.setBounds(352,470,45,30);
        String[] months9 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month9JSpinner = new JSpinner(new SpinnerListModel(months9));
        month9JSpinner.setBounds(400,470,90,30);
        add(month9);
        add(month9JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year9 = new JLabel("Year");
        year9.setBounds(497,470,35,30);
        JSpinner year9JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year9JSpinner.setBounds(532,470,60,30);
        add(year9);
        add(year9JSpinner);








        //Make JLabel for Successive or Concurrent Title 
        JLabel succorconlabel = new JLabel("Successsive or Concurrent Employer Information");
        succorconlabel.setBounds(650,20,400,30);
        add(succorconlabel);
        
        //Make JLabel for Successive or Concurrent Type of Employment
        JLabel succorcon1label = new JLabel("Type of Employment");
        succorcon1label.setBounds(650,70,220,30);
        add(succorcon1label);

        //Make the JComboBox for Successive or Concurrent Type of Employment with specific values
        String[] succorcon = {"Successive", "Conurrent"};
        JComboBox succorconComboBox = new JComboBox<>(succorcon);
        succorconComboBox.setBounds(880,70,220,30);
        add(succorconComboBox);

        //Make JLabel for Successive or Concurrent Employer Name 
        JLabel empame1label = new JLabel("Employer's Name");
        empame1label.setBounds(650,120,220,30);
        add(empame1label);

        //Make JTextField for Successive or Concurrent Employer Name
        JTextField empame1Jtextfield = new JTextField();
        empame1Jtextfield.setBounds(880,120,220,30);
        add(empame1Jtextfield);

        //Make JLabel for Successive or Concurrent Employer TIN 
        JLabel emptin1label = new JLabel("Employer TIN");
        emptin1label.setBounds(650,170,220,30);
        add(emptin1label);

        //Make JTextField for Successive or Concurrent Employer TIN
        JTextField emptin1Jtextfield = new JTextField();
        emptin1Jtextfield.setBounds(880,170,220,30);
        add(emptin1Jtextfield);
    }



    
}
