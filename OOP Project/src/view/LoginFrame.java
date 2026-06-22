package view;

import javax.swing.*;

import dao.Sql;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginFrame extends JFrame{

    private int failedatt = 0;

    //Make the constructor
    public LoginFrame (){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        

        //Set the Logo Label
        /* 
        JLabel logolabel= new JLabel();
        ImageIcon logoIcon = new ImageIcon("C:\\Users\\Aycee\\Documents\\OOP Website_App\\OOP Project\\resources\\Logo.jpg");
        logolabel.setIcon(logoIcon);
        logolabel.setBounds(20,20,150,150);
        mainPanel.add(logolabel);
        */
        
        //Set the Login Frame
        setTitle("BIR Form 1902"); //Set the title of the frame
        setSize(1920, 1080); //Set the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the frame when hitting close button
        setLocationRelativeTo(null); //Center the JFrame on the screen
        setResizable(false); //Make the frame not resizable

        //Set the title Label
        JLabel titleLabel = new JLabel("BIR Form 1902");
        titleLabel.setFont(new Font("Inter", Font.BOLD, 40));
        titleLabel.setBounds(650,200,500,30);
        mainPanel.add(titleLabel);


        //Set the Sign in Label
        JLabel signinLabel = new JLabel("Sign In");
        signinLabel.setFont(new Font("Inter", Font.BOLD, 20));
        signinLabel.setBounds(754,380,150,30);
        mainPanel.add(signinLabel);

        //Set the Username Label
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(680,450,150,30);
        mainPanel.add(usernameLabel);

        //Set the Text Field where users can input their username
        JTextField usernameField = new JTextField();
        usernameField.setBounds(680,480,220,30);
        mainPanel.add(usernameField);

        //Set the Password Label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(680,530,150,30);
        mainPanel.add(passwordLabel);

        //Set Password Field where users can input their Password securely
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(680,560,220,30);
        mainPanel.add(passwordField);

        //Set the Error Text when there's a problem with the input of username password 
        JLabel errorLabel = new JLabel("Invalid Username or Password");
        errorLabel.setBounds(680,410,200,30);
        errorLabel.setVisible(false); //Set Visibility to not visible since it's not initially visible unless there's a invalid input
        errorLabel.setForeground(Color.RED);
        mainPanel.add(errorLabel);
        

        //Set the Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(680,600,220,30);
        loginButton.setBackground(new Color(30,65,150));
        loginButton.setForeground(Color.WHITE);
        mainPanel.add(loginButton);

        

        //Create a login button action listener
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();

                Sql db = new Sql();
                if (db.validateLogin(username, password)) {
                    errorLabel.setVisible(false);
                    dispose();
                    new MainMenuFrame().setVisible(true);

                }else {
                    failedatt++;
                    errorLabel.setVisible(true);

                    if (failedatt >= 3) {
                        JOptionPane.showMessageDialog(null, "Too many failed attempts. Try again later.","Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                    }

                }
            }
        });
        








        add(mainPanel);
        setVisible(true);
    }
    
}
