package SOLID.D;

/**
 * The NotificationService class directly depends on the concrete implementations of EmailNotification and SMSNotification.
 * This violates the DIP because if a new Notification type is introduced, the NotificationService class must be modified.
 */
public class Main_ {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hi, welcome to team blue!", "EMAIL");
    }
}

class EmailNotification {
    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification {
    public void sendSMS(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private EmailNotification emailNotification;
    private SMSNotification smsNotification;

    public NotificationService() {
        this.emailNotification = new EmailNotification();
        this.smsNotification = new SMSNotification();
    }

    public void sendNotification(String message, String type) {
        if (type.equals("EMAIL")) {
            emailNotification.sendEmail(message);
        } else if (type.equals("SMS")) {
            smsNotification.sendSMS(message);
        }
    }
}

