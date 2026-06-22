package view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AddApplication extends JPanel{

    public AddApplication() {

        setLayout(new BorderLayout());

        //Intialize the tabbed Pane which holds the different tabs or sections
        JTabbedPane tabbedpane = new JTabbedPane();
        tabbedpane.setBounds(0,0,1920,1080);
       

        //Make the tabs and add the panels of each tab
        tabbedpane.add("Taxpayer", new TaxpayerPanel());
        tabbedpane.add("Spouse", new SpousePanel());
        tabbedpane.add("Dependent", new DependentPanel());
        tabbedpane.add("Employer", new EmployerPanel());

        //Make Bottom Panel for the submit button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        //Make Submit Button on the bottompanel
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(30,65,150));
        submitButton.setForeground(Color.WHITE);
        bottomPanel.add(submitButton);

        //Create a Submit button action listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
                
            }
        });



        add(tabbedpane);
        setVisible(true); //Make the frame visible






    }

    
}

