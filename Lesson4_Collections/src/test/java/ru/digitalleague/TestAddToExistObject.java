package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class TestAddToExistObject {
    @Before
    public void setUp() {
        Storage.addObject("apple", 1);
        Storage.addObject("grape", 1);
    }
    @Test
    public void addtoexistobject(){
        Storage.addObject("apple",2);
        assertSame(Storage.getProductAmount("apple"),3);
    }
    @Test
    public void addtoexistobject_2(){
        assertTrue(Storage.isInStock("pear"));
    }
    @Test
    public void addtoexistobject_3(){
        assertEquals(Storage.getProductAmount("grape"), 3);
    }
}
