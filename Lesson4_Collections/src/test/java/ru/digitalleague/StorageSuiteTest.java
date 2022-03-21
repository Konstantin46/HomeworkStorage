package ru.digitalleague;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddNewObject.class,
        getFreePlaces.class,
        IsInStoke.class,
        RemoverObject.class,
        TestAddObject.class,
        TestAddToExistObject.class
})
public class StorageSuiteTest {
}
