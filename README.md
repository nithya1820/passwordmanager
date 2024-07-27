PasswordManager
PasswordManager is a Java application designed to manage and securely store passwords. It includes features like user authentication, password generation, encryption, and a splash screen for an enhanced user experience.

Table of Contents
LoginFrame Class
SplashScreen Class
HashtablePassword Interface
CryptoUtil Class
PasswordGenerator Class
PasswordManager Class
Getting Started
Usage
Contributing
License
LoginFrame Class
This class represents the login window of the application. It extends JFrame and implements ActionListener for handling button clicks.

Features
Text fields for username and password.
A login button.
A message label for displaying login status.
Methods
authenticate: Reads credentials from a file and validates them.
actionPerformed: Handles the login process when the login button is clicked.
SplashScreen Class
This class creates a splash screen displayed when the application starts.

Features
Includes an image, text, progress bar, and a loading animation.
runningPBar: Animates the progress bar until the application finishes loading.
HashtablePassword Interface
This interface defines methods for managing account-password pairs in a hashtable.

Methods
addAccount: Adds a new account-password pair.
getPassword: Retrieves the password for a given account.
removeAccount: Removes an account-password pair.
CryptoUtil Class
This class provides methods for encrypting and decrypting text using a secret key.

Features
Uses the Cipher class and a password-based encryption algorithm (PBEWithMD5AndDES).
Methods
encrypt: Encrypts the given text.
decrypt: Decrypts the given text.
PasswordGenerator Class
This class generates random passwords of specified length.

Features
Uses a combination of uppercase letters, lowercase letters, digits, and special characters.
Methods
generatePassword: Generates a random password based on the specified criteria.
PasswordManager Class
This is the main class representing the password manager application. It extends JFrame and implements ActionListener.

Features
GUI components for generating, encrypting, and managing passwords.
GUI components for adding and retrieving notes.
Methods
StoringGUI: Creates the GUI for storing passwords.
NoteGUI: Creates the GUI for adding notes.
main: Initializes the application by creating instances of the SplashScreen and PasswordManager classes.
Getting Started
Prerequisites
Java Development Kit (JDK) installed on your machine.
A Java IDE or a text editor with Java support.
Installation
Clone the repository:
sh
Copy code
git clone https://github.com/your-username/PasswordManager.git
Navigate to the project directory:
sh
Copy code
cd PasswordManager
Compile the Java files:
sh
Copy code
javac *.java
Run the application:
sh
Copy code
java PasswordManager
Usage
Login: Enter your username and password to access the application.
Splash Screen: A splash screen will be displayed while the application is loading.
Password Management: Use the provided GUI to generate, encrypt, and manage your passwords.
Notes: Add and retrieve notes securely within the application.
