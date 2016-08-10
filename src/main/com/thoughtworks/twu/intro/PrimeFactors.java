package com.thoughtworks.twu.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeFactors {

    public static List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<>();
        for(int i : IntStream.rangeClosed(2, n).toArray()) {
            while(n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

}
