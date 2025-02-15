package hash.implementation;

import java.util.Objects;

public class MyHashMap<K, V> {

    static class Node<K, V> { //We are using generis because hashmap use can pass anything in key-value pair
        final K key; //once a node is created key needs be immutable(reasoning: you can't change its key only value can be changed but can remove it)
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR_THRESHOLD  = 0.75f;
    private Node<K, V>[] array;
    private int size; //The size variable tracks the number of key-value pairs (or entries) currently stored in the HashMap.

    public MyHashMap() {
        this.array = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode()) % (array.length);
    }

    private void rehash() {
        Node<K, V>[] oldArray = array;
        array = new Node[oldArray.length*2];
        size = 0;

        for (Node<K, V> node : oldArray) {
            while (node != null) {
                put(node.key, node.value);
                node = node.next;
            }
        }
    }

    public void put(K key, V value) {
        if (size > LOAD_FACTOR_THRESHOLD * array.length) {
            rehash();
        }

        int index = hash(key);

        Node<K, V> newNode = new Node<>(key,value);

        if (array[index] == null) {
            array[index] = newNode;
        } else {
            Node<K, V> currentNode = array[index];

            while (currentNode == null) {
                if (Objects.equals(currentNode.key, key)) {
                    currentNode.value = value;
                    return;
                }

                if (currentNode.next == null) {
                    currentNode.next = newNode;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    // Helper method to display key-value pairs
    public void printHashMap() {
        for (int i = 0; i < array.length; i++) {
            Node<K, V> current = array[i];
            if (current != null) {
                System.out.print("Bucket " + i + ": ");
                while (current != null) {
                    System.out.print("[" + current.key + "=" + current.value + "] -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    }




}
