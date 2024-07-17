package SOLID.S;

/**
 * Issue
 * The UserService class has more than one responsibility:
 * registering the user, saving the user to the database, and sending a welcome email. This violates the SRP.
 *
 */
public class UserService_Not {

    public void registerUser(String userName, String password) {
        saveToDatabase(userName, password);
        sendWelcomeEmail(userName);
    }

    private void saveToDatabase(String username, String password) {
        // logic to save user to database
    }

    private void sendWelcomeEmail(String username) {
        // logic to send welcome email
    }
}

/**
 * 1. Single Responsibility Principle (SRP)
 * What it is?
 * SRP states that a class should have only one reason to change, meaning it should have only one job or responsibility.

 * Why it is used?
 * It is used to ensure that a class is focused on a single task, making the code more maintainable and easier to understand.

 * How it helps?
 * It helps in reducing the complexity of the code, making it easier to test, and minimizing the impact of changes.
 */
