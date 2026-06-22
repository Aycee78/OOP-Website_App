package view;

import java.awt.*;

import javax.swing.*;

public class ReportPanel extends JPanel {

    //Make variables for total applications and pending applications
    private JLabel totalapp;
    private JLabel pendingapp;

    public ReportPanel () {

        //Set the Main Layout
        setLayout(new BorderLayout());

        //Make title JPanel with FlowLayout to center the Report Summary Title
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        //Make title for Report Summary
        JLabel reporttitle = new JLabel("REPORT SUMMARY");
        reporttitle.setFont(new Font("Arial", Font.BOLD, 20));
        
        //Add report title JLabel to titlePanel
        titlePanel.add(reporttitle);

        //Add title panel to ReportPanel
        add(titlePanel, BorderLayout.NORTH);





        //Make center Panel for left and right panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1,2,40,5));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(100,200,100,200));
        


        //Make Left Panel for Total Applications
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(2,1));
        leftPanel.setBackground(new Color(30,65,150));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        

        //Make JLabel for Total Applications
        JLabel totalappLabel = new JLabel("Total Applications", SwingConstants.CENTER);
        totalappLabel.setFont(new Font("Arial", Font.BOLD,30));
        totalappLabel.setForeground(Color.WHITE);
        
        //Make JLabel for the actual total application using the totalapp JLabel variable
        totalapp = new JLabel("0", SwingConstants.CENTER);
        totalapp.setFont(new Font("Arial", Font.BOLD,40));
        totalapp.setForeground(Color.WHITE);

        leftPanel.add(totalappLabel);
        leftPanel.add(totalapp);





        //Make Right Panel for Pending Applications
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2,1));
        rightPanel.setBackground(new Color(30,65,150));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        //Make JLabel for Total Applications
        JLabel pendappLabel = new JLabel("Pending Applications", SwingConstants.CENTER);
        pendappLabel.setFont(new Font("Arial", Font.BOLD,30));
        pendappLabel.setForeground(Color.WHITE);
        
        //Make JLabel for the actual total application using the totalapp JLabel variable
        pendingapp = new JLabel("0", SwingConstants.CENTER);
        pendingapp.setFont(new Font("Arial", Font.BOLD,40));
        pendingapp.setForeground(Color.WHITE);

        rightPanel.add(pendappLabel);
        rightPanel.add(pendingapp);


        //Add the Left and Right Panels to Center Panel
        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);

        //Add centerPanel to ReportPanel
        add(centerPanel, BorderLayout.CENTER);


    }
    
}
