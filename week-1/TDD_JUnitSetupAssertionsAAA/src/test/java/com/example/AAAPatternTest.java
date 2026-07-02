package com.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class AAAPatternTest {
    private List<String> testList;
    @BeforeEach
    public void setUp() {
        testList = new ArrayList<>();
        testList.add("Item 1");
    }
    @AfterEach
    public void tearDown() {
        testList.clear();
        testList = null;
    }
    @Test
    public void testListAdditionUsingAAA() {
        String itemToAdd = "Item 2";
        int expectedSize = 2;
        testList.add(itemToAdd);
        assertEquals(expectedSize, testList.size());
        assertTrue(testList.contains("Item 2"));
    }
}
