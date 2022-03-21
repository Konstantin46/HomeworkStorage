package ru.digitalleague;

import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertEquals;

public class getFreePlaces {
    @Test
    public void getfreeplaces(){
        Storage.addObject("apple", 1);
        Storage.addObject("pear", 2);
        Storage.addObject("grape", 10);
        assertEquals(Storage.getFreePlaces(),0);
    }
    @Test
    public void getfreeplaces_1(){
        assertEquals(Storage.getFreePlaces(),0);
    }

    @Test
    public void getfreeplaces_2(){
        assertEquals(Storage.getFreePlaces(),3);
    }

}
