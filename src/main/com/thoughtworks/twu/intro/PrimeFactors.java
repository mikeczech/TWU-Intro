package com.thoughtworks.twu.intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeFactors {

    private static List<Integer> computeFactorsOf(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).boxed().collect(Collectors.toList());
    }

    private static boolean isPrime(int n) {
        return computeFactorsOf(n).equals(Arrays.asList(1, n));
    }

    public static List<Integer> factorize(int n) {
        return computeFactorsOf(n).stream().filter(i -> isPrime(i)).collect(Collectors.toList());
    }

}
