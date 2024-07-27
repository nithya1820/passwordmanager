import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JLabel messageLabel;

    public LoginFrame() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false); // Prevent resizing

        // Create CardLayout for switching between panels
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel loginPanel = new JPanel(new GridLayout(3, 2, 5, 5)); // Add some padding
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding around the panel
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set font and size
        loginPanel.add(usernameLabel);
        usernameField = new JTextField();
        loginPanel.add(usernameField);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set font and size
        loginPanel.add(passwordLabel);
        passwordField = new JPasswordField();
        loginPanel.add(passwordField);
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14)); // Set font and size
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);
        messageLabel = new JLabel();
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 12)); // Set font and size
        loginPanel.add(messageLabel);
        cardPanel.add(loginPanel, "login");
        cardPanel.setBackground(Color.lightGray); // Set background color
        add(cardPanel);
        centerFrame(); // Center the frame on the screen
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (authenticate(username, password)) {
                messageLabel.setText("Login successful!");
                dispose(); // Close the login window
                openPasswordManager();
            } else {
                messageLabel.setText("Invalid username or password.");
            }
        }
    }

    private boolean authenticate(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("credentials.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void openPasswordManager() {
        // Open the password manager directly
        PasswordManager passwordManager = new PasswordManager();
        passwordManager.setVisible(true);
    }

    // Method to center the frame on the screen
    private void centerFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        setLocation(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}


