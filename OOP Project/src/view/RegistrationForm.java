package view; 

import javax.swing.*;
import java.awt.*;


public class RegistrationForm extends JFrame {
    //Make the constructor for Jframe or the window for GUI
    public RegistrationForm() {

        setTitle("BIR Form 1902"); //Set the title of the frame
        setSize(1920, 1080); //Set the size of the frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Exit the frame when hitting close button
        setVisible(true); //Make the frame visible

        //Set the logo
        //ImageIcon image = new ImageIcon("Logo.jpg"); //Create an ImageIcon
        //setIconImage(image.getImage()); //Change the frame Icon

        //Initialize Jlabel to display text 

        //Initizlize the Jpanels and add these to the tabbed panes for them 
        // to handle the content of the tabs or sections

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        //Disables the layout manager to edit the panel layout 
        //panel1.setLayout(null);
        //panel2.setLayout(null);
        //panel3.setLayout(null);
        //panel4.setLayout(null);
        //panel5.setLayout(null);

        //Intialize the tabbed Pane which holds the different tabs or sections
        JTabbedPane tabbedpane = new JTabbedPane();
        tabbedpane.setBounds(0,0,1920,1080);
        add(tabbedpane);

        //Make the tabs and add the panels of each tab
        tabbedpane.add("Part I - Taxpayer ", panel1);
        tabbedpane.add("Part II - Spouse", panel2);
        tabbedpane.add("Part III - Dependent", panel3);
        tabbedpane.add("Part IV - Employment", panel4);
        tabbedpane.add("Part V - Employer", panel5);

        //Set the components of Part I - Taxpayer

        //Set taxpayer Label
        JLabel taxpayerLabel = new JLabel("Taxpayer Type");
        taxpayerLabel.setBounds(50,410,100,30);
        panel1.add(taxpayerLabel);

        //Make the JComboBox for Taxpayer Type since it has specific values
        String[] taxtype = {"Local Emloyee", "Resident Alien Employee"};
        JComboBox taxpayerComboBox = new JComboBox<>(taxtype);
        taxpayerComboBox.setBounds(160,410,200,30);
        panel1.add(taxpayerComboBox);

        //Make BIR Reg Date Label
        JLabel BIRregdateLabel = new JLabel("BIR Registration Date");
        BIRregdateLabel.setBounds(400,410,150,30);
        panel1.add(BIRregdateLabel);

        //Make JSpinner for BIR Reg Date
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day = new JLabel("Day");
        JSpinner dayJSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        panel1.add(day);
        panel1.add(dayJSpinner);
        


        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month = new JLabel("Month");
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner monthJSpinner = new JSpinner(new SpinnerListModel(months));
        panel1.add(month);
        panel1.add(monthJSpinner);
        

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year = new JLabel("Year");
        JSpinner yearJSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        panel1.add(year);
        panel1.add(yearJSpinner);


        //Make JLabel for TIN
        JLabel taxpayertinlabel = new JLabel("Taxpayer TIN");
        taxpayertinlabel.setBounds(400,410,150,30);
        panel1.add(taxpayertinlabel);

        //Make JTextField for Taxpayer TIN
        JTextField taxtin = new JTextField();
        taxtin.setBounds(680,480,220,30);
        panel1.add(taxtin);

        //Make JLabel for RDO Code
        JLabel rdocodelabel = new JLabel("RDO Code");
        rdocodelabel.setBounds(400,410,150,30);
        panel1.add(rdocodelabel);

        //Make JTextField for RDO Code
        JTextField rdocode = new JTextField();
        rdocode.setBounds(680,480,220,30);
        panel1.add(rdocode);

        //Make JLabel for Taxpayer FullName
        JLabel taxpayernamelabel = new JLabel("Taxpayer FullName");
        taxpayernamelabel.setBounds(400,410,150,30);
        panel1.add(taxpayernamelabel);

        //Make JTextField for Taxpayer FullName
        JTextField taxpayername = new JTextField();
        taxpayername.setBounds(680,480,220,30);
        panel1.add(taxpayername);

        //Make JLabel for Gender
        JLabel genderlabel = new JLabel("Gender");
        genderlabel.setBounds(400,410,150,30);
        panel1.add(genderlabel);

        //Make the JComboBox for Gender since it has specific values
        String[] gender = {"Male", "Female"};
        JComboBox genderComboBox = new JComboBox<>(gender);
       genderComboBox.setBounds(160,410,200,30);
        panel1.add(genderComboBox);

        



        
    }


}
