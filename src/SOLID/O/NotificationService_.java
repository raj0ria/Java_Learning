package SOLID.O;

/**
 * Issue
 * The NotificationService class needs to be modified whenever a new Notification type is added, which violates the OCP.
 */
public class NotificationService_ {
   public void sendNotification(String username, String type) {
       if (type.equals("EMAIL")) {
           //logic
       } else if (type.equals("SMS")) {
           //logic
       }
   }
}

/**
 * 2. Open/Closed Principle (OCP)
 * What it is?
 * OCP states that software entities should be open for extension but closed for modification.

 * Why it is used?
 * It is used to allow the behavior of a class to be extended without modifying its source code.

 * How it helps?
 * It helps in adding new functionality without altering existing code, thus reducing the risk of introducing bugs.
 */