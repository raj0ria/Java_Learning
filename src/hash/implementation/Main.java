package hash.implementation;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();

        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        map.put("A", "Avocado");  // Test updating a value for the same key
        map.put(null, "NullKey"); // Test null key

        map.printHashMap();
    }
}
