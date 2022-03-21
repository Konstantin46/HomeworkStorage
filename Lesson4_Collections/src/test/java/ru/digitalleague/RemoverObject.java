package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;
import static org.junit.Assert.*;



public class RemoverObject {
    @Before
    public void setUp() {
       Storage.addObject("apple",2);
       Storage.addObject("pear", 1);
    }
    @After
    public void getUp () {
        Storage.removeObject("apple");
        }
   @Test
   public void removeObject () {
        Storage.removeObject("pear");
        assertSame(Storage.isInStock("pear"),"pear");
        }
   @Test
    public void removeObject_2 (){
       assertTrue(Storage.isInStock("apple"));
   }
   @Test
    public void removeObject_3 (){
        Storage.removeObject("apple");
       assertNotNull(Storage.removeObject("apple"));
   }
}

