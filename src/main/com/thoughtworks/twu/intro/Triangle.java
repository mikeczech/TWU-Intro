package com.thoughtworks.twu.intro;

import java.util.stream.IntStream;

public class Triangle {

    public static void printAsterisk() {
        System.out.print("*");
    }

    public static void printNewline() {
        System.out.print("\n");
    }

    public static void printHorizontalLine(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> printAsterisk());
        printNewline();
    }

    public static void printVerticalLine(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            printHorizontalLine(1);
        });
    }

    public static void printRightTriangle(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            printHorizontalLine(i);
        });
    }
}
