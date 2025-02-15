package FACTORY.notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUSer() {
        System.out.println("Sending email Notification");
    }
}
