package com.tnsif.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assertdemo {

    @Test
    public void testAssertTrue() {
        assertTrue("Hello".contains("e"));    
    }

    @Test
    public void assertEqualsMethod() {
        int x = 1;
        int y = 1;
        assertEquals(x, y);
    }

    @Test
    public void testNull() {
        String s = null;
        assertNull(s);
    }
}
