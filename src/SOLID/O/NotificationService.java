package SOLID.O;

/**
 * Benefit
 * The NotificationService class can now be extended to support new notification types without modifying existing code.
 * This adheres to the OCP, making the system more flexible and maintainable.
 */
public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String username) {
        notification.send(username);
    }
}

interface Notification {
    void send(String username);
}

class EmailNotification implements Notification {
    @Override
    public void send(String username) {
        //logic
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String username) {
        //logic
    }
}
