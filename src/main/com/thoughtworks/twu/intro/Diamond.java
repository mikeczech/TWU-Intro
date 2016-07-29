package com.thoughtworks.twu.intro;

import com.sun.tools.javac.util.Pair;
import com.sun.xml.internal.ws.util.StreamUtils;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Diamond {

    private static void printWhitespaces(int n) {
        IntStream.range(0, n).forEach(i -> System.out.print(" "));
    }

    public static void printIsoscelesTriangle(int n) {
        Stream<Integer> whitespaceCountStream = IntStream.iterate(n-1, i -> i - 1).limit(n).boxed();
        Stream<Integer> asteriskCountStream = IntStream.iterate(1, i -> i + 2).limit(n).boxed();
        Utils.zip(whitespaceCountStream, asteriskCountStream).forEach(pair -> {
            printWhitespaces(pair.fst);
            Triangle.printHorizontalLine(pair.snd);
        });
    }

    public static void printDiamond(int i) {

    }
}
