package SOLID.D;

public class Main {
}

interface Notification {
    void send(String message);
}

class EmailNotification_ implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email sent");
    }
}

class SMSNotification_ implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS sent");
    }
}

class NotificationServices_ {
    private Notification notification;

    public NotificationServices_(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message) {
        notification.send(message);
    }
}
