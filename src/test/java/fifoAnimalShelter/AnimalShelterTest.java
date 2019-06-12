package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void animalShelter_testEnqueueDequeueCat(){
        AnimalShelter animalShelter = new AnimalShelter();
        Cat bob = new Cat("bob");
        animalShelter.enqueue(bob);
        assertEquals("Should return bob", "bob", animalShelter.dequeue(bob).toString());
    }

    @Test
    public void animalShelter_testEnqueueDequeueDog(){
        AnimalShelter animalShelter = new AnimalShelter();
        Dog fido = new Dog("fido");
        animalShelter.enqueue(fido);
        assertEquals("Should return fido", "bob", animalShelter.dequeue(fido).toString());
    }

    @Test
    public void animalShelter_testEnqueue(){
        AnimalShelter animalShelter = new AnimalShelter();

        assertEquals("Should return null", null, animalShelter.dequeue());















    }

}