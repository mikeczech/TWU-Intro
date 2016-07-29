package com.thoughtworks.twu.intro;

import java.util.stream.IntStream;

public class Triangle {

    private static void printAsterisk() {
        System.out.print("*");
    }

    private static void printNewline() {
        System.out.print("\n");
    }

    public static void printHorizontalLine(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> printAsterisk());
    }

    public static void printVerticalLine(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            printAsterisk();
            if(i < n)
                printNewline();
        });
    }

    public static void printRightTriangle(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            printHorizontalLine(i);
            if(i < n)
                printNewline();
        });
    }
}
