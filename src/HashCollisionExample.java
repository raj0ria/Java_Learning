class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return age;  // Simplified hash function (not recommended for real use)
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class HashCollisionExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 30);  // Different name, same age (same hash code)

        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("Are person1 and person2 equal? " + person1.equals(person2));

        System.out.println("\nAdding to HashSet:");
        java.util.Set<Person> set = new java.util.HashSet<>();
        set.add(person1);
        set.add(person2);

        for (Person person : set) {
            System.out.println(person);
        }
    }
}
