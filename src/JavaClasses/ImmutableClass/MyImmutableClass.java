package JavaClasses.ImmutableClass;

import java.util.*;

/**
 * Immutable class:-
 * 1. Declare the Class as Final: This prevents other classes from subclassing it and altering its behavior.
 * 2. Make Fields Private and Final: This ensures that fields are not accessible directly and are assigned only once.
 * 3. No Setter Methods: Do not provide setter methods. Once the fields are set via the constructor, they cannot be changed.
 * 4. Initialize All Fields via Constructor: Ensure that all fields are initialized during object creation.
 * 5. Ensure Deep Immutability: If your class contains mutable objects, ensure that they are not modified after construction. This can be done by making defensive copies.
 * Example: String, Wrapper
 */
public final class MyImmutableClass {

    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetNameList() {
        return new ArrayList<>(petNameList);
    }
}

class Main {
    public static void main(String[] args) {
        MyImmutableClass myImmutableClass = new MyImmutableClass("PetHome", new ArrayList<>(Arrays.asList("Kalu", "Bhura", "Shyama")));
        System.out.println(myImmutableClass.getPetNameList());
        myImmutableClass.getPetNameList().add("Lalva"); //Checking whether this add
        System.out.println(myImmutableClass.getPetNameList()); //

        Map s = new HashMap<>();
    }
}

/** Usage
 *  1. Configuration Objects:
 *      Immutable configuration objects are used to hold configuration settings that should not change once the application starts.
 *      This ensures that the configuration is consistent throughout the application lifecycle.

 *  2. Data Transfer Objects (DTOs):
 *     DTOs are often used to transfer data between different layers of an application.
 *     Making DTOs immutable ensures that the data remains consistent and is not inadvertently modified.
 */
