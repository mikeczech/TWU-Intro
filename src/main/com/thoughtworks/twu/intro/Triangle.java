package com.thoughtworks.twu.intro;

import java.util.stream.IntStream;

public class Triangle {

    private static void printAsterisk() {
        System.out.print("*");
    }

    private static void printNewline() {
        System.out.print("\n");
    }

    private static boolean isLastIndex(int i, int n) {
        return i == n;
    }

    private static void printNewLineInDependenceOfIndex(int i, int n) {
        if(!isLastIndex(i, n))
            printNewline();
    }

    public static void printHorizontalLine(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> printAsterisk());
    }

    public static void printVerticalLine(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            printAsterisk();
            printNewLineInDependenceOfIndex(i, n);
        });
    }

    public static void printRightTriangle(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            printHorizontalLine(i);
            printNewLineInDependenceOfIndex(i, n);
        });
    }
}
