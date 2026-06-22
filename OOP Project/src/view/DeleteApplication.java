package view;

import dao.Sql;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class DeleteApplication extends JPanel {

    public DeleteApplication () {

        setLayout(new BorderLayout());

        //Make JLabel for the top where you navigate to find the record you want to delete
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        //Make JLabel for searching records
        JLabel enterJLabel = new JLabel("Enter ID Number");
        
        //Make JTextField for Input
        JTextField searchJTextField = new JTextField(15);

        //Make JButton 
        JButton searchJButton = new JButton("Search");

        topPanel.add(enterJLabel);
        topPanel.add(searchJTextField);
        topPanel.add(searchJButton);

        //Make a JtextArea to View Record Details
        JTextArea recordJTextArea = new JTextArea();
        recordJTextArea.setEditable(false);
        recordJTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        recordJTextArea.setMargin(new Insets(10,10,10,10));
        recordJTextArea.setText("Search for an Applicant");

        //Make JScrollPane to make the JTextArea scroll
        JScrollPane recordJScrollPane = new JScrollPane(recordJTextArea);


        //Make bottom JPanel for Delete Button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 15,20));

        //Make Delete JButton
        JButton deleteJButton = new JButton("Delete");
        deleteJButton.setBackground(new Color(30,65,150));
        deleteJButton.setForeground(Color.WHITE);
        

        bottomPanel.add(deleteJButton);

         

        








        add(topPanel, BorderLayout.NORTH);
        add(recordJScrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);











    }
    
}
