package FACTORY.notification;

import java.util.Scanner;

public class WithOutFactory {
    public static void main(String[] args) {
        Notification notification = null;

        Scanner scanner = new Scanner(System.in);
        String notificationType = scanner.nextLine();
        
        if (notificationType.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("push")) {
            notification = new PushNotification();
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + notification);
        }
        notification.notifyUSer();
    }
}
