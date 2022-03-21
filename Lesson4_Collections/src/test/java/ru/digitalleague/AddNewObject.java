package ru.digitalleague;

import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class AddNewObject {
    @Test
    public void addnewodject(){
        assertTrue(Storage.addObject("apple",10));
    }
    @Test
    public void addnewodject_2(){
        Storage.addObject("apple",1);
        assertEquals(Storage.getProductAmount("apple"),11);
    }
    @Test
    public void addnewodject_3(){
        assertFalse(Storage.removeObject("pear"));
    }
    @Test
    public void addnewodject_4(){
       assertFalse(Storage.isInStock("pear"));
    }
    @Test
    public void addnewodject_5(){
        Storage.addObject("pear",6);
        Storage.addObject("pear",4);
        assertEquals(Storage.isInStock("pear"),true);
        assertSame(Storage.getProductAmount("pear"),10);
    }
}
