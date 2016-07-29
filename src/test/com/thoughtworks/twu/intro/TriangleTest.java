package com.thoughtworks.twu.intro;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TriangleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testPrintHorizontalLine() {
        Triangle.printHorizontalLine(8);
        assertEquals("********\n", outContent.toString());
    }

    @Test
    public void testPrintVerticalLine() {
        Triangle.printVerticalLine(3);
        assertEquals("*\n*\n*\n", outContent.toString());
    }

    @Test
    public void testPrintRightTriangle() {
        Triangle.printRightTriangle(3);
        assertEquals("*\n**\n***\n", outContent.toString());

    }

}