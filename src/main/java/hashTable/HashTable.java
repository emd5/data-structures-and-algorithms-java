package hashTable;

import java.util.LinkedList;

/**
 * This is the implementation of the hashtable
 * @param <T>
 */
public class HashTable<T> {

    private static int INIT_TABLE_SIZE = 20;
    private LinkedList<Node<T>>[] bucket;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(){
        this.bucket = new LinkedList[INIT_TABLE_SIZE];
        this.size = 0;
    }

    /**
     * This method accepts a key string and hash the key
     * @param key key string to be hashed
     * @return int the hash value
     */
    public int hash(String key){
        int hash = key.hashCode();
        return  Math.abs(hash) % this.bucket.length;
    }

    /**
     * This method adds a key and a value into the hashtable
     * @param key a string of the key
     * @param value value of T type
     * @return the new node that contains key and value
     */
    public Node<T> add(String key, T value){
        int index = hash(key);

        Node<T> newNode = new Node<>(key,value);

        if(this.bucket[index] == null){
            this.bucket[index] = new LinkedList<>();
        }

        this.bucket[index].add(newNode);
        this.size++;

        return newNode;
    }

    /**
     * This method accepts a key and returns the value of that key.
     * @param key String key of the bucket
     * @return the value of that key
     */
    @SuppressWarnings("unchecked")
    public T get(String key){
        int index = hash(key);

        if(this.bucket[index] != null) {
            for (Node node : this.bucket[index]) {
                if (node.key.equals(key)) {
                    return (T) node.value;
                }
            }
        }
        return null;
    }

    /**
     * This method accepts a key String and returns true if the key is found otherwise return false
     * @param key
     * @return
     */
    public boolean contains(String key){
        int index = hash(key);

        if(this.bucket[index] != null){
            for( Node n : this.bucket[index]){
                if(n.key.equals(key)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This method returns the size of the hashtable
     * @return int size of the hashtable
     */
    public int size(){
        return this.size;
    }

    private static class Node<T> {

        public String key;
        public T value;
        public Node next;

        public Node(String key, T value){
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return this.key + ": " + this.value;
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.add("Yoko", "Rabbit");
        hashTable.add("Miko", "dog");
        hashTable.add("Hamster", "Buttons");
        hashTable.add("Hamster", "Rhino");
        hashTable.add("Hamster", "Sam");
        hashTable.add("Hamster", "Snowball");
        hashTable.add("German Shepard", "Germy");
        hashTable.add("Zebra", "Stripes");

        System.out.println("Get: " + hashTable.get("Hello"));

        for(LinkedList n :  hashTable.bucket){
            System.out.print(n + ", ");
            if(n != null){
                System.out.println(n.size());
            }
        }

    }
}
