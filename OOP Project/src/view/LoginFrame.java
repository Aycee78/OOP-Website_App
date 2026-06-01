package view;

import javax.swing.*;
import java.awt.*;


public class LoginFrame extends JFrame{

    //Make the constructor
    public LoginFrame (){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        
        //Set the Login Frame
        setTitle("BIR Form 1902"); //Set the title of the frame
        setSize(1920, 1080); //Set the size of the frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Exit the frame when hitting close button
        setVisible(true); //Make the frame visible
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
        JTextField username = new JTextField();
        username.setBounds(680,480,220,30);
        mainPanel.add(username);

        //Set the Password Label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(680,530,150,30);
        mainPanel.add(passwordLabel);

        //Set Password Field where users can input their Password securely
        JPasswordField password = new JPasswordField();
        password.setBounds(680,560,220,30);
        mainPanel.add(password);

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







        add(mainPanel);
    }
    
}
