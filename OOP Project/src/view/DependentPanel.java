package view;

import javax.swing.*;

public class DependentPanel extends JPanel{

    public DependentPanel() {

        setLayout(null);

        //Set the components of Dependents

        //Make JLabel for Dependent Name Title
        JLabel depetitlelabel = new JLabel("Part III - Depdendents Information");
        depetitlelabel.setBounds(40,20,400,30);
        add(depetitlelabel);

        //Make JLabel for Dependent Name 
        JLabel depenamelabel = new JLabel("Name of Qualified Dependent Children");
        depenamelabel.setBounds(40,70,220,30);
        add(depenamelabel);


        //Make JLabel for Dependent 1
        JLabel depename1label = new JLabel("Dependent 1");
        depename1label.setBounds(40,120,150,30);
        add(depename1label);
        
        //Make JTextField for Dependent 1
        JTextField depename1Jtextfield = new JTextField();
        depename1Jtextfield.setBounds(270,120,220,30);
        add(depename1Jtextfield);

        
        
        
        //Make JLabel for Dependent 2
        JLabel depename2label = new JLabel("Dependent 2");
        depename2label.setBounds(40,170,150,30);
        add(depename2label);

        //Make JTextField for Dependent 2
        JTextField depename2Jtextfield = new JTextField();
        depename2Jtextfield.setBounds(270,170,220,30);
        add(depename2Jtextfield);

       
       
       //Make JLabel for Dependent 3
        JLabel depename3label = new JLabel("Dependent 3");
        depename3label.setBounds(40,220,150,30);
        add(depename3label);

        //Make JTextField for Dependent 3
        JTextField depename3Jtextfield = new JTextField();
        depename3Jtextfield.setBounds(270,220,220,30);
        add(depename3Jtextfield);

       
       
        //Make JLabel for Dependent 4
        JLabel depename4label = new JLabel("Dependent 4");
        depename4label.setBounds(40,270,150,30);
        add(depename4label);

        //Make JTextField for Dependent 4
        JTextField depename4Jtextfield = new JTextField();
        depename4Jtextfield.setBounds(270,270,220,30);
        add(depename4Jtextfield);

       
       
       
       
       
       
       
        //Make JLabel for Dependent Date of Birth 
        JLabel depedoblabel = new JLabel("Date of Birth");
        depedoblabel.setBounds(520,70,150,30);
        add(depedoblabel);

        //Make JSpinner for Dependent 1 Date of Birth
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day4 = new JLabel("Day");
        day4.setBounds(520,120,30,30);
        JSpinner day4JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day4JSpinner.setBounds(550,120,40,30);
        add(day4);
        add(day4JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month4 = new JLabel("Month");
        month4.setBounds(600,120,50,30);
        String[] months4 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month4JSpinner = new JSpinner(new SpinnerListModel(months4));
        month4JSpinner.setBounds(650,120,90,30);
        add(month4);
        add(month4JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year4 = new JLabel("Year");
        year4.setBounds(750,120,40,30);
        JSpinner year4JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year4JSpinner.setBounds(790,120,60,30);
        add(year4);
        add(year4JSpinner);

        //Make JSpinner for Dependent 2 Date of Birth
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day5 = new JLabel("Day");
        day5.setBounds(520,170,30,30);
        JSpinner day5JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day5JSpinner.setBounds(550,170,40,30);
        add(day5);
        add(day5JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month5 = new JLabel("Month");
        month5.setBounds(600,170,50,30);
        String[] months5 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month5JSpinner = new JSpinner(new SpinnerListModel(months5));
        month5JSpinner.setBounds(650,170,90,30);
        add(month5);
        add(month5JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year5 = new JLabel("Year");
        year5.setBounds(750,170,40,30);
        JSpinner year5JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year5JSpinner.setBounds(790,170,60,30);
        add(year5);
        add(year5JSpinner);

        //Make JSpinner for Dependent 3 Date of Birth
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day6 = new JLabel("Day");
        day6.setBounds(520,220,30,30);
        JSpinner day6JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day6JSpinner.setBounds(550,220,40,30);
        add(day6);
        add(day6JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month6 = new JLabel("Month");
        month6.setBounds(600,220,50,30);
        String[] months6 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month6JSpinner = new JSpinner(new SpinnerListModel(months6));
        month6JSpinner.setBounds(650,220,90,30);
        add(month6);
        add(month6JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year6 = new JLabel("Year");
        year6.setBounds(750,220,40,30);
        JSpinner year6JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year6JSpinner.setBounds(790,220,60,30);
        add(year6);
        add(year6JSpinner);

        //Make JSpinner for Dependent 4 Date of Birth
        
        //Make Spinner for Day 
        //Creates a spinner that works with numbers only
        //Create a JLabel for Day
        JLabel day7 = new JLabel("Day");
        day7.setBounds(520,270,30,30);
        JSpinner day7JSpinner = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        day7JSpinner.setBounds(550,270,40,30);
        add(day7);
        add(day7JSpinner);
    
        //Make Spinner for Month 
        //Create a string array for of the months to be the source of the spinner
        //Creates a spinner that works with a item list 
        //Create a JLabel for Month
        JLabel month7 = new JLabel("Month");
        month7.setBounds(600,270,50,30);
        String[] months7 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JSpinner month7JSpinner = new JSpinner(new SpinnerListModel(months7));
        month7JSpinner.setBounds(650,270,90,30);
        add(month7);
        add(month7JSpinner);

        //Make Year Spinner
        //Creates a spinner that works with numbers only
        //Create a JLabel for Year
        JLabel year7 = new JLabel("Year");
        year7.setBounds(750,270,40,30);
        JSpinner year7JSpinner = new JSpinner(new SpinnerNumberModel(2000,1900,2026,1));
        year7JSpinner.setBounds(790,270,60,30);
        add(year7);
        add(year7JSpinner);

        
        
        
        
        
        //Make JLabel for Dependent Is Incapacitated
        JLabel depeisincalabel = new JLabel("Is Incapacitated");
        depeisincalabel.setBounds(880,70,120,30);
        add(depeisincalabel);

        //Make the JComboBox for Dependent 1 Is Incapacitated with specific values
        String[] isincapa1 = {"Yes", "No"};
        JComboBox isincapa1ComboBox = new JComboBox<>(isincapa1);
        isincapa1ComboBox.setBounds(880,120,80,30);
        add(isincapa1ComboBox); 

        //Make the JComboBox for Dependent 2 Is Incapacitated with specific values
        String[] isincapa2 = {"Yes", "No"};
        JComboBox isincapa2ComboBox = new JComboBox<>(isincapa2);
        isincapa2ComboBox.setBounds(880,170,80,30);
        add(isincapa2ComboBox);

        //Make the JComboBox for Dependent 3 Is Incapacitated with specific values
        String[] isincapa3 = {"Yes", "No"};
        JComboBox isincapa3ComboBox = new JComboBox<>(isincapa3);
        isincapa3ComboBox.setBounds(880,220,80,30);
        add(isincapa3ComboBox);

        //Make the JComboBox for Dependent 4 Is Incapacitated with specific values
        String[] isincapa4 = {"Yes", "No"};
        JComboBox isincapa4ComboBox = new JComboBox<>(isincapa4);
        isincapa4ComboBox.setBounds(880,270,80,30);
        add(isincapa4ComboBox);


    }
    
}
