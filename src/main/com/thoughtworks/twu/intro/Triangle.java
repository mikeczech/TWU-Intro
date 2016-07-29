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
        IntStream.range(0, n).forEach(i -> printAsterisk());
    }

    public static void printVerticalLine(int n) {
        IntStream.range(0, n).forEach(i -> {
            printAsterisk();
            if(i < n-1)
                printNewline();
        });
    }

    public static void printRightTriangle(int n) {
        IntStream.range(1, n+1).forEach(i -> {
            printHorizontalLine(i);
            if(i < n)
                printNewline();
        });
    }
}
