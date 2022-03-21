package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class TestAddObject {
    @Before
    public void setUp(){
        Storage.addObject("apple", 1);
        Storage.addObject("pear", 2);
    }
    @Test
    public void testaddobject() {
        Storage.addObject("grape", 10);
        assertEquals(Storage.isInStock("grape"), true);
    }
    @Test
    public void testaddobject_2(){
        Storage.removeObject("apple");
        Storage.addObject("Orange",1);
        assertEquals(Storage.isInStock("apple"),true);
    }
    @Test
    public void testaddobject_3(){
        assertNotSame(Storage.removeObject("apple"),"folse");
    }
}