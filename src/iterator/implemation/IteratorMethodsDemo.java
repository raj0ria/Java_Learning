package iterator.implemation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteratorMethodsDemo {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>(List.of("Fix Bug #101", "Code Review", "Write Documentation", "Deploy to Prod", "Send Email"));
        System.out.println(STR."Original list: \{tasks}");

        Iterator<String> itr = tasks.iterator();

        int count = 0;
        while (itr.hasNext()) {
            String currentTask = itr.next();
            System.out.println("Processing: " + currentTask);

            if (currentTask.equals("Write Documentation")) {
                itr.remove();
                System.out.println("Remove the task name 'Write documentation' since its not needed");
            }

            count++;
            if (count==3) break; // Stop loop to demonstrate forEachRemaining later
        }

        System.out.println("-----------------------------");
        System.out.println("Paused iteration. Remaining items exist.");

        // --- METHOD 4: forEachRemaining() ---
        // (Java 8+) Automatically iterates the REST of the list
        System.out.println("Fast-forwarding remaining tasks:");

        itr.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String task) {
                System.out.println(" >> Auto Processing: " + task);
            }
        });

        itr.forEachRemaining(task -> System.out.println("Lambda processing "+task));

        System.out.println("-------------------");
        System.out.println("Final list: " + tasks);
    }
}
