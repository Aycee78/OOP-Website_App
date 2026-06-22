package view;

//import javax.swing.JPanel;

public class App {
    public static void main(String[] args) {
        //Create GUI components in EDT not in the Main so its safe to make the GUI. 
        javax.swing.SwingUtilities.invokeLater(() -> {
            //Create an object of the RegistrationForm to build the GUI. 
            //new RegistrationForm();
            new LoginFrame().setVisible(true);
            //new MainMenuFrame().setVisible(true);

        });

    }
}


