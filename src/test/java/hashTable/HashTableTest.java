package hashTable;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class HashTableTest {

    /**
     * Adding a key/value to your hashtable results in the value being in the data structure
     * Retrieving based on a key returns the value stored
     * Successfully returns null for a key that does not exist in the hashtable
     * Successfully handle a collision within the hashtable
     * Successfully retrieve a value from a bucket within the hashtable that has a collision
     * Successfully hash a key to an in-range value
     * **/

    // Adding a key/value to your hashtable results in the value being in the data structure
    @Test
    public void addHashTable(){
        HashTable hashTable = new HashTable();
        hashTable.add("Hello", 4);
        hashTable.add("Hello", 5);
        hashTable.add("Buttons", 8);
        hashTable.add("Henry", 8);

        assertTrue("Should return 4",hashTable.size() == 4);
    }

    @Test
    public void getValueFromHashTable(){
        HashTable hashTable = new HashTable();
        hashTable.add("Hello", 4);
        hashTable.add("Hello", 5);
        hashTable.add("Buttons", "The hamster");

        assertTrue("Should return 4", hashTable.get("Hello").equals(4));
        assertTrue("Should return `The hamster`", hashTable.get("Buttons").equals("The hamster"));
    }

    // Successfully returns null for a key that does not exist in the hashtable
    @Test
    public void getNullForUnmatchedKey(){
        HashTable hashTable = new HashTable();
        hashTable.add("Yoko", "Rabbit");
        hashTable.add("Miko", "dog");
        hashTable.add("Buttons", "hamster");

        assertNull("Should return null", hashTable.get("Hello"));
    }

    // Successfully handle a collision within the hashtable
    @Test
    public void testHashCodeWithSameHash(){
        HashTable hashTable = new HashTable();
        int expected = hashTable.hash("Horse");
        int actual = hashTable.hash("Horse");

        assertEquals("Should Equal 13", expected, actual);
    }

    @Test
    public void testHashCodeNotSameHash(){
        HashTable hashTable = new HashTable();
        int expected = hashTable.hash("Horse");
        int actual = hashTable.hash("Horses");

        assertNotEquals("Should Not Equal", expected, actual);
    }

    @Test
    public void testContainsReturnFalse(){
        HashTable hashTable = new HashTable();
        hashTable.hash("Horse");
        hashTable.hash("Hellos");

        assertFalse("Should return ", hashTable.contains("Hello"));
    }

    @Test
    public void getValueFromCollisionKey(){
        HashTable hashTable = new HashTable();
        hashTable.add("Yoko", "Rabbit");
        hashTable.add("Hamster", "Rhino");
        hashTable.add("Hamster", "Hammy");
        hashTable.add("Hamster", "Hammy");
        hashTable.add("German Shepard", "Samantha");
        hashTable.add("Zebra", "Stripes");


        hashTable.get("Hamster");
//        for(String n :  hashTable.get("Hamster")){
//            System.out.print(n + ", ");
//            if(n != null){
//                System.out.println(n.size());
//            }
//        }
    }





}