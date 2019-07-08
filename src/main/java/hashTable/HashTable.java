package hashTable;

import java.util.LinkedList;

public class HashTable<T> {

    private static int INIT_TABLE_SIZE = 20;
    private LinkedList<Node<T>>[] bucket;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(){
        this.bucket = new LinkedList[INIT_TABLE_SIZE];
        this.size = 0;
    }

    public int hash(String key){
        int hash = key.hashCode();
        return  Math.abs(hash) % this.bucket.length;
    }

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

    @SuppressWarnings("unchecked")
    public T get(String key){

        int index = hash(key);

        if(this.bucket[index] != null) {
            for (Node node : this.bucket[index]) {
                if(node.key.equals(key)){
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

    public int size(){
        return this.size;
    }

    private static class Node<T> {

        public String key;
        public T value;

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
        hashTable.add("Hamster", "Bally");
        hashTable.add("Hamster", "Snowball");
        hashTable.add("German Shepard", "Germy");
        hashTable.add("Zebra", "Stripes");


        for(LinkedList n :  hashTable.bucket){
            System.out.print(n + ", ");
            if(n != null){
                System.out.println(n.size());
            }
        }



    }
}
