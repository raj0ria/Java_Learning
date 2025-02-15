package FACTORY.notification;

import java.util.Scanner;

public class WithFactoryExample {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        Notification notification = factory.createNotification(type);
        notification.notifyUSer();
    }
}
