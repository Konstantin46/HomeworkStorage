package ru.digitalleague;

import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class IsInStoke {
    @Test
    public void isinstoke() {
    Storage.addObject("pear", 3);
    assertEquals(Storage.isInStock("pear"),true);
    }

    @Test
    public void isinstoke_2() {
    assertTrue(Storage.isInStock("apple"));
    }

    @Test
    public void isinstoke_3() {
        Storage.addObject("pear", 4);
        Storage.addObject("grape",10);
        assertFalse(Storage.isInStock("apple"));
        assertTrue(Storage.isInStock("pear"));
        assertEquals(Storage.getProductAmount("pear"),4);
        assertTrue(Storage.isInStock("grape"));
        assertEquals(Storage.getProductAmount("grape"),10);
    }
}
