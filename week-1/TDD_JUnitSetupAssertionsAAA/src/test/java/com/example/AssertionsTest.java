package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AssertionsTest {
    @Test
    public void testJUnit5Assertions() {
        assertEquals(10, 5 + 5);
        assertTrue(10 > 5);
        assertFalse(5 > 10);
        Object objNull = null;
        assertNull(objNull);
        Object objNotNull = new Object();
        assertNotNull(objNotNull);
    }
}
