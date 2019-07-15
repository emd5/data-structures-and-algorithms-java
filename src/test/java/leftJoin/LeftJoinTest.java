package leftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void test_leftWithAllJoins(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("flow", "jam");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "test");

        List<String> list = new ArrayList<>();
        list.add("wrath: anger, delight");
        list.add("flow: jam, test");
        list.add("fond: enamored, averse");

        assertEquals("Should equal", list ,  LeftJoin.leftJoin(h1, h2));
    }

    @Test
    public void test_leftWithSomeJoins(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored"); //
        h1.put("wrath", "anger"); //
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "jam");

        List<String> list = new ArrayList<>();
        list.add("diligent: employed, null");
        list.add("outfit: garb, null");
        list.add("wrath: anger, delight");
        list.add("guide: usher, null");
        list.add("fond: enamored, averse");

        assertEquals("Should equal", list ,  LeftJoin.leftJoin(h1, h2));
    }

    @Test
    public void test_leftWithEmptySecondHashMap(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();

        List<String> list = new ArrayList<>();
        list.add("diligent: employed, null");
        list.add("outfit: garb, null");
        list.add("wrath: anger, null");
        list.add("guide: usher, null");
        list.add("fond: enamored, null");

        assertEquals("Should equal", list ,  LeftJoin.leftJoin(h1, h2));

    }

    @Test
    public void test_leftBothEmptyHashMap(){
        HashMap h1 = new HashMap();
        HashMap h2 = new HashMap();

        List<String> list = new ArrayList<>();

        assertEquals("Should equal", list ,  LeftJoin.leftJoin(h1, h2));

    }




}