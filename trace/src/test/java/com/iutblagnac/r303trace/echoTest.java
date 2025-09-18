package com.iutblagnac.r303trace;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple App.
 */
public class echoTest 
    extends TestCase
{
    @Test
    public void testHello() {
        assertEquals("Salut", echo.hello("Salut"));
        assertEquals("Hello World!", echo.hello("Hello World!"));
    }
}
