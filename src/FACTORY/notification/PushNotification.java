package FACTORY.notification;

public class PushNotification implements Notification{

    @Override
    public void notifyUSer() {
        System.out.println("Sending push notification");
    }
}
