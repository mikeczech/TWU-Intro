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
        Diamond.printIsoscelesTriangle(3, false, false);
        assertEquals("  *\n ***\n*****\n", outContent.toString());
    }

    @Test
    public void testPrintDiamond() {
        Diamond.printDiamond(3);
        assertEquals("  *\n ***\n*****\n ***\n  *\n", outContent.toString());
    }

    @Test
    public void testPrintDiamondWithName() {
        Diamond.printDiamondWithName(3);
        assertEquals("  *\n ***\nMike\n ***\n  *\n", outContent.toString());
    }

}