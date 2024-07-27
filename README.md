## Passwordmanager

LoginFrame class:

This class represents the login window of the application.
It extends JFrame and implements ActionListener for handling button clicks.
It includes components like text fields for username and password, a login button, and a message label.
The authenticate method reads credentials from a file and validates them.
When the login button is clicked, it triggers the actionPerformed method to handle the login process.

SplashScreen class:

This class creates a splash screen that is displayed when the application starts.
It includes an image, text, progress bar, and a loading animation.
The runningPBar method animates the progress bar until the application finishes loading.
HashtablePassword interface:

This interface defines methods for adding, getting, and removing account-password pairs from a hashtable.

CryptoUtil class:

This class provides methods for encrypting and decrypting text using a secret key.
It uses the Cipher class and a password-based encryption algorithm (PBEWithMD5AndDES).

PasswordGenerator class:

This class generates random passwords of specified length using a combination of uppercase letters, lowercase letters, digits, and special characters.

PasswordManager class:

This is the main class representing the password manager application.
It extends JFrame and implements ActionListener.
It includes GUI components for generating, encrypting, and managing passwords, as well as adding and retrieving notes.
The StoringGUI method creates the GUI for storing passwords.
The NoteGUI method creates the GUI for adding notes.
The main method initializes the application by creating instances of the SplashScreen and PasswordManager classes.
