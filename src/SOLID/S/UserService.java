package SOLID.S;

/**
 * Benefit
 * Now, each class has a single responsibility:
 * UserService handles user registration, UserRepository handles database operations, and EmailService handles email operations.
 * This makes the code more modular and easier to maintain.
 */
public class UserService {
    private UserRepository userRepository;
    private EmailService emailService;

    public UserService (UserRepository userRepository, EmailService emailService) {
        this.emailService = emailService;
        this.userRepository = userRepository;
    }

    public void registerUser(String username, String pass) {
        userRepository.save(username, pass);
        emailService.sendWelcomeEmail(username);
    }

}

class UserRepository  {
    public void save(String username, String pass) {
        //logic
    }
}

class EmailService {
    public void sendWelcomeEmail(String username) {
        //logic
    }
}
