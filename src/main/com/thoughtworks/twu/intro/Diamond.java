package com.thoughtworks.twu.intro;

import com.sun.tools.javac.util.Pair;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Diamond {

    private static void printWhitespaces(int n) {
        IntStream.range(0, n).forEach(i -> System.out.print(" "));
    }

    private static void printMyName() {
        System.out.println("Mike");
    }

    public static void printIsoscelesTriangle(int n, boolean reversed, boolean shift) {
        Stream<Integer> whitespaceCounts = IntStream.iterate(n-1, i -> i - 1).limit(n).boxed();
        Stream<Integer> asteriskCounts = IntStream.iterate(1, i -> i + 2).limit(n).boxed();
        List<Pair<Integer,Integer>> zipped =
                Utils.zip(whitespaceCounts, asteriskCounts).collect(Collectors.toList());
        if(reversed)
            Collections.reverse(zipped);
        zipped.forEach(pair -> {
            if(shift)
                printWhitespaces(pair.fst + 1);
            else
                printWhitespaces(pair.fst);
            Triangle.printHorizontalLine(pair.snd);
        });
    }

    public static void printDiamond(int n) {
        printIsoscelesTriangle(n - 1, false, true);
        Triangle.printHorizontalLine(n + 2);
        printIsoscelesTriangle(n - 1, true, true);
    }

    public static void printDiamondWithName(int n) {
        printIsoscelesTriangle(n - 1, false, true);
        printMyName();
        printIsoscelesTriangle(n - 1, true, true);
    }
}
