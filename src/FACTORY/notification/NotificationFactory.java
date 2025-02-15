package FACTORY.notification;

public class NotificationFactory {

    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
