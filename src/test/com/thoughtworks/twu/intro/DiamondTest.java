package com.thoughtworks.twu.intro;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DiamondTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testPrintIsoscelesTriangle() {
        Diamond.printIsocelesTriangle(3);
        assertEquals("  *\n ***\n*****", outContent.toString());
    }

}